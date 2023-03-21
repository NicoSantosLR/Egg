/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
cantidad de hijos. Escriba un programa que pida la cantidad de familias y para
cada familia la cantidad de hijos para averiguar la media de edad de los hijos
de todas las familias.
*/
package G3extras;

import java.util.Scanner;

public class G3ejercicioExtra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias:");
        int N = leer.nextInt();
        int sumaEdades = 0;
        int sumaHijos = 0;
        
        for (int i = 0; i < N; i++) {
            System.out.println("Cuántos hijos tiene la familia " + (i+1) + "?:");
            int M = leer.nextInt();
            for (int j = 0; j < M; j++) {
                System.out.print("Edad hijo " + (j+1) + " -> ");
                int edad = leer.nextInt();
                sumaEdades += edad;
                sumaHijos ++;
            }
        }
        
        double promedio = (double)sumaEdades/(double)(sumaHijos);
        System.out.println("La media de edades es " + promedio);
    }
    
}
