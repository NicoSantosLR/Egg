package Entidades;


/*
En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
 */
public class Estudiante extends Persona {

    private String curso;

    public Estudiante() {
    }

    public Estudiante(String curso, String nombre, String apellido, String dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cambioCurso() {
        System.out.println("Atual curso en el que está matriculado: " + curso);
        System.out.println("Ingrese el nuevo curso a matricular:");
        curso = sc.next();
    }

    @Override
    public void crearPersona() {
        super.crearPersona();
        System.out.print("Curso: ");
        curso = sc.next();
    }

    @Override
    public String toString() {
        return "Estudiante\n" + super.toString() + "Curso: " + curso;
    }

}
