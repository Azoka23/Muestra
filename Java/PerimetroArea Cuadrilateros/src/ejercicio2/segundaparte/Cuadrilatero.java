 
package ejercicio2.segundaparte;

/**
 *
 * @author marcelaaliciaarroyo
 */
public class Cuadrilatero {
    
    private int largo;
    private int alto;
    
    public Cuadrilatero(int largo,int alto){
    this.largo=largo;
    this.alto=alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
   public int calcularPerimetro() {
   int perimetro;
        perimetro = largo*2+alto*2;
        return perimetro;
   }
 
   public int calcularArea(int largo,int alto) {
   int area;
        area = largo*alto;
        return area;
        
   }
   
   public boolean esUnCuadrado(int largo,int alto) {
        return largo==alto;     
   }
}
