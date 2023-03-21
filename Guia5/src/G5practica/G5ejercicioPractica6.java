/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear
un programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.
*/
package G5practica;

import java.util.Scanner;

public class G5ejercicioPractica6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Ingrese números del 1 al 9 para llenar la matriz 3x3");

        // Llena matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor en pos. " + i + "," + j + " -> ");
                matriz[i][j] = leer.nextInt();
                while (matriz[i][j] > 9 || matriz[i][j] < 1) {
                    System.out.println("Fuera de rango");
                    System.out.print("Valor en pos. " + i + "," + j + " -> ");
                    matriz[i][j] = leer.nextInt();
                }
            }
        }

        // Muestra matriz
        imprime(matriz);

        // Empezamos un analizador en false
        boolean analizador = false;

        // Suma diagonales
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalInvertida = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sumaDiagonalPrincipal += matriz[i][j];
                }
                if (i + j == 2) {
                    sumaDiagonalInvertida += matriz[i][j];
                }
            }
        }
        // Analizamos diagonales
        if (sumaDiagonalInvertida == sumaDiagonalInvertida) {
            analizador = true;
            // Suma horizontales y verticales
            int sumaH = 0, sumaV = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    sumaH += matriz[i][j];
                    sumaV += matriz[j][i];
                }
                // Analizamos
                if (sumaH == sumaV) {
                    analizador = true;
                } else {
                    analizador = false;
                    break; // Salir para no continuar
                }
                sumaH = 0;
                sumaV = 0;
            }
        }
        
        if (analizador) {
            System.out.println("La matriz el mágica");
        } else {
            System.out.println("La matriz no es mágica");
        }

    }

    public static void imprime(int m[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + m[i][j] + "] ");
            }
            System.out.println("");
        }
    }
}
