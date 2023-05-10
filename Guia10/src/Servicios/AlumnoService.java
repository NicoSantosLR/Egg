package Servicios;

/*
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Alumno> crearAlumnos() {
        ArrayList<Alumno> alumnos = new ArrayList(); // el que voy a retornar
        boolean continuar = true; // Para seguir cargando los alumnos
        while (continuar) {
            System.out.println("Ingrese el nombre del Alumno: ");
            String nombre = leer.next();
            ArrayList<Integer> notas = new ArrayList<>(); // Un arraylist de las notas
            System.out.println("Ingrese las notas de " + nombre + ":");
            for (int i = 0; i < 3; i++) {
                System.out.println("Nota " + (i + 1));
                int nota = leer.nextInt();
                notas.add(nota);
            }
            Alumno alumno = new Alumno(nombre, notas);
            alumnos.add(alumno); // setea al arraylist de alumnos
            System.out.println("¿Desea agregar otro Alumno? (S/N)");
            continuar = leer.next().equalsIgnoreCase("s");
        }

        return alumnos; // retorna el arraylist de objetos alumnos
    }

    public void mostrarAlumnos(ArrayList<Alumno> alumnos) {
        alumnos.forEach((alumno) -> {
            System.out.println(alumno.getNombre());
            ArrayList<Integer> notas = alumno.getNotas();
            notas.forEach((nota) -> {
                System.out.println(nota);
            });
        });
    }

    public void notaFinal(ArrayList<Alumno> alumnos) {
        boolean encontrado = false;
        System.out.println("Ingrese el alumno a calcular la nota final:");
        String nombre = leer.next();
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                ArrayList<Integer> notas = alumno.getNotas();
                int suma = 0;
                for (int nota : notas) {
                    suma += nota;
                }
                System.out.println("El promedio del alumno es " + suma / notas.size());
            }
        }
//        Iterator<Alumno> it = alumnos.iterator();
//        boolean encontrado = false;
//        System.out.println("Ingrese el alumno a calcular la nota final:");
//        String nombre = leer.next();
//        for (Alumno alumno : alumnos) {
//            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
//                ArrayList<Integer> notas = alumno.getNotas();
//                encontrado = true;
//                int suma = 0;
//                suma = notas.stream().map((nota) -> nota).reduce(suma, Integer::sum);
//                System.out.println("El promedio del alumno es " + suma / 3);
//                /*
//                for (Integer nota : notas) {
//                    suma += nota;
//                }
//                System.out.println("El promedio del alumno es " + suma / 3);
//                */
//                     
//            }
//        }
        if (!encontrado) {
            System.out.println("Alumno no encontrado");
        }

    }

}
