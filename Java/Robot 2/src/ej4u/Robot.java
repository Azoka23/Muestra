/*
 * 
 */
package ej4u;

/**
 *
 * @author marcelaaliciaarroyo
 */
public class Robot {

    private Bateria carga = new Bateria();//instancio un objeto de la clase bateria
    //como atributo para vincular las clases robot/bateria
    private boolean estado;//creo un atributo estado para los metodos boolean

    public Robot() {
        // Bateria carga=new Bateria();

        estado = true;//dentro del constructos inicializo la variable estado
    }

    public Bateria getCarga() {
        return carga;
    }

    public void setCarga(Bateria carga) {
        this.carga = carga;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void Avanzar(int pasos) {
        
     if (estado = true) {
         //System.out.println(pasos);
            if ((carga.getCarga() - 0.1 * pasos) <= 0) {

                System.out.println("La carga  no es suficiente para avanzar");
            } else {
                carga.setCarga((carga.getCarga() - 0.1 * pasos));
                System.out.println("Avanzando " + pasos + " pasos ");
                System.out.println(" ");
                System.out.println("Le queda "+this.bateriaActual()+"unidades de energia");
            }
        } else {
            System.out.println("El robot esta dormido");
        }   

    }

    public void Retroceder(int pasos) {
        if (estado = true) {
            if ((carga.getCarga() - 0.1 * pasos) <= 0) {
                System.out.println(" ");
                System.out.println("La carga  no es suficiente para retroceder");
            } else {
                carga.setCarga((carga.getCarga() - 0.1 * pasos));
                System.out.println("Retrocediendo " + pasos + " pasos ");
            }
        } else {
            System.out.println(" ");
            System.out.println("El robot esta dormido");
        }
    }

    public void Dormir() {
        estado = false;//si se invoca al metodo la variable inicializada
        //verdadera en el constructor se vuelve false
            
    }

    public void Despertar() {
        estado = true;

    }

    public void Recargar() {
        if (carga.getCarga() <= 0 && carga.getCarga() < 1000) {
            System.out.println("Recargando bateria");

            double saldo = 1000 - this.bateriaActual();
            System.out.println("Se estan cargando " + saldo + " unidades para alcanzar la carga completa");
        }
    }

    public boolean bateriaLLena() {
        return carga.getCarga() >= 1000;

    }

    public boolean bateriaVacia() {
        return (carga.getCarga() <= 0);

    }

    public double bateriaActual() {

        return carga.getCarga();
        
    }
}
