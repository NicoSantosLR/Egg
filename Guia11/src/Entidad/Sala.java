package Entidad;

public class Sala {

    private Butaca[][] butacas;
    private double precioEntrada;
    private Pelicula pelicula;
    private boolean estado;

    
    public Sala() {
        this.butacas = new Butaca[8][6];
        this.estado = false;
    }

    public Sala(Butaca[][] butacas, double precioEntrada, Pelicula pelicula) {
        this.butacas = butacas;
        this.precioEntrada = precioEntrada;
        this.pelicula = pelicula;
    }


    public Butaca[][] getButacas() {
        return butacas;
    }

    public void setButacas(Butaca[][] butacas) {
        this.butacas = butacas;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


}
