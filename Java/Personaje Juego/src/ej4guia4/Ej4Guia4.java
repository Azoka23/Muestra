/*
 * 
 */
package ej4guia4;

import java.util.Scanner;

/**
 *
 * @author marcelaaliciaarroyo
 */
public class Ej4Guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa la ubicacion");
        System.out.println("Segun x");
        int x=entrada.nextInt();
        System.out.println("Segun Y");
        int y=entrada.nextInt();
        System.out.println("Tenes caballo true/false");
        boolean caballo=entrada.nextBoolean();
    
        
        
        Position ubi=new Position(x,y);
        Guerrero thor=new Guerrero(true, ubi, "nick");
        thor.girar();
        thor.avanzar();
        thor.disparar(11);
        System.out.println(thor.caballo());
        
    }
    
}
