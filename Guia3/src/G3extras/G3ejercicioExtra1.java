/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo,
si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente:
1 día, 2 horas.
 */
package G3extras;

import java.util.Scanner;

public class G3ejercicioExtra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos");
        int min = leer.nextInt();
        int dias = min/1440; // 1 día tiene 1440 minutos
        int horas = (min%1440)/60; // El resto div la hora
        System.out.println(dias + " día/s, " + horas + " horas.");
    }
    
}
