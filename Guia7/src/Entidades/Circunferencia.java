package Entidades;

public class Circunferencia {

    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circunferencia crearCircunferencia(double radio) {
        Circunferencia circulo = new Circunferencia(getRadio());
        return circulo;
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
