package Entidad;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMáxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMáxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    
}
