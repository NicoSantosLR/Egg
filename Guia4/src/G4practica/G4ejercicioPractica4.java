/*
 Crea una aplicación que nos pida un número por teclado y con una función se lo
pasamos por parámetro para que nos indique si es o no un número primo, debe
devolver true si es primo, sino false.
 */
package G4practica;

import java.util.Scanner;

public class G4ejercicioPractica4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar numero");
        int numero = leer.nextInt();
        boolean primo = esPrimo(numero);
        System.out.println(primo);
    }

    public static boolean esPrimo(int numero) {
        boolean valor = false;
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            valor = true;
        }
        return valor;
    }
}
