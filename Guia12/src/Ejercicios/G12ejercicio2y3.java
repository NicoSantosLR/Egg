package Ejercicios;

import Entidades.Electrodomesticos;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

public class G12ejercicio2y3 {

    public static void main(String[] args) {
        /* Ejercicio 2
        //Instanciamos 2 objetos
        Lavadora lavadora1 = new Lavadora();
        Televisor tele1 = new Televisor();

        //Llamamos a los metodos para crarlo y precio final
        System.out.println("__Creando lavadora__");
        lavadora1.crearLavadora();
        lavadora1.precioFinal();
        System.out.println(lavadora1);
        System.out.println("--------------------------------------------");
        System.out.println("__Creando televisor__");
        tele1.crearTelevisor();
        tele1.precioFinal();
        System.out.println(tele1);
         */
        ///* Ejercicio 3
        ArrayList<Electrodomesticos> electros = new ArrayList<>();
        Lavadora lava1 = new Lavadora(10.5, 4200d, "blanco", "a", 15d);
        Lavadora lava2 = new Lavadora(8.5, 3200d, "negro", "b", 12d);
        Televisor tele3 = new Televisor(44d, true, 3300d, "negro", "a", 5d);
        Televisor tele4 = new Televisor(32d, false, 2800d, "blanco", "b", 4d);
        electros.add(lava1);
        electros.add(lava2);
        electros.add(tele3);
        electros.add(tele4);
        double sumaTeles = 0;
        double sumaLavadoras = 0;
        for (Electrodomesticos electro : electros) {
            if (electro instanceof Lavadora) {
                electro.precioFinal();
                sumaLavadoras += electro.getPrecio();
            }
            if (electro instanceof Televisor) {
                electro.precioFinal();
                sumaTeles += electro.getPrecio();
            }
        }
        System.out.println("Lavadoras: $" + sumaLavadoras);
        System.out.println("Televisores: $" + sumaTeles);
        System.out.println("Total = $" + (sumaLavadoras + sumaTeles));
        System.out.println("");
        for (Electrodomesticos electro : electros) {
            System.out.println(electro);
        }
        //*/
    }

}
