package guia5ejercicios7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Guia5Ejercicios7 {

    public static void main(String[] args) {

        int[][] matrixM = {{12, 34, 56, 78, 90, 21, 43, 65, 87, 99},
        {23, 45, 67, 89, 10, 32, 54, 76, 98, 20},
        {34, 56, 78, 90, 21, 43, 65, 87, 99, 11},
        {45, 67, 89, 10, 32, 54, 76, 98, 20, 42},
        {56, 78, 90, 21, 43, 65, 87, 99, 11, 33},
        {67, 89, 10, 32, 54, 76, 98, 20, 42, 64},
        {78, 90, 21, 43, 65, 87, 99, 11, 33, 55},
        {89, 10, 32, 54, 76, 98, 20, 42, 64, 86},
        {90, 21, 43, 65, 87, 99, 11, 33, 55, 77},
        {11, 32, 54, 76, 98, 20, 42, 64, 86, 98}};

        int[][] matrixP = {{78, 90, 21},
        {89, 10, 32},
        {90, 21, 43}};
        int contador = 0;
        int[] indFilas = new int[9];
        int[] indCol = new int[9];

        List<int[]> indexCol = new ArrayList<>();
        List<int[]> indexFil = new ArrayList<>();
        for (int filaCorrer = 0; filaCorrer < 8; filaCorrer++) {
            for (int columnaCorrer = 0; columnaCorrer < 8; columnaCorrer++) {
                if (contador == 9) {
                    indexFil.add(indFilas.clone());
                    indexCol.add(indCol.clone());
                }
                contador = 0;
                for (int i = filaCorrer; i < (filaCorrer + 3); i++) {
                    for (int j = columnaCorrer; j < (columnaCorrer + 3); j++) {
                        //System.out.println("el numero" + matrixM[i][j]);
                        if (matrixM[i][j] == matrixP[i - filaCorrer][j - columnaCorrer]) {

                            indFilas[contador] = i;
                            indCol[contador] = j;

                            contador++;

                        } else {

                            break;
                        }

                    }

                }

            }
        }

        System.out.println("La MatrizP esta incluida en la matrixM " + indexFil.size() + " veces - los indices serian");

        for (int i = 0; i < indexFil.size(); i++) {
            System.out.println("---------------------------------------");
            System.out.println(" Fila    [" + Arrays.toString(indexFil.get(i)));
            System.out.println(" Columna [" + Arrays.toString(indexCol.get(i)));
        }
    }
}
