/*
Realizar un programa que complete un vector con los N primeros números de la
sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de
los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él.
Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función
que reciba como parámetro el valor de “n” y que calcule la serie hasta llegar
a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar el siguiente
link: https://quantdare.com/numeros-de-fibonacci/
 */
package G5extras;

import java.util.Scanner;

public class G5ejercicioExtra7 {

    public static void main(String[] args) {
        // Crear objeto Scanner para leer desde la entrada estándar
        Scanner input = new Scanner(System.in);

        // Pedir al usuario que ingrese el número de términos de la sucesión de Fibonacci
        System.out.print("Ingrese el número de términos de la sucesión de Fibonacci -> ");
        int n = input.nextInt();

        // Crear un vector para almacenar los números de Fibonacci
        int[] fib = new int[n];

        // Calcular la sucesión de Fibonacci y almacenarla en el vector
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                fib[i] = 1;
            } else {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
        }

        // Imprimir los términos de la sucesión de Fibonacci
        System.out.println("Los " + n + " primeros números de la sucesión de Fibonacci son: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
        System.out.println("");
    }
}
