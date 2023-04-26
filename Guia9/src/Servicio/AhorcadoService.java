package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

    /*
Método encontradas(letra):  que reciba una letra ingresada por el usuario y
muestre cuantas letras han sido encontradas y cuántas le faltan. Este método
además deberá devolver true si la letra estaba y false si la letra no estaba,
ya que, cada vez que se busque una letra que no esté, se le restará uno a sus
oportunidades.
Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la letraVector
o se quede sin intentos. Este método se llamará en el main.
     */    
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
    
    public boolean buscar(Ahorcado ahorcado, String letra) {
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
            System.out.println("La letra pertenece a la palabra");
        } else {
            System.out.println("La letra no pertenece a la palabra");
        }
        return encontrada;
    }
    
    public boolean encontradas(Ahorcado ahorcado, String letra) {
        return true;
    }
}
