package Ejercicios;

import java.util.Scanner;

public class G9ejercicioExtra1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        String mesSecreto = mes[7];

        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");

        String mesAdivina = leer.next();

        while (!mesAdivina.equals(mesSecreto)) {

            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            mesAdivina = leer.next();
        }

        System.out.println("¡Ha acertado!");
    }

}
