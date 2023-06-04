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
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public void crearTipoBarco() {
        System.out.println("Que tipo de barco desea?"
                + "\n1 - Velero"
                + "\n2 - Barco a motor"
                + "\n3 - Yate de lujo");
        int opc = sc.nextInt();
        //Se crea el objeto del tipo de barco y se lo guarda al atributo de la clase
        switch (opc) {
            case 1:
                Velero velero = new Velero();
                crearBarco(velero);
                System.out.println("Ingrese la cantidad de mástiles:");
                int mastiles = sc.nextInt();
                velero.setCantMastiles(mastiles);
                velero.calcularModulo();
                barco = velero;
                break;
            case 2:
                BarcosMotor barcoMotor = new BarcosMotor();
                crearBarco(barcoMotor);
                System.out.println("Ingrese la potencia del barco:");
                int cv = sc.nextInt();
                barcoMotor.setPotenciaCV(cv);
                barcoMotor.calcularModulo();
                barco = barcoMotor;
                break;
            case 3:
                Yates yate = new Yates();
                crearBarco(yate);
                System.out.println("Ingrese la potencia del barco:");
                int yatecv = sc.nextInt();
                yate.setPotenciaCV(yatecv);
                System.out.println("Ingrese la cantidad de camarotes:");
                int camarotes = sc.nextInt();
                yate.setCamarotes(camarotes);
                yate.calcularModulo();
                barco = yate;
                break;
        }
    }

    //Crea un barco del padre de los tipos de barcos
    public void crearBarco(Barco barco) {
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
