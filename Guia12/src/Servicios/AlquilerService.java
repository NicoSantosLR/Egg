package Servicios;

import Entidades.Alquiler;
import java.util.Date;
import java.util.Scanner;

public class AlquilerService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    private Alquiler alquiler;

    public AlquilerService() {
        this.alquiler = new Alquiler();
    }

    public AlquilerService(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    
    public int calcularDias() {
        System.out.println("Ingrese la fecha del alquiler:");
        alquiler.setFechaAlquiler(calcularFecha());
        System.out.println("Ingrese la fecha de devolución:");
        alquiler.setFechaDevolucion(calcularFecha());
        return (int) (alquiler.getFechaDevolucion().getTime() - alquiler.getFechaAlquiler().getTime()) / (1000 * 60 * 60 * 24);
    }

    public Date calcularFecha() {
        System.out.println("Ingrese el dia:");
        int dia = sc.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = sc.nextInt();
        System.out.println("Ingrese el año:");
        int anio = sc.nextInt();
        return new Date(dia, mes, anio);
    }
}
