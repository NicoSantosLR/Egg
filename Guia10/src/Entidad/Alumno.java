package Entidad;

import java.util.ArrayList;


public class Alumno {
    private String nombre;
    private ArrayList<Integer> notas;

    public Alumno() {
    }

    public Alumno(String nombreString, ArrayList<Integer> notas) {
        this.nombre = nombreString;
        this.notas = new ArrayList<>(3);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombreString=" + nombre + ", notas=" + notas + '}';
    }
    
    
    
}
