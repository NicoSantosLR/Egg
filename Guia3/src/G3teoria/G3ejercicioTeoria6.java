package G3teoria;

import java.util.Scanner;

public class G3ejercicioTeoria6 {


    /*Implementar un programa que le pida dos números enteros al usuario
    y determine si ambos o alguno de ellos es mayor a 25.
    */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese un segundo número entero:");
        int num2 = leer.nextInt();
        if (num1>25 && num2>25) {
            System.out.println("Los números ingresados son mayores a 25");
        } else if (num1>25 || num2>25) {
            System.out.println("Un número ingresado es mayor a 25");
        } else{
            System.out.println("Ningún número es mayor a 25");
        }
    }
    
}
