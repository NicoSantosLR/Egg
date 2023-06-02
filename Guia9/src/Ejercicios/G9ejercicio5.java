package Ejercicios;

import Entidad.Persona;
import Servicio.PersonaService;

public class G9ejercicio5 {

    public static void main(String[] args) {
        PersonaService servicio = new PersonaService();
        Persona p1 = servicio.crearPersona();

        servicio.mostrarPersona(p1);
    }

}
