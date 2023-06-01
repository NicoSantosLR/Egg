package Ejercicios;

import Entidades.Circulo;
import Entidades.Rectangulo;
import java.util.Scanner;

public class G12ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el radio de un circulo:");
        double radio = sc.nextDouble();
        Circulo cir1 = new Circulo(radio);
        cir1.calcularArea();
        cir1.calcularPerimetro();
        System.out.println("----------------------------------------");
        System.out.println("Ingrese la base del rectangulo:");
        double base = sc.nextDouble();
        System.out.println("Ingrese la altura del rectangulo:");
        double altura = sc.nextDouble();
        Rectangulo rec2 = new Rectangulo(base, altura);
        rec2.calcularArea();
        rec2.calcularPerimetro();

    }
}
