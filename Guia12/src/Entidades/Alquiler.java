package Entidades;

import java.util.Date;

public class Alquiler {

    /*Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará*/
    private String nombreCliente;
    private String dni;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private String posAmarre;
    private Barco barco;

    /*
    Date fechaActual = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaActual);

        int diasASumar = 7; // Número de días a sumar
        calendar.add(Calendar.DAY_OF_YEAR, diasASumar);

        Date nuevaFecha = calendar.getTime();

        System.out.println("Fecha actual: " + fechaActual);
        System.out.println("Nueva fecha después de sumar 7 días: " + nuevaFecha);
    }
}
     */
    public void calcularDias() {
        
    }
}
