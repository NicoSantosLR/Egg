package Ejercicios;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

public class G8ejercicio2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        CafeteraServicio servicio = new CafeteraServicio();

        Cafetera cafetera = new Cafetera(1800, 500);

        int menu;

        do {
            System.out.println();
            System.out.println("MENU");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar cafe");
            System.out.println("5. Estado actual de la cafetera");
            System.out.println("6. Salir");
            System.out.println();
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    cafetera.setCantidadActual(servicio.llenarCafetera(cafetera));
                    break;
                case 2:
                    servicio.servirTaza(cafetera);
                    break;
                case 3:
                    servicio.vaciarCafetera(cafetera);
                    break;
                case 4:
                    servicio.agregarCafe(cafetera);
                    break;
                case 5:
                    System.out.println("Capacidad maxima: " + cafetera.getCapacidadMaxima());
                    System.out.println("Cantidad actual: " + cafetera.getCantidadActual());
                    break;
                case 6:
                    break;
            }
            
        } while (menu!=6);
        

    }

}
