
package Ejercicios;

import Entidad.ParDeNumeros;
import Servicio.ParDeNumerosService;

public class G9ejercicio2 {

    public static void main(String[] args) {

        ParDeNumerosService serv = new ParDeNumerosService();
        
        ParDeNumeros n1 = new ParDeNumeros();
        
        serv.mostrarValores(n1);
        
        serv.devolverMayor(n1);
        
        serv.calcularPotencia(n1);
        
        serv.calculaRaiz(n1);
        
    }

}
