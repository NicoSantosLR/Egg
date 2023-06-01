package Entidades;

public class Circulo implements CalculosFormas {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = PI * (Math.pow(radio, 2));
        System.out.println("El area del circulo es " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = PI * (2 * radio);
        System.out.println("El perímetro del circulo es " + perimetro);
    }
}
