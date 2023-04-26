package Servicio;

import Entidad.Estudiante;

public class EstudianteService {

    // Pasa como parametro el arreglo de objetos
    public double calcularPromedio(Estudiante[] arreglo) {
        double suma = 0;
        // For each: a cada objeto Estudiante le asigna estudiante y recorre el arreglo
        for (Estudiante estudiante : arreglo) {
            suma += estudiante.getNota();
        }
        //double promedio = suma / arreglo.length;
        return suma / arreglo.length;
    }

    // Devuelve un arreglo tipo String tomando como parámetro un arreglo de objetos tipo Estudiante
    public String[] promedioMayor(Estudiante[] arreglo) {
        // Llamo al método promedio para calcularlo
        double promedio = calcularPromedio(arreglo);
        // inicializo el largo del Vector que devuelvo
        int largo = 0;
        // Tomando la nota mayor al promedio calculo el largo del vector nuvo
        for (Estudiante estudiante : arreglo) {
            if (estudiante.getNota() > promedio) {
                largo++;
            }
        }
        // Defino el nuevo vector
        String[] nombresPromedioMayor = new String[largo];
        // Este auxiliar sirve como subindice del nuevo vector
        int aux = 0;
        // Llenamos el vector solo con los nombres comparandolos
        for (Estudiante estudiante : arreglo) {
            if (estudiante.getNota() > promedio) {
                nombresPromedioMayor[aux] = estudiante.getNombre();
                aux++;
            }
        }
        return nombresPromedioMayor;
    }

    // Metodo para solo imprimir por pantalla el vector de Strings con los nombres
    public void mostrar(String[] estudiantes) {
        System.out.println("Lista de estudiante con nota mayor al promedio:");
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}
