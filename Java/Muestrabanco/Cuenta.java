package Muestrabanco;

import Muestrabanco.Cliente;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.LinkedList;
import java.util.Scanner;

public class Cuenta {

    private long numero;

    private double saldo;

    private double interesesAnual;

    private Cliente titular;

    private LinkedList<Movimiento> movimientos = new LinkedList();

    public Cuenta(long numero, Cliente titular) {
        //this.movimientos = new LinkedList();
//no es buena practica hacerlo aca
        this.numero = numero;
        this.titular = titular;
    }

    public Cuenta() {

    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteresesAnual() {
        return interesesAnual;
    }

    public void setInteresesAnual(double interesesAnual) {
        this.interesesAnual = interesesAnual;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public LinkedList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(LinkedList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
    Scanner entrada = new Scanner(System.in);

    public void intro() {
        char eleccion = 's';

        while (eleccion == 's') {
            System.out.println("*********************************************");
            System.out.println("*               Banca Online                *");
            System.out.println("*          Bienvenido"+ titular.getNombre().toUpperCase()+ "                        *");
            System.out.println("*" + LocalDate.now() + "                                 *");
            System.out.println("*" + LocalTime.now() + "                               *");
            System.out.println("*********************************************");
            System.out.println("* 1-Depositos                               *");
            System.out.println("* 2-Extracciones                            *");
            System.out.println("* 3-Saldos                                  *");
            System.out.println("* 4-Ultimos movimientos                     *");
            System.out.println("* 5-Ver titular                             *");

            System.out.println("*********************************************");

            int opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad que desea depositar ");
                    depositar(entrada.nextDouble());
                    System.out.println(" Su deposito se ha registrado correctamente ");
                    eleccion = finalizar();
                    break;

                case 2:
                    System.out.println("Ingrese la cantidad que desea extraer ");
                    extraer(entrada.nextDouble());
                    System.out.println(" Su extraccion se ha registrado correctamente ");
                    eleccion = finalizar();
                    break;

                case 3:
                    System.out.println(" Su saldo actual es " + verSaldo());
                    eleccion = finalizar();
                    break;

                case 4:
                    listarMovimientos();
                    eleccion = finalizar();
                    break;

                case 5:
                    System.out.println(verTitular());
                    eleccion = finalizar();
                    break;

            }
        }
    }

    public char finalizar() {

        System.out.println("Quiere continuar operando s/n");

        if (entrada.next().toLowerCase().charAt(0) != 's') {
            System.out.println(" Hasta pronto!!");
            return 'n';
        } else {
            return 's';

        }

    }

    public void depositar(double cantidad) {

        this.saldo += cantidad;//acumulador
        agregarMovimiento(cantidad);
        System.out.printf("El deposito es de %,.2f pesos%n ",cantidad);
//para visualizar mejor la escritura de los numeros
        
    }

    public void agregarMovimiento(double cantidad) {
        movimientos.add(new Movimiento(LocalDate.of(2023, Month.MARCH, 20), 'D', cantidad, saldo));

    }

    public void extraer(double cantidad) {

        if (cantidad < this.saldo) {
            this.saldo -= cantidad;
            System.out.println("la extraccion realizada fue de " + cantidad + " pesos ");
            agregarMovimiento(cantidad);

        } else {
            System.out.println(" El saldo es insuficiente para realizar la extraccion ");
            System.out.println(" Intenta con un valor menor ");
        }
    }

//    private void cambiarInteresesAnual(double valor) {
//        
//    }

   public Cliente verTitular() {
       
       
    return this.titular;
   }
    public double verSaldo() {
        return saldo;
    }

    public void listarMovimientos() {
        System.out.println("Los movimientos realizados son : ");
        for (Movimiento aux : movimientos) {
            System.out.println(aux);
            System.out.println(" ");
            
        }
        System.out.println(movimientos.size());
    }
    
}
