/*
 * 
 */
package ej4u;

/**
 *
 * @author marcelaaliciaarroyo
 */
public class Bateria {

    private double carga;

    public Bateria() {
        this.carga = 1000.00;//inicializo la carga en el constructor
    }

    public Bateria(double carga) {

        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

}
