/*En un nuevo proyecto crear una clase de nombre Cuadrilatero con los atributos largo
y alto, un constructor que permita inicializar dichos atributos, sus respectivos getter
y setter y los siguientes métodos adicionales:
 calcularPerimetro(): este método retornará el perímetro del cuadrilátero.
 calcularArea(): este método retornará la superficie del cuadrilátero.
 esUnCuadrado(): este método retornará true si este cuadrilátero es un cuadrado, caso 
contrario retornará false.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear un objeto Cuadrilatero con largo 70 y altura 50; Luego utilizando sus métodos:
a) Mostrar por consola su perímetro
b) Mostrarporconsolasusuperficie.
c) Mostrar por consola si es un cuadrado o no.
d) Cambiarelestadodeunodesusatributosparaqueseauncuadrado.

 * 
 */
package ejercicio2.segundaparte;

/**
 *
 * @author marcelaaliciaarroyo
 */
public class Ejercicio2Segundaparte {

   
    public static void main(String[] args) {
      Cuadrilatero cuadri=new Cuadrilatero(70,50) ;
        System.out.println("El perimetro es "+cuadri.calcularPerimetro());
        System.out.println("El area es "+cuadri.calcularArea(cuadri.getAlto(), cuadri.getLargo()));
        System.out.println("El cuadrilatero es cuadrado?"+cuadri.esUnCuadrado(70, 50));
        cuadri.setAlto(70);
        System.out.println("El cuadrilatero es cuadrado?"+cuadri.esUnCuadrado(cuadri.getAlto(),cuadri.getLargo()));
    }
    
}
