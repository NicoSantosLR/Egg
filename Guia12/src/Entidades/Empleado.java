package Entidades;


/*
Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
 */
public class Empleado extends Persona {

    protected String anioIncorporacion;
    protected int numeroDespacho;

    protected Empleado() {
    }

    protected Empleado(String anioIncorporacion, int numeroDespacho, String nombre, String apellido, String dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public void reasignarDespacho() {
        System.out.println("Actual despacho: " + numeroDespacho);
        System.out.println("Reasignar a:");
        numeroDespacho = sc.nextInt();
    }

    @Override
    public void crearPersona() {
        super.crearPersona();
        System.out.print("Año de incorporación: ");
        anioIncorporacion = sc.next();
        System.out.print("Numero de despacho: ");
        numeroDespacho = sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + "Año de incorporacion: " + anioIncorporacion
                + "\nNumero de Despacho: " + numeroDespacho + "\n";
    }

}
