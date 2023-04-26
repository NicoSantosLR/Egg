package Ejercicios;

import Entidad.Estudiante;
import Servicio.EstudianteService;

public class Integrador {

    public static void main(String[] args) {
        // inicializo todos los objetos con el constructor por parámetros
        Estudiante persona1 = new Estudiante("Nico Santos", 10);
        Estudiante persona2 = new Estudiante("Juan Perez", 8);
        Estudiante persona3 = new Estudiante("Francisco Lopez", 7);
        Estudiante persona4 = new Estudiante("Maria Lerda", 4.5);
        Estudiante persona5 = new Estudiante("Ana Solis", 6);
        Estudiante persona6 = new Estudiante("Pedro Pascal", 3.5);
        Estudiante persona7 = new Estudiante("Leo Arauco", 7.5);
        Estudiante persona8 = new Estudiante("Enzo Baez", 9);
        // Creamos el vector de objetos de la clase Estudiante
        Estudiante[] arregloEstudiante = {persona1, persona2, persona3, persona4, persona5, persona6, persona7, persona8};
        // instanciamos un objeto de la clase EstudianteService para llamar los métodos
        EstudianteService service = new EstudianteService();
        // imprimimos el promedio
        System.out.println("El promedio es " + service.calcularPromedio(arregloEstudiante));
        // Creamos el vector para guardar los nombres con mayor promedio
        //String[] arribaPromedio = service.promedioMayor(arregloEstudiante);
        // Imprimimos por pantalla
        //service.mostrar(arribaPromedio);
        // Mostramos pasando vector de objetos
        service.mostrarMayorAlPromedio(arregloEstudiante);
    }

}
