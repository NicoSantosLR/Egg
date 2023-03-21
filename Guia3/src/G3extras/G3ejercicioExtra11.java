/*
 Escribir un programa que lea un número entero y devuelva el número de dígitos
que componen ese número. Por ejemplo, si introducimos el número 12345, el
programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
utilizando el operador de división. Nota: recordar que las variables de tipo
entero truncan los números o resultados.
 */
package G3extras;

import java.util.Scanner;

public class G3ejercicioExtra11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num = leer.nextInt();
        int contador = 0;
        do {            
            num = num/10;
            contador ++;
        } while (num!=0);
        System.out.println("El número tiene " + contador + " dígitos.");
    }
    
}
