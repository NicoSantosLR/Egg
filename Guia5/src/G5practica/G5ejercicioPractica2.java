/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y
le pida al usuario un número a buscar en el vector. El programa mostrará dónde
se encuentra el numero y si se encuentra repetido
*/
package G5practica;

import java.util.Scanner;

public class G5ejercicioPractica2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        int N = leer.nextInt();
        int[] vector = new int[N];
     
        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random()*(10-1)) + 1;
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print(" " + vector[i] + " ");
        }
        
        System.out.println("\nIngrese el número a buscar:");
        int num = leer.nextInt();
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]==num) {
                System.out.println("Está en la posición -> " + (i+1));
                contador ++;
            }
        }
        if (contador>1) {
            System.out.println("Se encontró repetido " + contador + " veces");
        } else if (contador==0){
            System.out.println("No se encontró el número");
        } else {
            System.out.println("Se encontó una sola vez");
        }
    }
    
}
