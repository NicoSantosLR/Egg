package Servicios;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class PeliculaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPeliculas(ArrayList<Pelicula> lista) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el titulo de la pelicula:");
            String titulo = leer.next();
            System.out.println("Ingrese el director de la misma:");
            String director = leer.next();
            System.out.println("Ingrese duración:");
            float duracion = leer.nextFloat();
            Pelicula pelicula = new Pelicula(titulo, director, duracion);
            lista.add(pelicula);
            System.out.println("Desea agregar otra pelicula? s/n");
            continuar = leer.next().equalsIgnoreCase("s");
        }
    }

    public void mostrarPeliculas(ArrayList<Pelicula> lista) {
        lista.forEach((pelicula) -> {
            System.out.println(pelicula.toString());
        });
    }

    public void mostrarMayorUnaHora(ArrayList<Pelicula> lista) {
        Iterator<Pelicula> it = lista.iterator();
        System.out.println("Las peliculas con duraciçon mayor a una hora son:");
        for (int i = 0; i < lista.size(); i++) {
            Pelicula peliAux = it.next();
            if (peliAux.getDuracion() > 1) {
                System.out.println(peliAux.toString());
            }
        }
    }

    public void ordenarDuracionMayor(ArrayList<Pelicula> lista) {
        System.out.println("Orden duracion de mayor a menor");
        lista.sort(Comparator.comparing(Pelicula::getDuracion).reversed());
        mostrarPeliculas(lista);
    }

    public void ordenarDuracionMenor(ArrayList<Pelicula> lista) {
        System.out.println("Orden duracion de menor a mayor");
        lista.sort(Comparator.comparing(Pelicula::getDuracion));
        mostrarPeliculas(lista);
    }

    public void ordenarTitulo(ArrayList<Pelicula> lista) {
        System.out.println("Orden por titulo alfabeticamente");
        lista.sort(Comparator.comparing(Pelicula::getTitulo));
        mostrarPeliculas(lista);
    }

    public void ordenarDirector(ArrayList<Pelicula> lista) {
        System.out.println("Orden por Director alfabeticamente");
        lista.sort(Comparator.comparing(Pelicula::getDirector));
        mostrarPeliculas(lista);
    }

}
