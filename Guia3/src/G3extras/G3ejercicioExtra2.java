/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones necesarias
para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D
tome el valor de B. Mostrar los valores iniciales y los valores finales de cada
variable. Utilizar sólo una variable auxiliar.
 */
package G3extras;

import java.util.Scanner;

public class G3ejercicioExtra2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los valores para A, B, C y D respectivamente:");
        int A = leer.nextInt();
        int B = leer.nextInt();
        int C = leer.nextInt();
        int D = leer.nextInt();
        System.out.println("Los valores iniciales son:");
        System.out.println("A: " + A + ", B: " + B + ", C: " + C + " y D: " + D);
        int aux;
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("Los valores finales son:");
        System.out.println("A: " + A + ", B: " + B + ", C: " + C + " y D: " + D);
    }
    
}
