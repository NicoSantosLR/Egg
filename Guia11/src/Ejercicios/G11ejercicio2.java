package Ejercicios;

import Entidad.Jugador;
import Entidad.Revolver;
import Servicio.RuletaServicio;
import java.util.ArrayList;

public class G11ejercicio2 {

    public static void main(String[] args) {

        RuletaServicio servicio = new RuletaServicio();
        ArrayList<Jugador> jugadores = new ArrayList<>();
        Revolver revolver = new Revolver();
        System.out.println("Creando juego");
        servicio.llenarJuego(jugadores, revolver);
        System.out.println("");
        System.out.println("Posicion actual " + revolver.getPosActual());
        System.out.println("Posicion agua " + revolver.getPosAgua());
        System.out.println("");
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println("Posicion actual " + revolver.getPosActual());
            System.out.println("Posicion agua " + revolver.getPosAgua());
            boolean mojado = !servicio.ronda(jugadores.get(i), revolver);
            if (servicio.disparo(jugadores.get(i), revolver)) {
                System.out.println("El " + jugadores.get(i).getNombre() + " se mojó");
            } else {
                System.out.println("El " + jugadores.get(i).getNombre() + " sigue seco");
                System.out.println("");
                servicio.siguienteChorro(revolver);
            }
            if (mojado) {
                break;
            }
        }

    }

}
