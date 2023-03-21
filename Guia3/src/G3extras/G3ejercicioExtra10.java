/*
 Realice un programa para que el usuario adivine el resultado de una multiplicación
entre dos números generados aleatoriamente entre 0 y 10. El programa debe indicar
al usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta
se debe permitir al usuario ingresar su respuesta nuevamente. Para realizar este
ejercicio investigue como utilizar la función Math.random() de Java.

 */
package G3extras;

import java.util.Scanner;

public class G3ejercicioExtra10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero1 = (int) (Math.random() * 11);
        int numero2 = (int) (Math.random() * 11);
        int resultado = numero1 * numero2;
        int ing;
        do {            
            System.out.println("Ingrese el resultado oculto");
            ing = leer.nextInt();
        } while (ing!=resultado);
        System.out.println("Adivinó");
    }
    
}
