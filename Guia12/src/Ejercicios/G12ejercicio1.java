package Ejercicios;

import Entidades.*;
import java.util.ArrayList;

public class G12ejercicio1 {

    public static void main(String[] args) {

        //Declaración del objeto Perro
        Animal perro1 = new Perro("Stich", "Carne", 15, "Doberman");
        perro1.alimentarse();

        //Declaración de otro objeto Perro
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.alimentarse();

        //Declaración del objeto Gato
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato1.alimentarse();

        //Declaración del objeto Caballo
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.alimentarse();

        //usamos instanceof, para eso debo tener un ArrayList
        ArrayList<Animal> animales = new ArrayList<>();
        //Metemos los animales dentro del array
        animales.add(perro1);
        animales.add(perro2);
        animales.add(gato1);
        animales.add(caballo1);
        System.out.println("");
        for (Animal animal : animales) {
            if (animal instanceof Perro) {
                System.out.println(animal.getNombre() + " es un perro de " + animal.getEdad() + " años de edad.");
            }
            if (animal instanceof Gato) {
                System.out.println(animal.getNombre() + " es un gato de " + animal.getEdad() + " años de edad.");
            }
            if (animal instanceof Caballo) {
                System.out.println(animal.getNombre() + " es un caballo de " + animal.getEdad() + " años de edad.");
            }
        }

    }

}
