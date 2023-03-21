package G3practica;


import java.util.Scanner;

/*
Crear un programa que dado un número determine si es par o impar.
 */
public class G3ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num = leer.nextInt();
        if (num%2==0) {
            System.out.println("El número es PAR");
        } else {
            System.out.println("El número es IMPAR");
        }
    }
    
}
