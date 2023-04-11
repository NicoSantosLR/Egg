package Ejercicios;

import Entidad.NIF;
import Servicio.NIFService;

public class G8ejercicioExtra2 {
    public static void main(String[] args) {
        NIFService servicio = new NIFService();

        NIF nif1 = servicio.crearNIF();

        servicio.mostrar(nif1);
    }
}
