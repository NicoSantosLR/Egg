package Ejercicios;

import java.util.Scanner;

public class G13ejercicio3 {

    /*
    Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String numero1 = sc.next();
        String numero2 = sc.next();
        int n1 = Integer.parseInt(numero1);
        int n2 = Integer.parseInt(numero2);
        //double resultado = (double) n1 / n2;
        int resultado = 1 / 0;
        System.out.println(resultado);

        /*
        try {
            int n1 = Integer.parseInt(numero1);
            int n2 = Integer.parseInt(numero2);
            //double resultado = divisionNumero(n1, n2);
            double resultado = (double) n1 / n2;
            System.out.println(resultado);
        } catch (NumberFormatException a) {
            System.out.println("Los valores no son numeros");
        } catch (ArithmeticException b) {
            System.out.println("No se puede dividir por cero");
        } catch (Exception e) {
            System.out.println("Error de sistema");
        }
         */
    }

    public static double divisionNumero(int n1, int n2) {
        return (double) n1 / n2;
    }

}
