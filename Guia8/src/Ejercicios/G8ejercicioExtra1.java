
package Ejercicios;

import Entidad.Raices;
import Servicio.RaicesServicio;
import java.util.Scanner;

public class G8ejercicioExtra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        RaicesServicio srv = new RaicesServicio();
        System.out.println("Ingrese los valores de a, b y c:");
        double a = leer.nextDouble();
        double b = leer.nextDouble();
        double c = leer.nextDouble();
        Raices r1 = new Raices(a, b, c);
        srv.getDiscriminante(r1);
        srv.calcular(r1);
    }

}
