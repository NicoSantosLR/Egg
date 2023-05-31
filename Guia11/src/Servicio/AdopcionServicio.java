package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import java.util.Scanner;

/*
    Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 private String nombre;
    private String raza;
    private int edad;
    private String tamanio;
 */
public class AdopcionServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre de la persona:");
        persona.setNombre(leer.next());
        System.out.println("Ingrese el apellido de la persona:");
        persona.setApellido(leer.next());
        System.out.println("Ingrese la edad:");
        persona.setEdad(leer.nextInt());
        System.out.println("Ingrese numero de DNI:");
        persona.setDocumento(leer.next());
        return persona;
    }

    public Perro crearPerro() {
        Perro perro = new Perro();
        System.out.println("Ingrese el nombre del perro:");
        perro.setNombre(leer.next());
        System.out.println("Ingrese la raza:");
        perro.setRaza(leer.next());
        System.out.println("Ingrese la edad:");
        perro.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamaño del perro (chiquito, mediano o grande):");
        perro.setTamanio(leer.next());
        return perro;
    }
}
