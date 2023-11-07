/*
 * 
 */
package ej4u;

/**
 *
 * @author marcelaaliciaarroyo
 */
public class TestJuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Robot robot1 = new Robot();
        
        Hombre hombre1 = new Hombre(robot1);
        hombre1.JugarConRobot(robot1);
        System.out.println(" ");
        System.out.println("Hola bienvendo jugador 2");
        Hombre hombre2 = new Hombre(robot1);
        hombre2.JugarConRobot(robot1);
        robot1.bateriaActual();

    }

}
