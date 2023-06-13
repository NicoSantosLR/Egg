package Ejercicios;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class G13ejercicio5 {

    /*
    Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Random rd = new Random();
        int numeroOculto = rd.nextInt(500);
        int ingreso;
        int contador = 0;
        boolean flag = false;
        do {
            try {
                System.out.println("Numero oculto " + numeroOculto);
                System.out.println("Intente adivinar el número:");
                ingreso = sc.nextInt();
                if (ingreso == numeroOculto) {
                    contador++;
                    flag = true;
                } else if (ingreso < numeroOculto) {
                    contador++;
                    System.out.println("Muy bajo - " + contador);
                } else if (ingreso > numeroOculto) {
                    contador++;
                    System.out.println("Muy alto - " + contador);
                }
            } catch (InputMismatchException e) {
                contador++;
                System.out.println("Ingrese un número entero");
                sc.next();
            }
        } while (!flag);
        System.out.println("Adivinaste en " + contador + " intentos");
    }

}
