/*
13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de
equipo y define su tipo de dato de tal manera que te permita alojar sus nombres
más adelante.
14
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus
compañeros de equipo
 */
package G5teoria;

import java.util.Scanner;

public class G5ejercicioTeoria13y14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] Equipo = new String[7];
        for (int i = 0; i < Equipo.length; i++) {
            System.out.println("Ingrese nombre de compañero " + (i + 1));
            Equipo[i] = leer.nextLine();
        }
        System.out.println("\nLos compañeros de equipo son:");
        for (String equipo91 : Equipo) {
            System.out.println(equipo91);
        }
    }

}
