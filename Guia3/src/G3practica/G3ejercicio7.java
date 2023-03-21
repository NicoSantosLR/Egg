package G3practica;

import java.util.Scanner;

/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar
cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
public class G3ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;
        String secuencia = "&&&&&";
        do {
            System.out.println("Ingrese la cadena");
            secuencia = leer.nextLine();
            if (secuencia.length()<=5) {
                if (secuencia.substring(0, 1).equals("X") && secuencia.substring(secuencia.length()-1).equals("O")) {
                    correctas +=1;
                } else if (!secuencia.equals("&&&&&")) {
                    incorrectas +=1;
                }
            } 
            else {
                incorrectas +=1;
            }
        } while (!secuencia.equals("&&&&&"));
        System.out.println("La cantidad de correctas es " + correctas + " y las incorrectas " + incorrectas);
    }
    
}
