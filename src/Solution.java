

import java.util.Random;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        // 8. L'objectiu d'aquest exercici és convertir una matriu (array de dos dimensions) en un vector (array d'una dimensió). Per fer-ho hem de recórrer la matriu d'esquerra a dreta i de dalt a baix i anar omplint el vector, de la següent manera:
//        Matriu = {{1,2,3},{7,8,9},{15,12,45}}
//        Passarà a ser el següent vector: {1,2,3,7,8,9,15,12,45}
        int[][] matriu = {{0,1,2},
                {1,0,3},
                {2,3,0}};

        boolean simetrica=true;

        for(int i = 0; i < matriu.length; i++)
        {
            for(int j = 0; j < matriu[i].length; j++)
            {
                // Quan arrivem a la diagonal saltem a la següent fila
                if(i==j)
                {
                    break;
                }

                // Si un element no és igual al seu simètric no cal seguir buscant: la matriu no és simètrica
                if(matriu[i][j]!=matriu[j][i])
                {
                    simetrica=false;
                    break;
                }
            }

            // Si la matriu no és simètrica sortim del bucle
            if(simetrica==false)
                break;
        }

        if(simetrica==true){
            System.out.println("Simetrica");
        }
        else{
            System.out.println("No simetrica");
        }

    }


}
