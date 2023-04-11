package Servicio;

import Entidad.NIF;

import java.util.Scanner;

public class NIFService {

    public NIF crearNIF() {
        Scanner leer = new Scanner(System.in);
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        System.out.println("Ingrese su DNI");
        long DNI = leer.nextLong();
        double resto = DNI % 23;
        char letra = letras[(int) resto];
        return new NIF(DNI, letra);
    }

    public void mostrar(NIF nif) {
        System.out.println(nif.getDNI() + "-" + nif.getLetra());
    }

}
