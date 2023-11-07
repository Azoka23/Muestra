package ej1extraguia5;

//import com.sun.javafx.collections.ElementObservableListDecorator;
import java.util.Stack;

public class Ej1extraGuia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila pila1=new Pila(6);
        pila1.agregar("elemento1");
        pila1.agregar("elemento2");
        pila1.agregar("elemento3");
        pila1.agregar("elemento4");
        pila1.agregar("elemento5");
        pila1.agregar("elemento6");
        System.out.println(pila1.pilaLlena()); 
        System.out.println(pila1.vertope());
        //System.out.println(pila1.quitar());
        
        System.out.println(pila1.pilaVacia());
        pila1.vaciarPila();
        

        
        
//        //creo la lista 
//        Stack<String> pila = new Stack<String>();
//        //agrego elementos
//        pila.push("elemento1");
//        pila.push("elemento2");
//        pila.push("elemento3");
//        pila.push("elemento4");
//        pila.push("elemento5");
//        System.out.println("1-push " + pila);
//        //retiro elementos
//        pila.pop();//saco un elemento
//        
//        System.out.println("2-pop " + pila);
//        //pila.pop();//saco otro elemento
//        //devuelve todos los elementos que quedan en la pila
//        String x = pila.peek();
//        
//        System.out.println("3-peek " + x);
//        //devuelve si la pila esta vacia
//        boolean y = pila.empty();
//        System.out.println("4-empty " + y);

    }

}
