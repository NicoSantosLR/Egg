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
        /*
        Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
        */
        ArrayList<Electrodomesticos> electros = new ArrayList<>();
    }

}
