package G3extras;

/*
Simular la división usando solamente restas. Dados dos números enteros mayores
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
que el divisor, este resultado es el residuo, y el número de restas realizadas
es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
import java.util.Scanner;

public class G3ejercicioExtra9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero mayor a 1:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el divisor:");
        int num2 = leer.nextInt();
        while (num1<num2) {            
            System.out.println("El divisor debe ser mayor, ingrese nuevamente");
            num2 = leer.nextInt();
        }
        int contador = 0;
        do {            
            num1 -= num2;
            contador ++; // contador = contador + 1
        } while (num1>=num2);
        System.out.println("El residuo es " + num1 + " y el cociente es " + contador);
    }
    
}
