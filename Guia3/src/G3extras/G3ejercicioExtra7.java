/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y
el promedio de n números (n>0). El valor de n se solicitará al principio del
programa y los números serán introducidos por el usuario. Realice dos versiones
del programa, una usando el bucle “while” y otra con el bucle “do - while”.
 */
package G3extras;

import java.util.Scanner;

public class G3ejercicioExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuántos números ingresará?");
        int n = leer.nextInt();
        int max = 0;
        int min = 0;
        int suma = 0;
        double promedio;
        int contador = 0;

        /*
        while (contador!=n) { 
            System.out.print("Ingrese número: ");
            int num = leer.nextInt();
            if (contador==0) {
                max = num;
                min = num;
            }
            if (num>max) {
                max = num;
            }
            if (num<min) {
                min = num;
            }
            contador ++;
            suma += num;
        }
         */
        
        do {
            System.out.print("Ingrese número: ");
            int num = leer.nextInt();
            if (contador == 0) {
                max = num;
                min = num;
            }
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            contador++;
            suma += num;
        } while (contador != n);

        promedio = (double) suma / (double) n;
        System.out.println("Valor máximo -> " + max);
        System.out.println("Valor mínimo -> " + min);
        System.out.println("Promedio -> " + promedio);
    }

}
