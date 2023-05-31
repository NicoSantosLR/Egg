package Servicio;

import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;
import java.util.Random;

/*
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)

• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.

llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
public class RuletaServicio {

    public void llenarRevolver(Revolver revolver) {
        Random ramdon = new Random();
        revolver.setPosActual(ramdon.nextInt(6) + 1);
        revolver.setPosAgua(ramdon.nextInt(6) + 1);
    }

    public boolean mojar(Revolver revolver) {
        boolean corchazo = false;
        if (revolver.getPosActual() == revolver.getPosAgua()) {
            corchazo = true;
        }
        return corchazo;
    }

    public void siguienteChorro(Revolver revolver) {
        if (revolver.getPosActual() < 6) {
            revolver.setPosActual(revolver.getPosActual() + 1);
        } else {
            revolver.setPosActual(1);
        }
    }

    public boolean disparo(Jugador jugador, Revolver revolver) {
        boolean seMojo = false;
        if (mojar(revolver)) {
            jugador.setMojado(true);
            seMojo = true;
        }
        return seMojo;
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver) {
        for (int i = 0; i < 6; i++) {
            Jugador player = new Jugador();
            player.setId(i + 1);
            //player.setNombre("Jugador " + (i + 1));
            player.setNombre("Jugador ".concat(String.valueOf(player.getId())));
            jugadores.add(player);
        }
        llenarRevolver(revolver);
    }
    
    public boolean ronda(Jugador jugador, Revolver revolver){
        boolean continua = true;
        if (disparo(jugador, revolver)) {
            continua = false;
        }
        return continua;
    }
}
