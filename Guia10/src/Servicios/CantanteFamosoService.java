package Servicios;

import Entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

public class CantanteFamosoService {

    Scanner sca = new Scanner(System.in).useDelimiter("\n");

    public void agregarCantante(ArrayList<CantanteFamoso> lista) {
        System.out.println("Ingrese el nombre del nuevo cantante:");
        String nombre = sca.next();
        System.out.println("Cuál es su album más vendido?");
        String album = sca.next();
        CantanteFamoso cantante = new CantanteFamoso(nombre, album);
        lista.add(cantante);
    }

    public void mostrarCantantes(ArrayList<CantanteFamoso> lista) {
        System.out.println("Los cantantes en la lista son:");
        System.out.println("----------------------------------");
        for (CantanteFamoso cantante : lista) {
            System.out.println("Cantante: " + cantante.getNombre());
            System.out.println("Disco más vendido: " + cantante.getDiscoConMasVentas());
            System.out.println("----------------------------------");
        }
    }

    public void eliminarCantante(ArrayList<CantanteFamoso> lista) {
        System.out.println("Ingrese el nombre del cantante a eliminar:");
        String cantanteEliminar = sca.next();
        boolean encontrado = false;
        for (CantanteFamoso cantante : lista) {
            if (cantante.getNombre().equalsIgnoreCase(cantanteEliminar)) {
                lista.remove(cantante);
                System.out.println("Cantante eliminado de la lista");
                encontrado = true;
                break;
            }

        }
        if (!encontrado) {
            System.out.println("Cantante no encontrado");
        }
    }

    public void menu(ArrayList<CantanteFamoso> lista) {
        int opc;
        do {
            System.out.println("*** Cantantes Famosos ***");
            System.out.println("1. Agregar otro cantante.");
            System.out.println("2. Mostrar todos los cantantes.");
            System.out.println("3. Borrar un cantante.");
            System.out.println("4. Salir.");
            System.out.println("Ingrese una opcion: ");
            opc = sca.nextInt();

            switch (opc) {
                case 1:
                    agregarCantante(lista);
                    break;
                case 2:
                    mostrarCantantes(lista);
                    break;
                case 3:

                    eliminarCantante(lista);
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while (opc != 4);
    }
}
