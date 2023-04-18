package Entidad;

import java.util.Date;

/**
 *
 * @author rgalan
 */
public class Vendedor { //OBJETO VENDEDOR
    /*A CONTINUACION CREAMOS LOS ATRIBUTOS DEL OBJETO VENDEDOR
    ==========================================================*/
    private String nombre;
    private Integer dni;
    private Double sueldoBasico;
    private Double comisiones;
    private Double sueldoMensual;
    private Date fechaInicio;
    
    /*A PARTIR DE AQUI COMENZAMOS A CREAR LOS CONSTRUCTORES , GETTER Y 
    SETTER*/
    // 1°-Constructor por defecto o vacio
    public Vendedor() {
    }
    //2°-Constructor por parametros

    public Vendedor(String nombre, Integer dni, Double sueldoBasico, 
            Double comisiones, Double sueldoMensual, Date fechaInicio) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBasico = sueldoBasico;
        this.comisiones = comisiones;
        this.sueldoMensual = sueldoMensual;
        this.fechaInicio = fechaInicio;
    }
    //3°-getter & Setter para todos los atributos.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(Double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public Double getComisiones() {
        return comisiones;
    }

    public void setComisiones(Double comisiones) {
        this.comisiones = comisiones;
    }

    public Double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(Double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    /*RETORNAMOS UNA IMPRESION DEL OBJETO CON TODOS SUS DATOS (ATRIBUTOS) 
    DETALLADOS
    */
    @Override
    public String toString() {
        return "Vendedor{" + "nombre=" + nombre + ", dni=" + dni +
        ", sueldoBasico=" + sueldoBasico + ", comisiones=" + comisiones + 
        ", sueldoMensual=" + sueldoMensual + ", fechaInicio=" + 
                fechaInicio + '}';
        
    }
    
}