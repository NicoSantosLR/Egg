/*
Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice
que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta,
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz
traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas
por columnas (o viceversa).
*/
package G5practica;

import java.util.Scanner;

public class G5ejercicioPractica5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la dimensión de la matriz NxN:");
        int N = scan.nextInt();
        int[][] matriz = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("Ingrese el numero para la pos. " + i + "," + j);
                matriz[i][j] = scan.nextInt();
            }
        }
        
        System.out.println("Matriz original");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("Matriz traspuesta");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[j][i]);
            }
            System.out.println("");
        }
        
        boolean esAntisimetrica = true;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    esAntisimetrica = false;
                    break;
                }
            }
        }
        
        if (esAntisimetrica) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }
    }
    
}
