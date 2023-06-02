package Entidad;

public class ParDeNumeros {

    private double numero1, numero2;

    public ParDeNumeros() {
        numero1 = Math.random() * 100;
        numero2 = Math.random() * 100;
        //numero1 = 5;
        //numero2 = -4;
    }

    public ParDeNumeros(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

}
