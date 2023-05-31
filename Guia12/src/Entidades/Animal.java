package Entidades;

public class Animal {

    //Atributos protected para usarlos en la misma clase y sus hijas
    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String raza;

    //Constructores para poder usar los atributos desde la clase de sus hijos
    public Animal() {
    }

    public Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    //Método que vamos a sobrescribir en las clases hijas
    public void alimentarse() {
        System.out.println("El animal se alimenta de: " + alimento);
    }
}
