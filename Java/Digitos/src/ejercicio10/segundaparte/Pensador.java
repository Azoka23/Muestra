
 
package ejercicio10.segundaparte;



/**
 *
 * @author marcelaaliciaarroyo
 */
public class Pensador {
    int numero;
    
    public Pensador(){
    this.numero=numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    
    
    }

    public void invertir(int numero){
       int a=numero;
       int b=0;
       while(a>0){
       int resto=a%10;
       b=b*10+resto;
       a=(int)Math.floor(a/10);
       }    
               
      System.out.println("Dado el numero "+ numero +" el numero invertido es "+ b);
       }   
    
    
   public int parAntes(int numero){
   if(numero%2==0){
   return (numero-2);
     }else{
   return (numero-1);
     }
   }
   
   
   
   
   public int parPosterior(int numero){
   if(numero%2==0){
   return (numero+2);
     }else{
   return (numero+1);
     }
   }
   
   public double primerDigito(int numero){
   int a=numero;
       int b=0;
       while(a>0){
       int resto=a%10;
       b=b*10+resto;
       a=(int)Math.floor(a/10);
       
       }
       
       int primerDigito=b%10;
       
       return primerDigito;
    
   }



   
public int ultimoDigito(int numero){
    int ultimoDigito=numero%10;
  return ultimoDigito; //es conveniente hacerlo asi para 
  //guardar el valor en la variable 
        //System.out.println("El ultimo digito del numero " + numero + " es " + ultimoDigito);
   // de esta otra forma el valor no queda gaurdado
   }
   
}
