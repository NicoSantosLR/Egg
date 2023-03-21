/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
números pares y la cantidad de números impares. Al igual que en el ejercicio
anterior los números negativos no deben sumarse. Nota: recordar el uso de la
sentencia break.
 */
package G3extras;

import java.util.Scanner;

public class G3ejercicioExtra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        int pares = 0;
        int impares = 0;
        
        do {            
            System.out.print("Ingrese número: ");
            int num = leer.nextInt();
            
            if (num>=0) {
                contador ++;
            }
            
            if (num%2==0 && num>0) {
                pares ++;
            } else if (num%2!=0 && num>0) {
                impares ++;
            }
            
            if (num%5==0) {
                System.out.println("El número es múltiplo de 5!");
                break;
            }
        } while (true);
        
        System.out.println("Total números -> " + contador);
        System.out.println("Total pares -> " + pares);
        System.out.println("Total impares -> " + impares);
    }
    
}
