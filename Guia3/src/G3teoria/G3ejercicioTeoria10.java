package G3teoria;

import java.util.Scanner;

/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor.
Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*/

public class G3ejercicioTeoria10 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer número entero entre 1 y 20:");
        int num1 = leer.nextInt();
        while (num1 < 1 || num1 > 20) {
            System.out.println("El número no está en el rango, ingrese nuevamente");
            num1 = leer.nextInt();
        }

        System.out.println("Ingrese el segundo número entero entre 1 y 20:");
        int num2 = leer.nextInt();
        while (num2 < 1 || num2 > 20) {
            System.out.println("El número no está en el rango, ingrese nuevamente");
            num2 = leer.nextInt();
        }

        System.out.println("Ingrese el tercer número entero entre 1 y 20:");
        int num3 = leer.nextInt();
        while (num3 < 1 || num3 > 20) {
            System.out.println("El número no está en el rango, ingrese nuevamente");
            num3 = leer.nextInt();
        }

        System.out.println("Ingrese el cuarto número entero entre 1 y 20:");
        int num4 = leer.nextInt();
        while (num4 < 1 || num4 > 20) {
            System.out.println("El número no está en el rango, ingrese nuevamente");
            num4 = leer.nextInt();
        }

        System.out.println("------------------------------------------------");

        for (int i = 0; i < 4; i++) {
            int largo = 0;

            switch (i) {
                case 0:
                    largo = num1;
                    break;
                case 1:
                    largo = num2;
                    break;
                case 2:
                    largo = num3;
                    break;
                case 3:
                    largo = num4;
                    break;
            }

            System.out.print(largo + " -> ");
            for (int j = 0; j < largo; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
