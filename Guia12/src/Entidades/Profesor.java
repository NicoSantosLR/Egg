package Entidades;


/*
Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
 */
public class Profesor extends Empleado {

    private String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, String anioIncorporacion, int numeroDespacho, String nombre, String apellido, String dni, String estadoCivil) {
        super(anioIncorporacion, numeroDespacho, nombre, apellido, dni, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void cambioDepartamento() {
        System.out.println("Actual departamento: " + departamento);
        System.out.println("Ingrese el nombre del nuevo departamento:");
        departamento = sc.next();
    }

    @Override
    public void crearPersona() {
        super.crearPersona();
        System.out.print("Departamento: ");
        departamento = sc.next();
    }

    @Override
    public String toString() {
        return "Profesor\n" + super.toString() + "Departamento: " + departamento;
    }

}
