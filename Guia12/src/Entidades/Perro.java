package Entidades;

public class Perro extends Animal {

    //Constructor por parámetros, los trae de la clase Animal
    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    //Sobrescribimos el método para decir que tipo de animal es.
    @Override
    public void alimentarse() {
        System.out.println("El perro " + nombre + " se alimenta de: " + alimento);
    }
}