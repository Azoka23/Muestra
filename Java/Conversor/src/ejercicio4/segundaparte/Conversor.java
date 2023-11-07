
package ejercicio4.segundaparte;

/**
 *
 * @author marcelaaliciaarroyo
 */
public class Conversor {
    
    private static double pes;
    private static double dol;
    
    public Conversor(int pes,int dol){
    Conversor.pes=pes;
    Conversor.dol=dol;
    }

    public double getPes() {
        return pes;
    }

    public void setPes(double pes) {
        Conversor.pes = pes;
    }

    public double getDol() {
        return dol;
    }

    public void setDol(double dol) {
        Conversor.dol = dol;
    }
    
    
    public static double convertirAPesos(double dol){
    double pesos=dol*395;
    return pesos;
    }
 
    public static double convertirADolar(double pes){
        double dolares=pes/395;
        return dolares;
    }
}
