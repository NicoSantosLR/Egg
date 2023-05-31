package Servicio;

import Entidad.Cartas;
import Entidad.enumercaiones.Palos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MazoServicio {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Cartas> baraja = new ArrayList<>();
    private ArrayList<Cartas> cartasDadas = new ArrayList<>();

    public void crearBaraja() {
        if (baraja.isEmpty()) {
            System.out.println("Creando baraja");
            for (Palos palo : Palos.values()) {
                for (int i = 1; i < 13; i++) {
                    if (i != 8 && i != 9) {
                        Cartas carta = new Cartas(i, palo);
                        baraja.add(carta);
                    }
                }
            }
        } else {
            System.out.println("Baraja ya creada");
        }
    }

    public void mostrarBaraja() {
        for (Cartas carta : baraja) {
            System.out.println(carta);
        }
        if (baraja.isEmpty()) {
            System.out.println("No hay cartas para mostrar");
        }
    }

    //barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar() {
        if (!baraja.isEmpty()) {
            System.out.println("Barajando...");
            Collections.shuffle(baraja);
        } else {
            System.out.println("No se ha creado la baraja");
        }
    }

    //siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
    //se haya llegado al final, se indica al usuario que no hay más cartas.
    public void siguienteCarta() {
        if (!baraja.isEmpty()) {
            cartasDadas.add(baraja.get(0));
            System.out.println("Carta dada: " + baraja.get(0));
            baraja.remove(0);
        } else {
            System.out.println("No hay más cartas en el mazo");
        }
    }

    //cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles() {
        System.out.println("Cartas disponibles en el mazo: " + baraja.size());
    }

    /*darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
    cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
    debemos indicárselo al usuario.
     */
    public void darCartas() {
        System.out.println("Ingrese la cantidad de cartas a dar:");
        int numCartas = sc.nextInt();
        if (baraja.size() >= numCartas) {
            System.out.println("Cartas dadas:");
            for (int i = 0; i < numCartas; i++) {
                System.out.println(baraja.get(0));
                cartasDadas.add(baraja.get(0));
                baraja.remove(0);
            }

        } else {
            System.out.println("No hay suficientes cartas en el mazo");
        }
    }

    public void cartasMonton() {
        if (!cartasDadas.isEmpty()) {
            System.out.println("Las cartas dadas (cant.: " + cartasDadas.size() + ") son:");
            for (Cartas carta : cartasDadas) {
                System.out.println(carta);
            }
        } else {
            System.out.println("No se dieron cartas todavía");
        }
    }
}
