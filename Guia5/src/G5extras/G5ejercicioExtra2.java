/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre
los elementos).
*/
package G5extras;

import java.util.Scanner;

public class G5ejercicioExtra2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Definimos largo
        System.out.println("Largo de los vectores:");
        int N = leer.nextInt();
        int[] vector1 = new int[N];
        int[] vector2 = new int[N];
        //Llenamos primer vector
        for (int i = 0; i < N; i++) {
            System.out.print("Valor " + (i + 1) + " de Matriz 1 -> ");
            vector1[i] = leer.nextInt();
        }
        //Llenamos segundo vector
        for (int i = 0; i < N; i++) {
            System.out.print("Valor " + (i + 1) + " de Matriz 2 -> ");
            vector2[i] = leer.nextInt();
        }
        //Verificamos igualdad
        boolean bandera = true;
        for (int i = 0; i < N; i++) {
            if (vector1[i] != vector2[i]) {
                System.out.println("Los números son distintos en valor " + (i + 1));
                bandera = false;
                break;
            }
        }
        if (bandera) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores no son iguales");
        }
    }
    
}
