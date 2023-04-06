package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);
    

    public int llenarCafetera(Cafetera cafetera) {
        System.out.println("Se llenó la cafetera");
        return cafetera.getCapacidadMaxima();
    }

    public void servirTaza(Cafetera cafetera) {
        System.out.println("Indique el tamaño de la taza en ml:");
        int taza = leer.nextInt();
        if (taza > cafetera.getCantidadActual()) {
            System.out.println("No había suficiente café para llenar la taza");
            System.out.println("Se llenó con " + cafetera.getCantidadActual() + " ml");
            cafetera.setCantidadActual(0);
        } else {
            System.out.println("Se llenó la taza");
            cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
        }
    }

    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
        System.out.println("Se vació la cafetera");
    }

    //Le ponemos agua para hacer más café
    public void agregarCafe(Cafetera cafetera) {
        System.out.println("Ingrese la cantidad de agua a agregar en ml:");
        int agua = leer.nextInt();
        int restante = cafetera.getCapacidadMaxima() - cafetera.getCantidadActual();
        if (agua <= restante) {
            System.out.println("Se agregó " + agua + " ml de agua");
            cafetera.setCantidadActual(cafetera.getCantidadActual() + agua);
        } else {
            System.out.println("La cantidad excede a la capacidad máxima");
        }
    }
}
