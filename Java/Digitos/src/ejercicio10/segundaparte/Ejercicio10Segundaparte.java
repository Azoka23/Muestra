/*
 * En un nuevo proyecto, crear una clase de nombre Pensador 
con un atributo que almacenará un valor entero; un constructor 
que permita inicializar dicho atributo; los métodos get y set 
para dicho atributo y los siguientes métodos adicionales:
 invertir(): Este método retornará el valor guardado en el 
atributo con sus cifras invertidas. Por ejemplo si el valor 
guardado es 3915, retornará 5193
 parAntes(): Este método retornará el valor par próximo anterior
al valor guardado.
 parPosterior(): Este método retornará el valor par próximo 
posterior al valor guardado.
 primerDigito(): Este método retornará el primer dígito del 
valor guardado.
 ultimoDigito(): Este método retornará el último dígito del 
valor guardado.
Luego desde la clase principal del proyecto (la que contiene 
el método main) se pide:
a) Crear una instancia de la clase Pensador.
b) Probartodossusmétodosymostrarporconsolalosresultadosobtenidos.


 */
package ejercicio10.segundaparte;

/**
 *
 * @author marcelaaliciaarroyo
 */

import java.util.Scanner;
public class Ejercicio10Segundaparte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       int numero=0;
        System.out.println("Ingresa un numero");
        numero=entrada.nextInt();
       
        Pensador piensa1=new Pensador();
        //piensa1.ultimoDigito(234);
        piensa1.invertir(numero);
        System.out.println("El ultimo digito es " + piensa1.ultimoDigito(numero));
        System.out.println("El primer digito es " + piensa1.primerDigito(numero));
        System.out.println("El numero par anterior a  es "+ piensa1.parAntes(numero));
        System.out.println("El numero par posterior a  es "+ piensa1.parPosterior(numero));
    entrada.close();
    
    }
    
}
