package Servicios;

import Entidades.Alquiler;
import java.util.Date;
import java.util.Scanner;

public class AlquilerService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    private Alquiler alquiler;
    private BarcoService barco;

    //En el constructior vacío instanciamos un objeto tipo alquiler y tipo basoservice
    public AlquilerService() {
        this.alquiler = new Alquiler();
        this.barco = new BarcoService();
    }

    public AlquilerService(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    //Metodo para crear
    public void crearAlquiler() {
        System.out.println("Ingrese el nombre del cliente:");
        String nombre = sc.next();
        alquiler.setNombreCliente(nombre); //lo seteamos al objeto alquiler
        System.out.println("Número de documento:");
        String dni = sc.next();
        alquiler.setDni(dni); //lo seteamos al objeto alquiler
        barco.crearTipoBarco(); // llamamos al metodo para crear el objeto barco que es un atributo de alquiler
        alquiler.setBarco(barco.getBarco());//lo seteamos al objeto alquiler
        System.out.println("Posición de amarre:");
        String posAmarre = sc.next();
        alquiler.setPosAmarre(posAmarre);//lo seteamos al objeto alquiler
        int dias = calcularDias();
        System.out.println("Cantidad de dias: " + dias + " dias");
        double precio = (double) (dias * alquiler.getBarco().getModulo());
        String precioString = String.format("%.2f", precio); //creamos una variable String con el formato de 2 decimales
        System.out.println("Precio por el Alquiler: $" + precioString);
    }

    public int calcularDias() {
        System.out.println("-- Fecha del alquiler --");
        alquiler.setFechaAlquiler(calcularFecha());
        System.out.println("-- Fecha de devolución --");
        alquiler.setFechaDevolucion(calcularFecha());
        return (int) (alquiler.getFechaDevolucion().getTime() - alquiler.getFechaAlquiler().getTime()) / (1000 * 60 * 60 * 24);
    }

    public Date calcularFecha() {
        System.out.println("Ingrese el dia:");
        int dia = sc.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = sc.nextInt() - 1;
        System.out.println("Ingrese el año:");
        int anio = sc.nextInt() - 1900;
        return new Date(anio, mes, dia);
    }

    public void resumen() {
        System.out.println(alquiler);
    }
}
