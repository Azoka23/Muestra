package ej4guia4;

import java.util.Scanner;

public abstract class Personaje {

    protected Position ubicacion;

    protected String nick;

    protected int vidas=3;

    protected int energia=100;

    protected char orientacion='n';
    
   

    public Personaje(Position ubicacion, String nick) {
        //this.ubicacion = new Position(0,0);
        this.ubicacion=ubicacion;
        this.nick=nick;
        
    }

    
    public Position getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Position ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public char getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(char orientacion) {
        this.orientacion = orientacion;
    }
    
    

    public void disparar(int disparo) {
        
        int cont=0;
        do{
            disparo-=1;
        energia-=10;
        cont+=1;
        } while(disparo!=0 && energia>0);
        System.out.println(energia);
        System.out.println("Ha realizado "+cont +" disparos , pero aun le quedan "+(10-cont));
        System.out.println("Le han quedado "+disparo+ " sin realizar por falta de energia");
    }

    public void girar() {
        
        switch (orientacion){
            case 'n' :
                orientacion='e';
                break;
            case 'e':
                orientacion='s';
                break;
            case 's':
                orientacion='o';
                break;
            case 'o':
                orientacion='n';
            default :
                orientacion='n';
        }
        System.out.println(orientacion);
    }

    public void avanzar() {
         switch (orientacion){
            case 'n' :
             ubicacion.setY(ubicacion.getY()+1);
                break;
            case 'e':
                ubicacion.setX(ubicacion.getX()+1);
                break;
            case 's':
                ubicacion.setY(ubicacion.getY()-1);
                break;
            case 'o':
               ubicacion.setX(ubicacion.getX()-1);
            default :
                orientacion='n';
        }
         System.out.println(orientacion);
         System.out.println(" X= "+ubicacion.getX());
         System.out.println(" Y= "+ubicacion.getY());
    }
}
