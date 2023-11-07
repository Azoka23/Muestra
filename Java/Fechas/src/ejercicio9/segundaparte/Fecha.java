/*
 * 
 */
package ejercicio9.segundaparte;

/**
 *
 * @author marcelaaliciaarroyo
 */
import java.util.*;
public class Fecha {
    private int dia;
    private int mes;
    private int year;
    
    public Fecha(){
    }
    
    public Fecha(int dia,int mes,int year){
    this.dia=dia;
    this.mes=mes;
    this.year=year;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getyear() {
        return year;
    }

    public void setyear(int year) {
        this.year = year;
    }
    
    
    public boolean esBisiesto(Fecha fecha1){
    if(year%4==0){
        return true;
    }else return year%100==0 && year%400==0;
    }
    
    
    
   public  int cantidadYear( Fecha fecha1){
   return Math.abs(this.year-fecha1.year);
    }
}
