
import Entidades.Juego;
import java.util.Scanner;

public class G7ejercicioExtra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Juego juego1 = new Juego();

        String opc = null;
        int gana1 = 0;
        int gana2 = 0;
        
        System.out.println("ADIVINA EL NUMERO");

        do {
            juego1.iniciar_juego();
            if (juego1.isGanado()) {
                gana1 ++;
            } else if (juego1.isPerdido()) {
                gana2 ++;
            }
            System.out.println("Desea seguir jugando? s/n");
            opc = leer.next();
        } while (opc.equalsIgnoreCase("s"));
        
        System.out.println("JUGADOR 1 = " + gana1);
        System.out.println("JUGADOR 2 = " + gana2);
    }

}
