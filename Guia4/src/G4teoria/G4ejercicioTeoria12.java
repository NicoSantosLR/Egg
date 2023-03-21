/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.
 */
package G4teoria;

import java.util.Scanner;

public class G4ejercicioTeoria12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números enteros:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        esMultiplo(num1, num2);
    }
    
    public static void esMultiplo(int n1, int n2) {
        if (n1%n2==0) {
            System.out.println("El número " + n1 + " es múltiplo de " + n2);
        } else {
            System.out.println("El número " + n1 + " NO es múltiplo de " + n2);
        }
    }

}
