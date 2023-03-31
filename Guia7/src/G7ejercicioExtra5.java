
import Entidades.Cuenta;
import java.util.Scanner;

public class G7ejercicioExtra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cuenta cuenta1 = new Cuenta();
        cuenta1.cargarCliente();
        int opc;
        do {
            System.out.println("MENU");
            System.out.println("1 - Depositar");
            System.out.println("2 - Retirar");
            System.out.println("0 - Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Cuanto dinero va a depositar?");
                    double deposito = leer.nextDouble();
                    cuenta1.depositar_dinero(deposito);
                    break;
                case 2:
                    System.out.println("Cuanto dinero va a retirar?");
                    double ret = leer.nextDouble();
                     cuenta1.retirar_dinero(ret);
                     break;
                case 0:
                    System.out.println("Muchas gracias, vuelva pronto");
                    
                     break;
                default :
                    System.out.println("Ingrese una opcion válida");
                    opc = leer.nextInt();
                    break;
            }

        } while (opc != 0);

    }

}
