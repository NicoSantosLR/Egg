
package Ejercicios;

import Entidad.Libro;
import java.util.HashSet;
import java.util.Scanner;

public class G10ejercicioExtra3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        HashSet<Libro> biblioteca = new HashSet<>();
        
        boolean ask = true;
        do {
            ask = sc.next().equalsIgnoreCase("s");
        } while (ask);
        
    }

}
