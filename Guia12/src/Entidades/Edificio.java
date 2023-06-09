package Entidades;

import java.util.Scanner;

public abstract class Edificio {

    protected double ancho;
    protected double alto;
    protected double largo;

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public abstract double calcularSuperficie();

    public abstract double calcularVolumen();
}
