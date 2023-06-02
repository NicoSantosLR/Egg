package Ejercicios;

import Servicio.FechaService;
import java.util.Date;

public class G9ejercicio4 {

    public static void main(String[] args) {
        FechaService edad = new FechaService();
        Date usuario = edad.fechaNacimiento();
        System.out.println(usuario);
        Date fechaActual = edad.fechaActual();
        System.out.println(fechaActual);
        edad.diferencia(usuario, fechaActual);
        System.out.println("Edad:");
        System.out.println(edad.diferencia2(usuario, fechaActual));

    }

}
