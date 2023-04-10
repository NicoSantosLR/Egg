package Entidades;

import java.util.Scanner;

public class Juego {

    private int numOculto;
    private int numAdivina;
    private int intentos;
    private boolean ganado;
    private boolean perdido;

    public boolean isGanado() {
        return ganado;
    }

    public void setGanado(boolean ganado) {
        this.ganado = ganado;
    }

    public boolean isPerdido() {
        return perdido;
    }

    public void setPerdido(boolean perdido) {
        this.perdido = perdido;
    }

    Scanner leer = new Scanner(System.in);

    public void iniciar_juego() {
        System.out.println("JUGADOR 1\n----------");
        System.out.println("Escriba el número para adivinar");
        numOculto = leer.nextInt();
        System.out.println("En cuántos intentos:");
        intentos = leer.nextInt();
        System.out.println("JUGADOR 2\n----------");
        do {
            System.out.println("Intenta adivinar el número, tiene " + intentos + " intentos");
            numAdivina = leer.nextInt();
            if (numAdivina < numOculto) {
                intentos--;
                System.out.println("Muy bajo, te quedan " + intentos + " intentos");
            } else if (numAdivina > numOculto) {
                intentos--;
                System.out.println("Muy alto, te quedan " + intentos + " intentos");
            } else if (numAdivina == numOculto) {
                System.out.println("Adivinaste!");
                ganado = true;
            }
        } while (intentos != 0 && ganado != true);
        if (intentos == 0) {
            perdido = true;
        }

    }
}
