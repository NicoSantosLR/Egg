package Ejercicios;

import Servicio.MazoServicio;
import java.util.Scanner;

public class G11ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        MazoServicio mazoServicio = new MazoServicio();
        int opc;
        //MENU
        do {
            System.out.println("-------------------MENU-------------------");
            System.out.println("1 - Crear baraja\n" +
                    "2 - Barajar\n" +
                    "3 - Mostrar baraja\n" +
                    "4 - Siguiente carta\n" +
                    "5 - Cartas disponibles\n" +
                    "6 - Dar cartas\n" +
                    "7 - Mostrar cartas dadas\n" +
                    "8 - Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    mazoServicio.crearBaraja();
                    break;
                case 2:
                    mazoServicio.barajar();
                    break;
                case 3:
                    mazoServicio.mostrarBaraja();
                    break;
                case 4:
                    mazoServicio.siguienteCarta();
                    break;
                case 5:
                    mazoServicio.cartasDisponibles();
                    break;
                case 6:
                    mazoServicio.darCartas();
                    break;
                case 7:
                    mazoServicio.cartasMonton();
                    break;
                case 8:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Opcion no valida");;
            }
        } while (opc != 8);

    }

}
