package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {
        Ahorcado juego = new Ahorcado();
        System.out.println("Ingrese la palabra a adivinar:");
        String palabra = leer.next();
        String[] vectorPalabra = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            vectorPalabra[i] = palabra.substring(i, i + 1);
        }
        juego.setPalabra(vectorPalabra);
        System.out.println("Cantidad de intentos en la que se puede adivinar");
        juego.setCantJugadasMax(leer.nextInt());
        return juego;
    }

    public void longitud(Ahorcado ahorcado) {
        System.out.println("Longitud de la palabra: " + ahorcado.getPalabra().length);
    }

    public void buscar(Ahorcado ahorcado, String letra) {
        boolean encontrada = false;
        for (String letraVector : ahorcado.getPalabra()) {
            if (letraVector.equalsIgnoreCase(letra)) {
                encontrada = true;
                break;
            }
        }
        if (encontrada) {
            System.out.println("Mensaje: La letra pertenece a la palabra");
        } else {
            System.out.println("Mensaje: La letra no pertenece a la palabra");
        }
    }

    public void encontradas(Ahorcado ahorcado, String letra) {
        boolean encontrada = false;
        int cont = 0;
        for (String letraVector : ahorcado.getPalabra()) {
            if (letraVector.equalsIgnoreCase(letra)) {
                cont++;
                encontrada = true;
            }
        }
        if (encontrada) {
            ahorcado.setCantLetrasEncontradas(ahorcado.getCantLetrasEncontradas() + cont);
        } else {
            ahorcado.setCantJugadasMax(ahorcado.getCantJugadasMax() - 1);
        }
        System.out.println("Numero de letras (encontradas, faltantes): ("
                + ahorcado.getCantLetrasEncontradas() + "," + (ahorcado.getPalabra().length - ahorcado.getCantLetrasEncontradas()) + ")");
    }

    public void intentos(Ahorcado ahorcado) {
        System.out.println("Numero de oportunidades restantes: " + ahorcado.getCantJugadasMax());
    }
}
