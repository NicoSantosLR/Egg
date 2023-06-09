package Servicios;

import Entidades.Empleado;
import Entidades.Estudiante;
import Entidades.Persona;
import Entidades.PersonalDeServicio;
import Entidades.Profesor;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonaService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private final ArrayList<Persona> list;

    public PersonaService() {
        this.list = new ArrayList<>();
    }

    public void menu() {
        int opc;
        do {
            System.out.println("-- MENU --"
                    + "\n1 - Crear Profesor"
                    + "\n2 - Crear Estudiante"
                    + "\n3 - Crear Personal de Servicio"
                    + "\n4 - Cambio estado civil"
                    + "\n5 - Empleados: cambio despacho"
                    + "\n6 - Porfesor: cambio de departamento"
                    + "\n7 - Personal de servicio: traslado de sección"
                    + "\n8 - Estudiante: cambio de matricula"
                    + "\n9 - Mostrar informe"
                    + "\n0 - Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    Profesor profesor = new Profesor();
                    profesor.crearPersona();
                    list.add(profesor);
                    break;
                case 2:
                    Estudiante estudiante = new Estudiante();
                    estudiante.crearPersona();
                    list.add(estudiante);
                    break;
                case 3:
                    PersonalDeServicio personalServicio = new PersonalDeServicio();
                    personalServicio.crearPersona();
                    list.add(personalServicio);
                    break;
                case 4:
                    if (!list.isEmpty()) {
                        System.out.println("Ingrese DNI de la persona de la lista:");
                        mostrarPersonas();
                        System.out.print("DNI: ");
                        String dni = sc.next();
                        if (!dni.equalsIgnoreCase("0")) {
                            cambiarEstadoCivilPorDni(dni);
                        }
                    } else {
                        System.out.println("No se ha cargado ninguna persona");
                    }
                    break;
                case 5:
                    if (!list.isEmpty()) {
                        System.out.println("Ingrese DNI de la persona de la lista:");
                        mostrarEmpleados();
                        System.out.print("DNI: ");
                        String dni = sc.next();
                        if (!dni.equalsIgnoreCase("0")) {
                            cambioDespachoPorDni(dni);
                        }
                    } else {
                        System.out.println("No se ha cargado ninguna persona");
                    }
                    break;
                case 6:
                    if (!list.isEmpty()) {
                        System.out.println("Ingrese DNI de la persona de la lista:");
                        mostrarProfesores();
                        System.out.print("DNI: ");
                        String dni = sc.next();
                        if (!dni.equalsIgnoreCase("0")) {
                            cambioDepactamentoPorDni(dni);
                        }
                    } else {
                        System.out.println("No se ha cargado ninguna persona");
                    }
                    break;
                case 7:
                    if (!list.isEmpty()) {
                        System.out.println("Ingrese DNI de la persona de la lista:");
                        mostrarPersonalServicio();
                        System.out.print("DNI: ");
                        String dni = sc.next();
                        if (!dni.equalsIgnoreCase("0")) {
                            trasladoDeseccionPorDni(dni);
                        }
                    } else {
                        System.out.println("No se ha cargado ninguna persona");
                    }
                    break;
                case 8:
                    if (!list.isEmpty()) {
                        System.out.println("Ingrese DNI de la persona de la lista:");
                        mostrarEstudiantes();
                        System.out.print("DNI: ");
                        String dni = sc.next();
                        if (!dni.equalsIgnoreCase("0")) {
                            cambioMatriculaPorDni(dni);
                        }
                    } else {
                        System.out.println("No se ha cargado ninguna persona");
                    }
                    break;
                case 9:
                    informacionDetallada();
                    break;
            }
        } while (opc != 0);
    }

    public void cambiarEstadoCivilPorDni(String documento) {
        boolean personaNoEncontrada = false;
        for (Persona persona : list) {
            if (persona.getDni().equalsIgnoreCase(documento)) {
                persona.cambioEstadoCivil();
                personaNoEncontrada = false;
                break;
            } else {
                personaNoEncontrada = true;
            }
        }
        if (personaNoEncontrada) {
            System.out.println("No se encontró la persona");
        }
    }

    public void cambioDespachoPorDni(String documento) {
        boolean personaNoEncontrada = false;
        for (Persona persona : list) {
            if (persona instanceof Empleado && persona.getDni().equalsIgnoreCase(documento)) {
                ((Empleado) persona).reasignarDespacho();
                personaNoEncontrada = false;
                break;
            } else {
                personaNoEncontrada = true;
            }
        }
        if (personaNoEncontrada) {
            System.out.println("No se encontró la persona");
        }
    }

    public void cambioDepactamentoPorDni(String documento) {
        boolean personaNoEncontrada = false;
        for (Persona persona : list) {
            if (persona instanceof Profesor && persona.getDni().equalsIgnoreCase(documento)) {
                ((Profesor) persona).cambioDepartamento();
                personaNoEncontrada = false;
                break;
            } else {
                personaNoEncontrada = true;
            }
        }
        if (personaNoEncontrada) {
            System.out.println("No se encontró la persona");
        }
    }

    public void trasladoDeseccionPorDni(String documento) {
        boolean personaNoEncontrada = false;
        for (Persona persona : list) {
            if (persona instanceof PersonalDeServicio && persona.getDni().equalsIgnoreCase(documento)) {
                ((PersonalDeServicio) persona).cambioSeccion();
                personaNoEncontrada = false;
                break;
            } else {
                personaNoEncontrada = true;
            }
        }
        if (personaNoEncontrada) {
            System.out.println("No se encontró la persona");
        }
    }

    public void cambioMatriculaPorDni(String documento) {
        boolean personaNoEncontrada = false;
        for (Persona persona : list) {
            if (persona instanceof Estudiante && persona.getDni().equalsIgnoreCase(documento)) {
                ((Estudiante) persona).cambioCurso();
                personaNoEncontrada = false;
                break;
            } else {
                personaNoEncontrada = true;
            }
        }
        if (personaNoEncontrada) {
            System.out.println("No se encontró la persona");
        }
    }

    public void mostrarPersonas() {
        for (Persona persona : list) {
            System.out.println(persona.getApellido() + ", " + persona.getNombre() + " - DNI: " + persona.getDni());
        }
    }

    public void mostrarEmpleados() {
        int cont = 0;
        for (Persona persona : list) {
            if (persona instanceof Empleado) {
                System.out.println(persona.getApellido() + ", " + persona.getNombre() + " - DNI: " + persona.getDni());
            }
        }
        if (cont == 0) {
            System.out.println("No hay empleados cargados en la lista. Ingrese '0' para continuar");
        }
    }

    public void mostrarProfesores() {
        int cont = 0;
        for (Persona persona : list) {
            if (persona instanceof Profesor) {
                System.out.println(persona.getApellido() + ", " + persona.getNombre() + " - DNI: " + persona.getDni());
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("No hay profesores cargados en la lista. Ingrese '0' para continuar");
        }
    }

    public void mostrarPersonalServicio() {
        int cont = 0;
        for (Persona persona : list) {
            if (persona instanceof PersonalDeServicio) {
                System.out.println(persona.getApellido() + ", " + persona.getNombre() + " - DNI: " + persona.getDni());
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("No hay personal de servicio cargado en la lista. Ingrese '0' para continuar");
        }
    }

    public void mostrarEstudiantes() {
        int cont = 0;
        for (Persona persona : list) {
            if (persona instanceof Estudiante) {
                System.out.println(persona.getApellido() + ", " + persona.getNombre() + " - DNI: " + persona.getDni());
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("No hay estudiantes cargados en la lista. Ingrese '0' para continuar");
        }
    }

    private void informacionDetallada() {
        for (Persona persona : list) {
            System.out.println(persona);
            System.out.println("-------------");
        }
    }
}
