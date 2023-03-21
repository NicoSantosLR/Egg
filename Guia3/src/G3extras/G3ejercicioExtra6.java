/*
Leer la altura de N personas y determinar el promedio de estaturas que se
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package G3extras;

import java.util.Scanner;

public class G3ejercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas a medir:");
        int N = leer.nextInt();

        double suma = 0;
        int cantBajas = 0;
        double sumaBajas = 0;

        for (int i = 0; i < N; i++) {
            System.out.println("Cuánto mide la persona " + (i + 1) + "?");
            double altura = leer.nextDouble();
            if (altura < 1.6) {
                cantBajas++;
                sumaBajas += altura;
            }
            suma += altura;
        }

        if (cantBajas != 0) {
            System.out.println("El promedio de estatura menor a 1,6m es: " + (sumaBajas / cantBajas));
        }

        System.out.println("El promedio de estatura general es: " + (suma / N));
    }
}
