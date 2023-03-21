package G3practica;


import java.util.Scanner;

/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre
por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa
deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá
ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario
selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar
el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve
a mostrar el menú.
 */
public class G3ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números enteros positivos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        String salir = "n";
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opción");

            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("La suma de los números es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de los números es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación de los números es: " + (num1 * num2));
                    break;
                case 4:
                    double div = (double)num1 / (double)num2;
                    System.out.println("La división de los números es: " + div);
                    break;
                case 5:
                    System.out.println("Desea salir? S/N");
                    salir = leer.next();
                    break;
            }
        } while (salir.equalsIgnoreCase("n"));
    }

}
