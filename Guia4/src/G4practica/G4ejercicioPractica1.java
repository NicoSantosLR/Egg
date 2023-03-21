/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir
entre sumar, restar, multiplicar y dividir. La aplicación debe tener una
función para cada operación matemática y deben devolver sus resultados para
imprimirlos en el main.
 */
package G4practica;

import java.util.Scanner;

public class G4ejercicioPractica1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números:");
        float num1 = leer.nextFloat();
        float num2 = leer.nextFloat();
        int opc;
        do {
            System.out.println("Elija una opcion del Menu\n"
                    + "MENU\n"
                    + "1.Sumar\n"
                    + "2.Restar\n"
                    + "3.Multiplicar\n"
                    + "4.Dividir\n"
                    + "5.Salir\n"
                    + "");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    float resultadoSuma = suma(num1, num2);
                    System.out.println("La suma es " + resultadoSuma);
                    System.out.println("");
                    break;
                case 2:
                    float resultadoResta = resta(num1, num2);
                    System.out.println("La resta es " + resultadoResta);
                    System.out.println("");
                    break;
                case 3:
                    float resultadoMultiplicar = multiplicar(num1, num2);
                    System.out.println("La multiplicación es " + resultadoMultiplicar);
                    System.out.println("");
                    break;
                case 4:
                    float resultadoDivision = division(num1, num2);
                    System.out.println("La división es " + resultadoDivision);
                    System.out.println("");
                    break;
            }
        } while (opc != 5);

    }

    public static float suma(float n1, float n2) {
        float resultado = n1 + n2;
        return resultado;
    }

    public static float resta(float n1, float n2) {
        float resultado = n1 - n2;
        return resultado;
    }

    public static float multiplicar(float n1, float n2) {
        float resultado = n1 * n2;
        return resultado;
    }

    public static float division(float n1, float n2) {
        float resultado = n1 / n2;
        return resultado;
    }

}
