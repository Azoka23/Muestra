/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8.segundaparte;

/**
 *
 * @author marcelaaliciaarroyo
 */

import static java.lang.Math.*;
public class Calculo {
    
    public static boolean esPrimo(int numero){
    int contador=0;
    for(int i=1;i<=6;i++){
    if(numero%i==0){
    contador++;
    }
    }
    if(contador<=2){
        return true;  
    }else{
    return false;   
    }
    }
   
    /**
     *
     * @param numero
     */
    public static void valorAbsoluto(int numero){
    if(numero>=0){
        System.out.println("El valor absoluto de "+ numero+" es "+numero);
    }else{
        System.out.println("El valor absoluto de "+ numero+" es "+ abs(numero));
      }
    }
    
    

public static void calcularRaices(double a,double b, double c){
   
    double raiz1=((-b+sqrt(b*b-4*a*c))/2*a);
    double raiz2=((-b-sqrt(b*b-4*a*c))/2*a);
    System.out.println("La raiz x1 vale " + raiz1);
    System.out.println("La raiz x2 vale " + raiz2);
    }
    
}
