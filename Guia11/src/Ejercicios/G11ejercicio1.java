package Ejercicios;

import Entidad.Perro;
import Entidad.Persona;
import Servicio.AdopcionServicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class G11ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AdopcionServicio servicio = new AdopcionServicio();
        List<Persona> personas = new ArrayList();
        List<Perro> perros = new ArrayList();

        System.out.println("Cargar personas");
        for (int i = 0; i < 2; i++) {
            System.out.println("Persona " + (i + 1));
            personas.add(servicio.crearPersona());
        }

        System.out.println("Cargar perros");
        for (int i = 0; i < 2; i++) {
            System.out.println("Perro " + (i + 1));
            perros.add(servicio.crearPerro());
        }

        for (Persona persona : personas) {
            System.out.println("Para la persona " + persona.getNombre() + " " + persona.getApellido()
                    + "\nSeleccione uno de los perros:");
            for (Perro perro : perros) {
                System.out.println("Nombre: " + perro.getNombre() + "\nRaza: " + perro.getRaza());
                System.out.println("");
            }
            String adoptable = leer.next();
            int cont = 0;
            for (int i = 0; i < perros.size(); i++) {
                if (adoptable.equalsIgnoreCase(perros.get(i).getNombre())) {
                    persona.setPerro(perros.get(i));
                    cont++;
                    perros.remove(i);
                }
            }
            if (cont == 0) {
                System.out.println("No se adopto un perro");
            }

        }
        System.out.println("Las siguientes personas han adoptado");
        for (Persona persona : personas) {
            if (persona.getPerro() == null) {
                System.out.println(persona.getNombre() + " no ha adoptado ningun perro");
            } else {
                System.out.println(persona.getNombre() + " adopto a " + persona.getPerro().getNombre()
                        + " de raza " + persona.getPerro().getRaza());
            }
        }

    }

}
