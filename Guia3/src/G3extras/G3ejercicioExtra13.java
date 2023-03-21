/*
Crear un programa que dibuje una escalera de números, donde cada línea de
números comience en uno y termine en el número de la línea. Solicitar la altura
de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123

 */
package G3extras;

import java.util.Scanner;

public class G3ejercicioExtra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese altura escalera");
        int alt = leer.nextInt();
        System.out.println("");
        for (int i = 0; i < alt; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(j+1);
            }
            System.out.println("");
        }
    }
    
}
