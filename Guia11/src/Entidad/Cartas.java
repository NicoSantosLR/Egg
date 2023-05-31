package Entidad;

import Entidad.enumercaiones.Palos;


public class Cartas {
    private int numero;
    private Palos palos;

    public Cartas() {
    }

    public Cartas(int numero, Palos palos) {
        this.numero = numero;
        this.palos = palos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Palos getPalos() {
        return palos;
    }

    public void setPalos(Palos palos) {
        this.palos = palos;
    }

    @Override
    public String toString() {
        return numero + " DE " + palos;
    }

    
}
