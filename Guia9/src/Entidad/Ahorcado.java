package Entidad;

public class Ahorcado {

    // palabra "abuela"
    private String[] palabra;
    private String[] palabraParcial; // Agregado mio para metodo nuevo
    private int cantLetrasEncontradas;
    private int cantJugadasMax;
    private int cantJugadaHombre; // Para mostrar el hombrecito si elije 6

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, String[] palabraParcial, int cantidadLetras, int cantidadJugadas, int cantJugadaHombre) {
        this.palabra = palabra;
        this.palabraParcial = palabraParcial;
        this.cantLetrasEncontradas = cantidadLetras;
        this.cantJugadasMax = cantidadJugadas;
        this.cantJugadaHombre = cantJugadaHombre;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantLetrasEncontradas() {
        return cantLetrasEncontradas;
    }

    public void setCantLetrasEncontradas(int cantLetrasEncontradas) {
        this.cantLetrasEncontradas = cantLetrasEncontradas;
    }

    public int getCantJugadasMax() {
        return cantJugadasMax;
    }

    public void setCantJugadasMax(int cantJugadasMax) {
        this.cantJugadasMax = cantJugadasMax;
    }

    public String[] getPalabraParcial() {
        return palabraParcial;
    }

    public void setPalabraParcial(String[] palabraParcial) {
        this.palabraParcial = palabraParcial;
    }

    public int getCantJugadaHombre() {
        return cantJugadaHombre;
    }

    public void setCantJugadaHombre(int cantJugadaHombre) {
        this.cantJugadaHombre = cantJugadaHombre;
    }

}
