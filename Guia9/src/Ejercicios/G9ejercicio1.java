package Ejercicios;

import Entidad.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

public class G9ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaServicio servicio = new CadenaServicio();
        System.out.println("Ingrese una frase:");
        //String frase = leer.next();
        Cadena fraseCadena = new Cadena(leer.next());
        //servicio.mostrarVocales(fraseCadena);
        servicio.mostrarVocales2(fraseCadena);

        System.out.println("-------------");

        servicio.invertirFrase(fraseCadena);
//        servicio.invertirFrase2(fraseCadena);

        System.out.println("-------------");

        System.out.println("Ingrese la letra a buscar en la frase");
        char letra = leer.next().charAt(0);
        servicio.vecesRepetido(fraseCadena, letra);

        System.out.println("-------------");

        System.out.println("Ingrese una frase nueva:");
        String nuevaFrase = leer.next();
        servicio.compararLongitud(fraseCadena, nuevaFrase);

        System.out.println("-------------");

        System.out.println("Escriba una frase o palabara para unir a la original:");
        String fraseUnir = leer.next();
        servicio.unirFrases(fraseCadena, fraseUnir);

        System.out.println("-------------");

        System.out.println("Elija una letra o simbolo para reemplazar la letra 'a':");
        servicio.remplazarLaA(fraseCadena, leer.next());
        System.out.println(fraseCadena.getFrase());

        System.out.println("-------------");
        System.out.println("Ingrese una caracter a encontar en la cadena");
        servicio.contiene2(fraseCadena, leer.next());
    }

}
