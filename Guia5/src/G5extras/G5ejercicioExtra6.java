/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a
medida que el usuario las va ingresando, construya una “sopa de letras para
niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
horizontal en una fila que será seleccionada de manera aleatoria. Una vez
concluida la ubicación de las palabras, rellene los espacios no utilizados con
un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de
letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().
 */
package G5extras;

import java.util.Scanner;

public class G5ejercicioExtra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] palabras = new String[5];
        String[][] sopa = new String[20][20];

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Ingrese palabras de 3 a 5 caracteres: Nº" + (i + 1));
            palabras[i] = leer.next();
            while (palabras[i].length() > 5 || palabras[i].length() < 3) {
                System.out.println("Fuera de rango, reingrese");
                palabras[i] = leer.next();
            }
        }

        int I = 0, J = 0;

        for (int i = 0; i < palabras.length; i++) {
            I = (int) (Math.random() * 19);
            J = (int) (Math.random() * 14);
            if (sopa[I][J] == null) {
                for (int j = 0; j < palabras[i].length(); j++) {
                    sopa[I][j + J] = palabras[i].substring(j, j + 1);
                }
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j] == null) {
                    sopa[i][j] = String.valueOf((int) (Math.random() * 9));
                }
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j]);
            }
            System.out.println("");
        }
    }

}
