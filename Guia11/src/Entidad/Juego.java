package Entidad;

import java.util.ArrayList;

/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
*/
public class Juego {
    private ArrayList<Jugador> listaJugadores;
    private Revolver revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> listaJugadores, Revolver revolver) {
        this.listaJugadores = listaJugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }
    
    
}
