package Ejercicios;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;

public class G12ejercicioExtra2 {

    public static void main(String[] args) {

        ArrayList<Edificio> listaEdificios = new ArrayList<>();

        Edificio edificio1 = new Polideportivo("Deportivo A", true, 30, 5, 50);
        Edificio edificio2 = new Polideportivo("Deportivo B", false, 50, 15, 80);
        Edificio edificio3 = new EdificioDeOficinas(3, 5, 4, 10, 15, 30);
        Edificio edificio4 = new EdificioDeOficinas(4, 8, 5, 25, 20, 40);

        listaEdificios.add(edificio1);
        listaEdificios.add(edificio2);
        listaEdificios.add(edificio3);
        listaEdificios.add(edificio4);

        for (Edificio aux : listaEdificios) {
            if (aux instanceof Polideportivo) {
                System.out.println("-- Polideportivo --");
                System.out.println("Superficie: " + aux.calcularSuperficie() + " m2");
                System.out.println("Volumen: " + aux.calcularVolumen() + " m3");
                if (((Polideportivo) aux).isTechado()) {
                    System.out.println("Es techado");
                } else {
                    System.out.println("No es techado");
                }
            }
            if (aux instanceof EdificioDeOficinas) {
                System.out.println("-- Edificio de oficinas --");
                System.out.println("Superficie: " + aux.calcularSuperficie() + " m2");
                System.out.println("Volumen: " + aux.calcularVolumen() + " m3");
                ((EdificioDeOficinas) aux).cantPersonas();
            }
            System.out.println("------------------------------------------");
        }
    }

}
