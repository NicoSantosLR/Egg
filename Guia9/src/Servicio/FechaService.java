package Servicio;

import java.util.Date;
import java.util.Scanner;

/*
a) Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento.
Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
b) Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el
constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
c) Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años
entre una y otra (edad del usuario).
 */
public class FechaService {

    Scanner leer = new Scanner(System.in);

    public Date fechaNacimiento() {
        System.out.println("Ingrese su día de nacimiento:");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = leer.nextInt() - 1;
        System.out.println("Ingrese el año:");
        int anio = leer.nextInt() - 1900;
        return new Date(anio, mes, dia);
    }

    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }

    public void diferencia(Date fecha1, Date fecha2) {
        System.out.println("Diferencia de años:");
        System.out.println(fecha2.getYear() - fecha1.getYear());
    }

    public int diferencia2(Date fechaNacimiento, Date fechaActual) {
        int anios = fechaActual.getYear() - fechaNacimiento.getYear();
        if (fechaNacimiento.getMonth() > fechaActual.getMonth()
                || (fechaNacimiento.getMonth() == fechaActual.getMonth() && fechaNacimiento.getDate() > fechaActual.getDate())) {
            anios--;
        }
        return anios;
    }

    public static int diferencia3(Date fechaNacimiento, Date fechaActual) {
        long diff = fechaActual.getTime() - fechaNacimiento.getTime();
        long diffYears = diff / (24 * 60 * 60 * 1000) / 365; // calcula la diferencia en años
        return (int) diffYears;
    }
}
