/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector
de tamaño N, con los valores ingresados por el usuario.
*/
package G5extras;

import java.util.Scanner;

public class G5ejercicioExtra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Cantidad de números a ingresar -> ");
        int N = leer.nextInt();
        System.out.println("-------------------------");
        int[] valores = new int[N];
        int suma = 0;
        for (int i = 0; i < N; i++) {
            System.out.print("Valor " + (i+1) + " -> ");
            valores[i] = leer.nextInt();
            suma += valores[i];
        }
        System.out.println("-------------------------");
        System.out.println("La suma de los valores ingresados es: " + suma);
    }
    
}
