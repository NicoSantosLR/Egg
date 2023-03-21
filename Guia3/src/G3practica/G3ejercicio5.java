package G3practica;

import java.util.Scanner;
/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los números
introducidos supere el límite inicial.
 */
public class G3ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el límite de la suma:");
        int limite = leer.nextInt();
        int suma = 0;
        do {            
            System.out.println("Ingrese un número");
            int num = leer.nextInt();
            suma = suma + num;
        } while (suma<=limite);
        System.out.println("La suma es: " + suma);
    }
    
}
