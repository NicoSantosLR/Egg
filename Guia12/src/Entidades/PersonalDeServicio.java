package Entidades;


/*
Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
 */
public class PersonalDeServicio extends Empleado {

    private String seccion;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(String seccion, String anioIncorporacion, int numeroDespacho, String nombre, String apellido, String dni, String estadoCivil) {
        super(anioIncorporacion, numeroDespacho, nombre, apellido, dni, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public void cambioSeccion() {
        System.out.println("Seccion actual: " + seccion);
        System.out.println("Ingrese la nueva seccion:");
        seccion = sc.next();
    }

    @Override
    public void crearPersona() {
        super.crearPersona();
        System.out.print("Sección asignada: ");
        seccion = sc.next();
    }

    @Override
    public String toString() {
        return "Personal de Servicio\n" + super.toString() + "Sección: " + seccion;
    }
}
