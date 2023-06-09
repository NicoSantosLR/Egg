package Ejercicios;

import Entidad.Persona;
import Servicio.PersonaService;

public class G13ejercicio1 {

    public static void main(String[] args) {
        PersonaService srv = new PersonaService();
        Persona vacia = null;
        //srv.esMayorDeEdad(vacia);

        try {
            srv.esMayorDeEdad(vacia);
        } catch (NullPointerException a) {
            System.out.println("jerarquia 1");
        } catch (Exception e) {
            System.out.println("No tiene atributos 2");
        }

    }

}
