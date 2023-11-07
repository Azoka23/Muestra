package ej3guia5_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

public class Ej3Guia5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cine cine = new Cine("RomaSRL", "Rivadavia 325");
        Scanner entrada = new Scanner(System.in);
        char eleccion ='s';
        while (eleccion == 's') {
            System.out.println("Ingresa el titulo de la pelicula");
            String titulo = entrada.nextLine();
            
            System.out.println("Ingresa el nombre del director");
            String nombreDirector = entrada.nextLine();
            System.out.println("Ingresa la duracion de la pelicula en minutos");
            int duracion = entrada.nextInt();
            Pelicula pelicula = new Pelicula(titulo, nombreDirector, duracion);
            cine.agregarPelicula(pelicula);

            System.out.println("Desea ingresar otra pelicula s/n");
            eleccion = entrada.next().charAt(0);
            entrada.nextLine();
        }System.out.println("Las peliculas que duran mas son "+cine.listarDuranMas(60, 1));
            System.out.println("Listado de peliculas : "+cine.listarTodo());
        
        cine.listarOrdenadasPorTituloAZ();
        System.out.println(" ");
        cine.listarOrdenadasDuracion();
        System.out.println(" ");
        cine.listarOrdenadasPorDirectorAZ();
       
//    }
//    public static void  fabricarpeliculas(int cantidad,Cine cine){
//        
//    for( int i=1;i<=cantidad;i++){
//        
//       Pelicula pelicula =new Pelicula("Star wars"+i,"Lucas"+i,(int)(Math.random()*101));
//       cine.agregarPelicula(pelicula);
//    }
//   
//    }
    }
}
