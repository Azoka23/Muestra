
package Muestrabanco;

import java.time.LocalDate;
import java.time.Month;


public class Ej2Guia5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Cliente titular=new Cliente("Juan","Lucero","Merlo",LocalDate.of(1978, Month.JULY, 25));
    Cuenta cuenta1=new Cuenta(1234, titular);
//    cuenta1.depositar(60000);
//        System.out.println(" ");
//    cuenta1.extraer(10000);
//        System.out.println(" ");
//        System.out.println("El saldo es de "+cuenta1.verSaldo()+" pesos ");
//        System.out.println(" ");
//        cuenta1.listarMovimientos();
    
cuenta1.intro();
}
}