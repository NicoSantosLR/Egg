package Entidades;

import java.util.Date;

public class Alquiler {

    /*Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará*/
    private String nombreCliente;
    private String dni;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private String posAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, String dni, Date fechaAlquiler, Date fechaDevolucion, String posAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posAmarre = posAmarre;
        this.barco = barco;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(String posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler Resumen\nNombre del cliente: " + nombreCliente + "\nDNI: " + dni + "\nFecha de Alquiler: " + fechaAlquiler
                + "\nFecha de Devolucion: " + fechaDevolucion + "\nPosición de amarre: " + posAmarre + "\n" + barco;
    }
}
