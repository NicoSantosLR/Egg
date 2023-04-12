package Servicio;

import Entidad.Raices;

public class RaicesServicio {

    private double discriminante;

    public void setDiscriminante(double discriminante) {
        this.discriminante = discriminante;
    }

    public double getDiscriminante(Raices raiz) {
        this.discriminante = Math.pow(raiz.getB(), 2) - (4 * raiz.getA() * raiz.getC());
        return discriminante;
    }

    public boolean tieneRaices(Raices raiz) {
        return getDiscriminante(raiz) >= 0;
    }

    public boolean tieneRaiz(Raices raiz) {
        return getDiscriminante(raiz) == 0;
    }

    public void obtenerRaices(Raices raiz) {
        if (tieneRaices(raiz)) {
            double x1 = ((-1) * (raiz.getB()) + Math.sqrt(getDiscriminante(raiz))) / (2 * raiz.getA());
            double x2 = ((-1) * (raiz.getB()) - Math.sqrt(getDiscriminante(raiz))) / (2 * raiz.getA());
            System.out.println(x1);
            System.out.println(x2);
        }
    }

    public void obtenerRaiz(Raices raiz) {
        if (tieneRaiz(raiz)) {
            double x = ((-1) * (raiz.getB()) + Math.sqrt(getDiscriminante(raiz))) / (2 * raiz.getA());
            System.out.println(x);
        }
    }

    public void calcular(Raices raiz) {
        if (tieneRaices(raiz)) {
            System.out.println("Las raices x1 y x2 son:");
            obtenerRaices(raiz);
        } else if (tieneRaiz(raiz)) {
            System.out.println("La raiz x es:");
            obtenerRaiz(raiz);
        } else {
            System.out.println("No tiene raices");
        }
    }
}
