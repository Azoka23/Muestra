
package ejercicio3.segundaparte;

/**
 *
 * @author marcelaaliciaarroyo
 */
public class Circulo {
 private  double radio;
 private final  double pi;
 
 public Circulo(double radio){
 this.radio=radio;
 pi=3.14;
 
 }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
 
    public double calcularArea(){
    double area=pi*radio*radio;
    return area;
    }
    
    public double calcularPerimetro(){
    double perimetro=pi*2*radio;
    return perimetro;
    }
 
}
