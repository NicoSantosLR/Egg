package Entidad;


public class Butaca {
    private boolean ocupado;
    private int fila;
    private String columna;

    public Butaca() {
    }

    public Butaca(int fila, String columna) {
        this.ocupado = false;
        this.fila = fila;
        this.columna = columna;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    @Override
    public String toString() {
        if (ocupado) {
           return fila + columna + "X"; 
        }
        return fila + columna + " "; 
    }
    
    
     
}
