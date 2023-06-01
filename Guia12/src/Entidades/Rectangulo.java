package Entidades;

public class Rectangulo implements CalculosFormas {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double rectangulo) {
        this.base = base;
        this.altura = rectangulo;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("El area de rectángulo es " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 2 * (base + altura);
        System.out.println("El perímetro del rectangulo es " + perimetro);
    }

}
