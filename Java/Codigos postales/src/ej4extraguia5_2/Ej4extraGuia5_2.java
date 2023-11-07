package ej4extraguia5_2;

import com.sun.org.apache.xml.internal.serialize.EncodingInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej4extraGuia5_2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        HashMap<Integer, String> ciudades = new HashMap();
        ciudades.put(1912, "La Plata");
        ciudades.put(8400, "Bariloche");
        ciudades.put(5000, "Cordoba");
        ciudades.put(4400, "Salta");
        ciudades.put(5502, "Mendoza");
        ciudades.put(7167, "Pinamar");
        ciudades.put(1032, "Caballito");
        ciudades.put(1428, "Nuñez");
        ciudades.put(1000, "Recoleta");
        ciudades.put(1426, "San Telmo");
//for (Map.Entry<Integer, String> entry : ciudades.entrySet()) {
//            System.out.println("Codigo postal : " + entry.getKey() + " Ciudad : " + entry.getValue());
//        }

        for (int i = 0; i <= 2; i++) {

            System.out.println("Ingresa la ciudad correspondiente");
            String ciudad = entrada.nextLine().toLowerCase();
            System.out.println("Ingresa codigo postal");
            Integer codigo = entrada.nextInt();
            entrada.nextLine();
            ciudades.put(codigo, ciudad);

        }
        for (Map.Entry<Integer, String> entry : ciudades.entrySet()) {
            System.out.println("Codigo postal : " + entry.getKey() + " Ciudad : " + entry.getValue());
        }

        System.out.println("Ingresa el codigo para conocer la ciudad");
        int codigo = entrada.nextInt();
        System.out.println("La ciudad correspondiente es " + ciudades.get(codigo));
        System.out.println(" ");

        System.out.println("Ingresa el codigo postal de la nueva ciudad");
        codigo = entrada.nextInt();
        System.out.println("Ingresa el nombre de la ciudad a agregar ");
        String ciudad = entrada.next();

        ciudades.put(codigo, ciudad);
int cp=0;
        System.out.println(" ");
        System.out.println("Ingresa que ciudad queres borrar");
        ciudad = entrada.next();
        if (ciudades.containsValue(ciudad)) {
            for (Map.Entry<Integer, String> entry : ciudades.entrySet()) {
                if (entry.getValue().equals(ciudad)) {
                     cp = entry.getKey();

                    //System.out.println(cp);
                }

            }
        }else {
            System.out.println("La ciudad no se encuentra en la lista");
        }
        
        ciudades.remove(cp);
        System.out.println("Ciudad borrada de la lista");

        for (Map.Entry<Integer, String> entry : ciudades.entrySet()) {
            System.out.println("Codigo postal : " + entry.getKey() + " Ciudad : " + entry.getValue());

        }
    }
}
