
package Ejercicios;

import Servicios.RazaService;
import java.util.ArrayList;

public class G10ejercicio1y2 {

    public static void main(String[] args) {
        ArrayList<String> razas = new ArrayList();
        RazaService servicio = new RazaService();
        servicio.cargaRazas(razas);
        servicio.eliminarRaza(razas);
        
    }

}
