/*En un nuevo proyecto, crear una clase de nombre Fecha con los
siguientes atributos: dia, mes, año; un constructor que permita 
inicializar a todos sus atributos; los métodos getter y setter para
sus atributos y los siguientes métodos adicionales:
 esBisiesto(): Este método retornará true si el año de esta Fecha 
es bisiesto; caso contrario
retornará false.
 calcularAños(): Este método recibirá un objeto del tipo Fecha y 
retornará un entero que
será la cantidad de años transcurridos entre esta Fecha y la que 
recibe por parámetro. Luego desde la clase principal del proyecto 
(la que contiene el método main) se pide:
a) Crear dos objetos de tipo fecha. Utilizando sus métodos:
b) Mostrarporconsolasilaprimerafechaylasegundacorrespondenaaños
bisiestos.
c) Mostrar por consola, la cantidad de años transcurridos entre 
la primera fecha y la segunda.
 * 
 */

package ejercicio9.segundaparte;

/**
 *
 * @author marcelaaliciaarroyo
 */

public class Ejercicio9Segundaparte {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      Fecha fecha1=new Fecha(10,4,2020);
        Fecha fecha2=new Fecha(8,9,2022);
        System.out.println("El año " + fecha1.getyear() +" es bisiesto?" + fecha1.esBisiesto(fecha1));
        System.out.println("El año " + fecha2.getyear() +" es bisiesto?" + fecha2.esBisiesto(fecha2));
        System.out.println("La diferencia de años es " + fecha1.cantidadYear(fecha2));
        
    }
    
}
