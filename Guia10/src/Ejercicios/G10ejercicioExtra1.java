package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class G10ejercicioExtra1 {

    public static void main(String[] args) {
        /*
        Diseñar un programa que lea una serie de valores numéricos enteros desde
        el teclado y los guarde en un ArrayList de tipo Integer. La lectura de
        números termina cuando se introduzca el valor -99. Este valor no se guarda
        en el ArrayList. A continuación, el programa mostrará por pantalla el número
        de valores que se han leído, su suma y su media (promedio).
         */

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Integer> list = new ArrayList<>();
        int suma = 0;
        int num;
        System.out.println("Ingrese números enteros: (-99 para salir)");
        do {
            num = sc.nextInt();
            if (num != -99) {
                list.add(num);
                suma += num;
            }
        } while (num != -99);
        System.out.println("Se han leído " + list.size() + " números");
        System.out.println("La suma de los mismos es " + suma);
        float media = (float) suma / list.size();
        System.out.println("El promedio de los mismos es " + media);
    }

}
