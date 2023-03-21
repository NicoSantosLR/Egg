/*
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada
de la siguiente manera: cada vocal se reemplaza por el carácter que se indica
en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas)
se mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
*/
package G4teoria;

import java.util.Scanner;

public class G4ejercicioTeoria11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase a codificar");
        String frase = leer.nextLine();
        while (!frase.substring(frase.length()-1).equals(".")) {            
            System.out.println("No termina en punto");
            frase = leer.nextLine();
        }
        String fraseCodificada = codif(frase);
        System.out.println(fraseCodificada);
    }
    
    
    
    public static String codif (String frase) {
        String letra;
        String auxFrase = "";
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.substring(i, i+1)) {
                case "a": case "A":
                    letra = "@";
                    break;
                case "e": case "E":
                    letra = "#";
                    break;
                case "i": case "I":
                    letra = "$";
                    break;
                case "o": case "O":
                    letra = "%";
                    break;
                case "u": case "U":
                    letra = "*";
                    break;
                default:
                    letra = frase.substring(i, i+1);
            }
            auxFrase = auxFrase.concat(letra);
        }
        return auxFrase;
    }
    
}
