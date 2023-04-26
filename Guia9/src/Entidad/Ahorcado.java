package Entidad;


public class Ahorcado {
    
    // palabra "abuela"
    private String[] palabra;
    private int cantLetrasEncontradas;
    private int cantJugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantidadLetras, int cantidadJugadas) {
        this.palabra = palabra;
        this.cantLetrasEncontradas = cantidadLetras;
        this.cantJugadasMax = cantidadJugadas;
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
    
    
}
