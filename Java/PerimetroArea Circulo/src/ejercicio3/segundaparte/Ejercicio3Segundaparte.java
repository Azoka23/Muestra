/*En un nuevo proyecto, crear una clase de nombre Circulo, con 
los atributos PI que es una constante con el valor 3.14 y radio;
un constructor que permita inicializar el radio del círculo; los 
métodos “get” y “set” para radio y los siguientes métodos 
adicionales:
 calcularArea(): este método retornará la superficie del círculo.
 calcularPerímetro(): este método retornará el perímetro del 
círculo.
Luego desde la clase principal del proyecto (la que contiene el 
método main) se pide:
a) Crear un objeto Circulo con radio 5.75 ; Luego utilizando sus 
métodos:
b) Mostrarporconsolasuperímetro
c) Mostrar por consola su superficie.

 * 
 */
package ejercicio3.segundaparte;

/**
 *
 * @author marcelaaliciaarroyo
 */
public class Ejercicio3Segundaparte {

    
    public static void main(String[] args) {
        Circulo circle=new Circulo(5.75);
        System.out.println("El area del circulo es "+circle.calcularArea());
        System.out.println("El perimetro del circulo es "+circle.calcularPerimetro());
    }
    
}
