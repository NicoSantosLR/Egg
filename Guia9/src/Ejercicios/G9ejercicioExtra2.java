
package Ejercicios;

import Entidad.Ahorcado;
import Servicio.AhorcadoService;
import java.util.Scanner;

public class G9ejercicioExtra2 {

    public static void main(String[] args) {
        juego();
    }
    
    public static void juego(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        AhorcadoService service = new AhorcadoService();
        Ahorcado newGame = service.crearJuego();
        do {            
        System.out.println("----------------------------------------------");
        System.out.println("Ingrese una letra:");
        String letter = sc.next();
        service.longitud(newGame);
        service.buscar(newGame, letter);
        service.encontradas(newGame, letter);
        service.intentos(newGame);
        service.hombrecito(newGame);
        service.resultado(newGame, letter);
        } while (newGame.getCantJugadasMax()!=0 && newGame.getCantLetrasEncontradas()!=newGame.getPalabra().length);
        System.out.println("----------------------------------------------");
        if (newGame.getCantJugadasMax()==0) {
            System.out.println("Perdiste!");
            service.muestraPalabra(newGame);
        } else {
            System.out.println("Ganaste!");
        }
        System.out.println("----------------------------------------------");
    }

}
