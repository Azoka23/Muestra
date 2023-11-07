package ej3guia5_2;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;


import java.util.List;

public class Cine  {
    
            
    private String nombre;
    private String direccion;
    ArrayList<Pelicula> proyecciones = new ArrayList();
    

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Cine() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Pelicula> getProyecciones() {
        return proyecciones;
    }

    public void setProyecciones(ArrayList<Pelicula> proyecciones) {
        this.proyecciones = proyecciones;//podria no estar porque voy a usar agregar pelicula
    }

    public void agregarPelicula(Pelicula pelicula) {
        proyecciones.add(pelicula);
    }

    public ArrayList<Pelicula> listarTodo() {
        return proyecciones;
    }
//segunda opcion
//    public void listaTodo(){
//    for(Pelicula pelicula: proyecciones){
//        System.out.println("titulo"+pelicula.getTitulo());
//    System.out.println("director"+pelicula.getDirector());
//    }
//    }
    public void mostrarPeliculas() {// segunda opcion
        for (Pelicula pelicula : proyecciones) {
            System.out.println(pelicula);
        }
    }

    public List<Pelicula> listarDuranMas(int duracion, int opcion) {//todo en minutos
        List<Pelicula> peliculas = new ArrayList();
        for (Pelicula pelicula : proyecciones) {
            if (opcion == 1) {

                if (duracion < pelicula.getDuracion()) {
                    peliculas.add(pelicula);//guarda las pelis
                    System.out.println(pelicula.getTitulo());
                }
            }

            if (opcion == 0) {

                if (duracion == pelicula.getDuracion()) {
                    peliculas.add(pelicula);//guarda las pelis
                    System.out.println(pelicula.getTitulo());
                }

            }
            if (opcion == -1) {

                if (duracion > pelicula.getDuracion()) {
                    peliculas.add(pelicula);//guarda las pelis
                    System.out.println(pelicula.getTitulo());
                }

            }

        }

        return peliculas;
    }
 //segunda opcion 
    public void listaMenorDuracion(){
    
    }
    
     
    
    
    
    public void listarOrdenadasDuracion(){
        Collections.sort(proyecciones,ordenarDuracion);
       proyecciones.forEach(System.out::println);
    }
    
      public static Comparator<Pelicula> ordenarDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
         if(o1.getDuracion() < o2.getDuracion()) return -1;
if(o1.getDuracion() == o2.getDuracion()) return 0;
return 1;  
        }
        
    };
     
    
    
    public void listarOrdenadasPorTituloAZ(){
        Collections.sort(proyecciones,ordenarTitulo);
       proyecciones.forEach(System.out::println);
    }
    
    public void listarOrdenadasPorDirectorAZ(){
        Collections.sort(proyecciones,ordenarDirector);
       proyecciones.forEach(System.out::println);
    }
    
    //clase anonima
    public static Comparator<Pelicula> ordenarTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
         return o1.getTitulo().compareTo(o2.getTitulo());   
        }
        
    };

    
public static Comparator<Pelicula> ordenarDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
         return o1.getDirector().compareTo(o2.getDirector());   
        }
        
    };              

    

    
    
}
