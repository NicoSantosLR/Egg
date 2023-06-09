package Ejercicios;

import Entidad.Persona;
import Servicio.PersonaService;

public class G8ejercicio3 {

    public static void main(String[] args) {
        PersonaService servicio = new PersonaService();
        //int[] IMC = new int[4];
        //boolean[] edades = new boolean[4];
        Persona persona1 = servicio.crearPersona();
        Persona vacia = null;
//        System.out.println(servicio.calcularIMC(persona1));
//        System.out.println(servicio.esMayorDeEdad(persona1));

/*
        Persona persona1 = new Persona("Yasar", 29, "h", 114, 1.79);
        System.out.println(persona1);
        System.out.println(servicio.calcularIMC(persona1));
        System.out.println(servicio.esMayorDeEdad(persona1));
        IMC[0] = servicio.calcularIMC(persona1);
        edades[0] = servicio.esMayorDeEdad(persona1);

        Persona persona2 = new Persona("Victoria", 31, "m", 80, 1.69);
        System.out.println(persona2);
        System.out.println(servicio.calcularIMC(persona2));
        System.out.println(servicio.esMayorDeEdad(persona2));
        IMC[1] = servicio.calcularIMC(persona2);
        edades[1] = servicio.esMayorDeEdad(persona2);

        Persona persona3 = new Persona("Enzo", 17, "h", 75, 1.83);
        System.out.println(persona3);
        System.out.println(servicio.calcularIMC(persona3));
        System.out.println(servicio.esMayorDeEdad(persona3));
        IMC[2] = servicio.calcularIMC(persona3);
        edades[2] = servicio.esMayorDeEdad(persona3);

        Persona persona4 = new Persona("Eric", 25, "h", 50, 1.75);
        System.out.println(persona4);
        System.out.println(servicio.calcularIMC(persona4));
        System.out.println(servicio.esMayorDeEdad(persona4));
        IMC[3] = servicio.calcularIMC(persona4);
        edades[3] = servicio.esMayorDeEdad(persona4);

        calcularPromedioIMC(IMC);
        calcularPromedioEdad(edades);
*/
    }

    public static void calcularPromedioIMC(int[] IMC) {
        int bajoPeso = 0;
        int pesoIdeal = 0;
        int sobrePeso = 0;
        for (int i = 0; i < IMC.length; i++) {
            if (IMC[i] == -1) {
                bajoPeso++;
            }
            if (IMC[i] == 0) {
                pesoIdeal++;
            }
            if (IMC[i] == 1) {
                sobrePeso++;
            }
        }
        System.out.println("Hay por debajo del peso " + bajoPeso * 100 / IMC.length + "%");
        System.out.println("Hay con peso ideal " + pesoIdeal * 100 / IMC.length + "%");
        System.out.println("Hay con sobrepeso " + sobrePeso * 100 / IMC.length + "%");
    }

    public static void calcularPromedioEdad(boolean[] edades) {
        int menor = 0;
        int mayor = 0;
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] == false) {
                menor++;
            }
            if (edades[i] == true) {
                mayor++;
            }
        }
        System.out.println("Hay " + menor * 100 / edades.length + "% de menores de edad");
        System.out.println("Hay " + mayor * 100 / edades.length + "% de mayores de edad");
    }

}
