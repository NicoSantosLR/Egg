package Ejercicios;

import Entidad.Persona;
import Servicio.PersonaService;

public class G8ejercicioTeorico {

    public static void main(String[] args) {
        PersonaService persServicio = new PersonaService();
        Persona nuePersona = persServicio.crearPersona();
        System.out.println(nuePersona.getNombre());

    }

}
