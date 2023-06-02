package Servicios;

import Entidades.Barco;
import Entidades.BarcosMotor;
import Entidades.Velero;
import Entidades.Yates;
import java.util.Scanner;

public class BarcoService {

    private Barco barco;

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public BarcoService() {
        this.barco = new Barco();
    }

    public Barco crearTipoBarco() {
        System.out.println("Que tipo de barco desea?"
                + "\n1 - Velero"
                + "\n2 - Barco a motor"
                + "\n3 - Yate de lujo");
        int opc = 0;
        switch (opc) {
            case 1:
                crearBarco();
                Velero velero = new Velero();
                velero.calcularModulo();
                return velero;
            case 2:
                crearBarco();
                BarcosMotor barcoMotor = new BarcosMotor();
                barcoMotor.calcularModulo();
                return barcoMotor;
            case 3:
                crearBarco();
                Yates yate = new Yates();
                yate.calcularModulo();
                return yate;
        }
        return null;
    }

    public void crearBarco() {
        System.out.println("Ingrese matricula:");
        String matricula = sc.next();
        barco.setMatricula(matricula);
        System.out.println("Ingrese eslora en metros:");
        int eslora = sc.nextInt();
        barco.setEslora(eslora);
        System.out.println("Ingrese año de fabricación:");
        String anioFabricacion = sc.next();
        barco.setAnioFabricacion(anioFabricacion);
    }
}
