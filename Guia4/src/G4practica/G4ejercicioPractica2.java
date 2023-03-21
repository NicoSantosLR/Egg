/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los
datos de las personas ingresadas por teclado e indique si son mayores o menores
de edad. Después de cada persona, el programa debe preguntarle al usuario si
quiere seguir mostrando personas y frenar cuando el usuario ingrese la
palabra “No”.
 */
package G4practica;

import java.util.Scanner;

public class G4ejercicioPractica2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad, N;
        String nombre, opc;
        System.out.println("Ingrese la cantidad de personas a analizar");
        N = sc.nextInt();
        do {
            System.out.println("Ingrese el nombre: ");
            nombre = sc.next();
            System.out.println("Ingrese la edad: ");
            edad = sc.nextInt();
            N--;
            System.out.println(mayor(nombre, edad));
            if (N == 0) {
                break;
            }
            System.out.println("Desea ingresar otro nombre? (si/no)");
            opc = sc.next();
        } while (!opc.equalsIgnoreCase("no"));

    }

    public static String mayor(String nombre, int edad) {
        String retorno;
        if (edad > 18) {
            retorno = nombre + " es mayor de edad";
        } else {
            retorno = nombre + " es menor de edad";
        }
        return retorno;
    }
}
