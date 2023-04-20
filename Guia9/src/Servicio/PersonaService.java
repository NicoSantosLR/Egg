package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        System.out.println("Ingrese su nombre:");
        String nombre = leer.next();
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el dia");
        int dia = leer.nextInt();
        Date fechaNacimiento = new Date(anio - 1900, mes - 1, dia);
        return new Persona(nombre, fechaNacimiento);
    }

    public int calcularEdad(Persona persona) {
        Date fechaActual = new Date();
        int anios = fechaActual.getYear() - persona.getFechaNacimiento().getYear();
        if (persona.getFechaNacimiento().getMonth() > fechaActual.getMonth()
                || (persona.getFechaNacimiento().getMonth() == fechaActual.getMonth() && persona.getFechaNacimiento().getDate() > fechaActual.getDate())) {
            anios--;
        }
        return anios;
    }

    public boolean menorQue(Persona persona, int edad) {
        return calcularEdad(persona) < edad;
    }

    public void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        //System.out.println("Fecha de nacimiento: " + (persona.getFechaNacimiento().getDay()+12) + "/" + (persona.getFechaNacimiento().getMonth()+1) + "/" + (persona.getFechaNacimiento().getYear()+1900));
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
        System.out.println("Edad: " + calcularEdad(persona) + " años");
        System.out.println("A que edad es menor?");
        int menor = leer.nextInt();
        System.out.println("Es menor de " + menor + ": " + menorQue(persona, menor));
    }
}
