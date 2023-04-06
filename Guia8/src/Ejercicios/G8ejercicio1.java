package Ejercicios;

import Entidad.CuentaBancaria;
import Servicio.CuentaBancariaServicio;
import java.util.Scanner;

public class G8ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio servicio = new CuentaBancariaServicio();
        
        CuentaBancaria cuenta1 = servicio.crearCuenta();
        
        int menu;
        do {
            System.out.println();
            System.out.println();
            System.out.println("Menu");
            System.out.println("1. Ingresar Dinero");
            System.out.println("2. Retirar Dinero");
            System.out.println("3. Extraccion Rapida (Max 20% del saldo)");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Consultar Datos");
            System.out.println("0. SALIR");
            menu=leer.nextInt();
            switch (menu){
                case 1:
                    servicio.ingresar(cuenta1);
                    break;
                case 2:
                    servicio.retirar(cuenta1);
                    break;
                case 3:
                    servicio.extraccionRapida(cuenta1);
                    break;
                case 4:
                    servicio.consultarSaldo(cuenta1);
                    break;
                case 5:
                    servicio.consultarDatos(cuenta1);
                    break;
                default:
            }
        }while (menu!=0);
    }
    
}
