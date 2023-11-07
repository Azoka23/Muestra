
package ej3extraguia5_2;

import java.util.HashSet;
import java.util.Scanner;



public class Ej3extraGuia5_2 {

    static Scanner entrada=new Scanner(System.in);
 
    
    public static void main(String[] args) {
        
         HashSet<Libros>libritos =new HashSet();
         
        char eleccion='s';
        while(eleccion=='s'){
            System.out.println("************LIBROS****************");
            System.out.println("1-Agregar libros a la biblioteca");
            System.out.println("2-Prestamo de libros");
            System.out.println("3-Devolucion de libros ");
            System.out.println("4-Informacion de libros");
            System.out.println("5-Libros disponibles");
                   
            int opcion=entrada.nextInt();
            entrada.nextLine();
            switch (opcion){
                case 1:
                  System.out.println("Ingresa el titulo del libro");
            String titulo=entrada.nextLine().toLowerCase();
            System.out.println("Ingresa el nombre del autor ");
            String autor=entrada.nextLine().toLowerCase();
            System.out.println("Ingresa la cantidad total de ejemplares ");
            int nroEjemplares=entrada.nextInt();
            System.out.println("Ingresa la cantidad de ejemplares prestados ");
            int nroEjemplaresPrestados=entrada.nextInt();
            
            Libros libro=new Libros(titulo,autor,nroEjemplares,nroEjemplaresPrestados);
            libritos.add(libro);
            eleccion=finalizar();
            
            
                case 2:
                    
                case 3:
                    
                case 4:
                    System.out.println("Ingrese el titulo del libro ");
                     titulo=entrada.nextLine();
                     if(libritos.equals(titulo)){
                     titulo.toString();
                     }
                      eleccion=finalizar();
            
                    
                case 5:
                    
                    
            }
            
            
            
        }
    }
    
    public static char finalizar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quiere continuar operando s/n");

        if (entrada.next().toLowerCase().charAt(0) != 's') {
            System.out.println(" Hasta pronto!!");
            return 'n';
        } else {
            return 's';

        }
    
}
}
