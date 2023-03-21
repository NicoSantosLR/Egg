/*
 Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un
valor real que represente el costo del tratamiento (previo al descuento) y
determine el importe en efectivo a pagar por dicho socio.

 */
package G3extras;

import java.util.Scanner;

public class G3ejercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tipo de socio (A, B o C):");
        String tipoSocio = leer.next();
        while (!tipoSocio.equalsIgnoreCase("a")
                && !tipoSocio.equalsIgnoreCase("b")
                && !tipoSocio.equalsIgnoreCase("c")) {
            System.out.println("Opción no válida, ingrese nuevamente:");
            tipoSocio = leer.next();
        }
        System.out.println("Ingrese el presupuesto del tratamiento:");
        int presupuesto = leer.nextInt();
        switch (tipoSocio) {
            case "a": case "A":
                System.out.println("Para Socio tipo A tiene descuento de %50");
                System.out.println("Abona un total de $" + (presupuesto*0.5));
                break;
            case "b": case "B":
                System.out.println("Para Socio tipo B tiene descuento de %35");
                System.out.println("Abona un total de $" + (presupuesto*0.65));
                break;
            case "c": case "C":
                System.out.println("Para Socio tipo C no tiene descuento");
                System.out.println("Abona un total de $" + presupuesto);
                break;
        }
    }

}
