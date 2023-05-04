
package Ejercicios;

import Servicios.PaisesService;
import java.util.*;

public class G10ejercicio5 {

    public static void main(String[] args) {
        PaisesService service = new PaisesService();
        Set<String> paises = new HashSet<>();
        paises = service.cargarPaises();
        System.out.println("-----------------------------------");
        service.mostrarPaises(paises);
        System.out.println("-----------------------------------");
        service.ordenar(paises);
        System.out.println("-----------------------------------");
        service.eliminarPais(paises);
        System.out.println("-----------------------------------");
    }

}
