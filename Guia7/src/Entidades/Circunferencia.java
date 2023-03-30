package Entidades;

import java.util.Scanner;

public class Circunferencia {

    private double radio;

    public Circunferencia() {
    }
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio:");
        this.radio = leer.nextDouble();
    }

    public double area() {
        double superficie = Math.PI * Math.pow(getRadio(), 2);
        return superficie;
    }

    public double perimetro() {
        double perim = Math.PI * getRadio() * 2;
        return perim;
    }

}
