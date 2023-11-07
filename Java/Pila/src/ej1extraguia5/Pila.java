
package ej1extraguia5;

public class Pila {
     
    private int tope= -1;
    private String elementos[];

    public Pila(int tamaño) {
        //this.tope=tope;
        this.elementos=new String [tamaño];
    } 
    
    public Pila() {
    }
    
    
    public void agregar(String elem){
        
        if(!pilaLlena()){
            this.tope+=1;
        elementos[tope]=elem;
        
        }
        
    }
    
    
    public String vertope(){
    return " En el tope de la pila esta "+elementos[tope];
    
    }
    
    public String quitar(){
        if(!pilaVacia()){
        String auxiliar=elementos[tope];
        
        elementos[tope]=null;
        this.tope-=1;
    return "Se quitara "+auxiliar;
    }else{
       return " no se pueden quitar mas elementos"; 
        }
    
}
    
    public boolean pilaVacia(){
         
        return tope==-1;
   
    }
    
    public boolean pilaLlena(){
        
     return tope==elementos.length; 
    
    }
    
    public void vaciarPila(){
        for (int i = 0; i < elementos.length; i++) {
            
        
        System.out.println("quitando elementos"+quitar());
        }
    
    }
    

    
}
