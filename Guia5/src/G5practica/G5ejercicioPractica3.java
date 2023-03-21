/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package G5practica;

import java.util.Scanner;

public class G5ejercicioPractica3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el largo del vector:");
        int N = leer.nextInt();
        int[] vector = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Número pos. -> " + i);
            vector[i] = leer.nextInt();
        }
        int contador = 0;
        int unDigito = 0, dosDigitos = 0, tresDigitos = 0, cuatroDigitos = 0, cincoDigitos = 0;
        for (int i = 0; i < N; i++) {
            while (vector[i] != 0) {
                vector[i] = vector[i] / 10;
                contador++;
            }
            switch (contador) {
                case 1:
                    unDigito++;
                    break;
                case 2:
                    dosDigitos++;
                    break;
                case 3:
                    tresDigitos++;
                    break;
                case 4:
                    cuatroDigitos++;
                    break;
                case 5:
                    cincoDigitos++;
                    break;
            }
            contador = 0;
        }
        System.out.println("Un digito: " + unDigito);
        System.out.println("Dos digitos: " + dosDigitos);
        System.out.println("Tres digitos: " + tresDigitos);
        System.out.println("Cuatro digitos: " + cuatroDigitos);
        System.out.println("Cinco digitos: " + cincoDigitos);
    }

}
