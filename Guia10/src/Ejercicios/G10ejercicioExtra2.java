package Ejercicios;

import Entidad.CantanteFamoso;
import Servicios.CantanteFamosoService;
import java.util.ArrayList;

public class G10ejercicioExtra2 {

    public static void main(String[] args) {
        /*
        Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes
        famosos y tendrá como atributos el nombre y discoConMasVentas. Se debe,
        además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
        objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los
        nombres de cada cantante y su disco con más ventas por pantalla. Una vez
        agregado los 5, en otro bucle, crear un menú que le de la opción al
        usuario de agregar un cantante más, mostrar todos los cantantes, eliminar
        un cantante que el usuario elija o de salir del programa. Al final se
        deberá mostrar la lista con todos los cambios.
         */

        CantanteFamosoService service = new CantanteFamosoService();
        
        ArrayList<CantanteFamoso> lista = new ArrayList();
        
        CantanteFamoso cantante1 = new CantanteFamoso("Abel Pinto", "Sueños dorados");
        CantanteFamoso cantante2 = new CantanteFamoso("Luciano Pereyra", "De hoy en adelante");
        CantanteFamoso cantante3 = new CantanteFamoso("Soledad Pastorutti", "Soledad");
        CantanteFamoso cantante4 = new CantanteFamoso("Carlos Rivera", "Sincerándome");
        CantanteFamoso cantante5 = new CantanteFamoso("Axel", "Amo");
        
        lista.add(cantante1);
        lista.add(cantante2);
        lista.add(cantante3);
        lista.add(cantante4);
        lista.add(cantante5);
        
        service.mostrarCantantes(lista);
        System.out.println("");
        service.menu(lista);
    }

}
