/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata
de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la función
equals() de la clase String.
 */
package G3extras;

import java.util.Scanner;

public class G3ejercicioExtra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una letra:");
        String letra = leer.next();
//        switch (letra) {
//            case "a", "e", "i", "o", "u":
//                System.out.println("Es una vocal");
//                break;
//            default:
//                System.out.println("Es una consonante");
//        }
        if (letra.equalsIgnoreCase("a")
                || letra.equalsIgnoreCase("e")
                || letra.equalsIgnoreCase("i")
                || letra.equalsIgnoreCase("o")
                || letra.equalsIgnoreCase("u")) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("Es una consonante");
        }
    }

}
