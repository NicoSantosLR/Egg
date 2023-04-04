package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaService {
        
    private Scanner leer  = new Scanner(System.in);
        
    public Persona crearPersona() {
        Persona personaConNombre = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        personaConNombre.setNombre(leer.nextLine());
        return personaConNombre;
    }
}
