package Entidades;

import Entidades.Enums.EstadoCivil;
import java.util.Scanner;

/*
Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
 */
public class Persona {

    protected String nombre;
    protected String apellido;
    protected String dni;
    protected String estadoCivil;

    protected Scanner sc = new Scanner(System.in).useDelimiter("\n");

    protected Persona() {
    }

    protected Persona(String nombre, String apellido, String dni, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    protected void crearPersona() {
        System.out.print("Nombre: ");
        nombre = sc.next();
        System.out.print("Apellido: ");
        apellido = sc.next();
        System.out.print("DNI: ");
        dni = sc.next();
        System.out.print("Estado civil: ");
        estadoCivil = sc.next().toUpperCase();
        comprobarEstadoCivil(estadoCivil);

    }

    public void comprobarEstadoCivil(String estCivil) {
        boolean validar = false;
        for (EstadoCivil auxCivil : EstadoCivil.values()) {
            if (auxCivil.toString().equalsIgnoreCase(estCivil)) {
                estadoCivil = estCivil;
                validar = false;
                break;
            } else {
                validar = true;
            }
        }
        if (validar) {
            System.out.println("No se ingresó una opción válida. Se asigna 'SOLTERO'");
            estadoCivil = "SOLTERO";
        }
    }

    public void cambioEstadoCivil() {
        System.out.println("Actualmente tiene estado civil " + estadoCivil);
        System.out.println("Indique estado civil para cambiar:");
        String respuesta = sc.next().toUpperCase();
        boolean validar = false;
        for (EstadoCivil estado : EstadoCivil.values()) {
            if (estado.toString().equalsIgnoreCase(respuesta)) {
                estadoCivil = respuesta;
                validar = false;
                break;
            } else {
                validar = true;
            }
        }
        if (validar) {
            System.out.println("No se ingresó una opción válida.");
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nDNI: " + dni
                + "\nEstado Civil: " + estadoCivil + "\n";
    }

}
