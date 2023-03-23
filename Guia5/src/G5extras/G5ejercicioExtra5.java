/*
Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios
y muestre la suma de sus elementos.
*/
package G5extras;

import java.util.Scanner;

public class G5ejercicioExtra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el largo de la primera cardinalidad de la matriz");
        int N = leer.nextInt();
        System.out.println("Ingrese el largo de la segunda cardinalidad de la matriz");
        int M = leer.nextInt();
        int[][] matriz = new int[N][M];
        int suma = 0;
        //Llenamos
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = (int)(Math.random()*10)+1;
                suma += matriz[i][j];
            }
        }
        //Mostramos
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println("La suma de los valores de la matriz es " + suma);
    }
    
}
