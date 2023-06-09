package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public ArrayList<Pelicula> peliculas;

    public PeliculaService() {
        this.peliculas = new ArrayList<>();
    }

    public void bibliotecaPeliculas() {
        for (int i = 0; i < 5; i++) {
            peliculas.add(new Pelicula("Pelicula" + i, (int) (Math.random() * 100), (int) (Math.random() * 100), "Director" + i));
        }
    }
    
    public Pelicula crearPelicula(){
        System.out.println("Ingrese los datos de la película:");
        System.out.println("Titulo:");
        String titulo = sc.next();
        System.out.println("Duración (en minutos):");
        int duracion =sc.nextInt();
        System.out.println("Edad mínima permitida:");
        int edadMinima = sc.nextInt();
        System.out.println("Ingrese director:");
        String director = sc.next();
        return new Pelicula(titulo, duracion, edadMinima, director);
    }
    
    public void agregarPelicula(){
        peliculas.add(crearPelicula());
    }
    
    public void mostrarPeliculas(){
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }
}

