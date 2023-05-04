
package Ejercicios;

import Entidad.Pelicula;
import Servicios.PeliculaService;
import java.util.ArrayList;

public class G10ejercicio4 {

    public static void main(String[] args) {

        PeliculaService serv = new PeliculaService();
        ArrayList<Pelicula> peliculas = new ArrayList();
        serv.crearPeliculas(peliculas);
        System.out.println("--------------------------");
        serv.mostrarPeliculas(peliculas);
        System.out.println("--------------------------");
        serv.mostrarMayorUnaHora(peliculas);
        System.out.println("--------------------------");
        serv.ordenarDuracionMayor(peliculas);
        System.out.println("--------------------------");
        serv.ordenarDuracionMenor(peliculas);
        System.out.println("--------------------------");
        serv.ordenarTitulo(peliculas);
        System.out.println("--------------------------");
        serv.ordenarDirector(peliculas);
    }

}
