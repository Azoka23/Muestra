/*
 * 
 */
package ej4u;

import java.util.Scanner;

/**
 *
 * @author marcelaaliciaarroyo
 */
public class Hombre {

    private Robot robot1;//creo el atributo robot para vincular las clases 
    //Hombre/Robot

    public Hombre() {

    }

    public Hombre(Robot robot1) {//paso por parametro en el constructor a robot
        this.robot1 = robot1;
    }

    public void JugarConRobot(Robot robot1) {//creo el metodo y dentro de el 
        //invoco metodos de otra clase(robot) 
        Scanner entrada=new Scanner(System.in);//para ingresar los pasos por consola
        System.out.println("Ingresa tu nombre");
        
        String nombre = entrada.nextLine();
        System.out.println("************************************************");
        System.out.println("***** Hola "+ nombre+ " vamos a jugar con el Robot ****");
        System.out.println("************************************************");
        System.out.println(" ");
        System.out.println("****Ingresa la cantidad de pasos para avanzar****");
        robot1.Avanzar(entrada.nextInt());
        System.out.println(" ");
        System.out.println("***Ingresa la cantidad de pasos para retroceder***");
        robot1.Retroceder(entrada.nextInt());
        System.out.println(" ");
        System.out.println("La bateria actual es "+robot1.bateriaActual());
        robot1.Dormir();
        System.out.println("Estoy agotado voy a dormir...");
        System.out.println(" ");
        System.out.println("Desea que recargue la bateria? s/n ");
       char opcion=entrada.next().charAt(0);//asi me toma la primera letra
            //entonces considera la S o la N, porque next no puede leer char
            if(opcion=='S' || opcion=='s'){
            robot1.Recargar();
                System.out.println(" Cargando mi bateria ...");
       }else{
                System.out.println(" No olvide de recargar mi bateria mas tarde ");
            }
    }

}
