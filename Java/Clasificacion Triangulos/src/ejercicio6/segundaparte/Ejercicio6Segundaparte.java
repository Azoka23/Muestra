/*
 * En un nuevo proyecto, crear una clase de nombre Triangulo con los
atributos: lado1, lado2, lado3; un constructor que permita 
inicializar sus atributos; los métodos getter y setter; y los 
siguientes métodos adicionales:
 esUnTriangulo(): Sabiendo que la regla principal que da origen al 
triángulo tiene que ver con la longitud de sus lados. Esta plantea 
que la suma de dos de sus lados debe ser mayor a la longitud del
tercer lado. Por lo tanto si los valores de los lados de este 
triángulo cumplen con la regla este método retornará true caso 
contrario false.
 tipoTriangulo(): Si es un triángulo y tiene sus tres lados 
iguales, este método retornará equilátero; si sus tres lados son 
distintos, retornará “escaleno”; caso contrario, es decir, si sólo 
dos de sus lados son iguales, retornará “isósceles”; en el caso de 
que no sea un triángulo, retornará “Con sus lados no se puede 
representar un triángulo!!!”
Luego desde la clase principal del proyecto (la que contiene el 
método main) se pide:
a) Crear un objeto Triángulo válido.
Luego utilizando sus métodos:
b) Mostrarporconsolaquetipodetriánguloes.
c) Crear un objeto Triángulo inválido.
Luego utilizando sus métodos:
d) Mostrarporconsolaquetipodetrianguloes.

 */
package ejercicio6.segundaparte;

/**
 *
 * @author marcelaaliciaarroyo
 */
public class Ejercicio6Segundaparte {

    /**/
    public static void main(String[] args) {
        
        Triangulo triangu=new Triangulo(3,4,5);
        triangu.esUnTriangulo();
        System.out.println("Se puede formar un triangulo con estas medidas?"+triangu.esUnTriangulo());
        triangu.tipoTriangulo();
    }
    
}
