
package ejercicio7.segundaparte;

/**
 *
 * @author marcelaaliciaarroyo
 */
public class Robot {
   private  double bateria=500;
   private String nombre;
   
   public  void Robot(String nombre){
   this.nombre=nombre;
   }

    public double getBateria() {
        return bateria;
    }

    public void setBateria(double bateria) {
        this.bateria = bateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   

   public String avanzar(int cantpasos){
       int contpasos=0;
       if (!bateriaVacia()){
           while(this.bateria>0 && contpasos<cantpasos){
               this.bateria-=0.1;
           contpasos++;
           
       }
        
        
       if (this.bateria<=0){
           this.bateria=0;
       return "Usted consiguio dar "+ contpasos +" y le faltaron "+(cantpasos-contpasos) +" porque la bateria se agoto";
       
       }
   return "Avanzo " + cantpasos + " pasos" + "le quedan " + (this.bateria)+ " unidades de energia disponible";
           
   }
   return "la bateria esta agotada";
   }
   
       
       
   
   public boolean bateriaVacia(){
       return bateria<=0;    
   }
   
   
}
