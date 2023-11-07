package ej4guia4;

import java.util.Scanner;

public class  Guerrero extends Personaje {

    private boolean caballo;
    
   
   
    
    public Guerrero(boolean caballo,Position ubicacion, String nick){
        super( ubicacion, nick);
        
        this.caballo=caballo;
    }

   
        
    

    
    
    
    public boolean caballo(){
        return caballo;
    }
    
    
    @Override
    public void avanzar() {
      super.avanzar();
       if(caballo==false){
           super.avanzar();
       }else {
        switch (orientacion){
            case 'n' :
             ubicacion.setY(ubicacion.getY()+10);
                break;
            case 'e':
                ubicacion.setX(ubicacion.getX()+10);
                break;
            case 's':
                ubicacion.setY(ubicacion.getY()-10);
                break;
            case 'o':
               ubicacion.setX(ubicacion.getX()-10);
            default :
                orientacion='n';
        }
         System.out.println(orientacion);
         System.out.println("X = "+ubicacion.getX());
         System.out.println("Y = "+ubicacion.getY());
       }
    }

   
    @Override
    public  void disparar(int disparo) {
        super.disparar(disparo);
        if(energia<30){
            this.caballo=false;
            System.out.println("Has perdido tu caballo");
        }
    }

   
}
