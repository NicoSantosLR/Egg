package Servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RazaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargaRazas(ArrayList<String> lista) {
        String raza;
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese la raza de perro:");
            raza = leer.next();
            lista.add(raza);
            System.out.println("Desea agregar otra raza de perro? s/n");
            continuar = leer.next().equalsIgnoreCase("s");
        }
        mostrarRazas(lista);
    }
    
    public void mostrarRazas(ArrayList<String> lista){
        System.out.println("Las razas guardadas son:");
        for (String raza : lista) {
            System.out.println(raza + " ");
        }
    }
    
    public void eliminarRaza(ArrayList<String> lista){
        System.out.println("Que raza desea eliminar de la lista?");
        String raza = leer.next();
        boolean eliminado = false;
        Iterator<String> it = lista.iterator();
        while (it.hasNext()) { 
            String aux = it.next();
            if (aux.equalsIgnoreCase(raza)) {
                it.remove();
                eliminado = true;
            }
        }
        if (eliminado) {
            System.out.println("Raza eliminada");
        } else {
            System.out.println("Raza no encontrada");
        }
        lista.sort(null);
        mostrarRazas(lista);
    }
}
