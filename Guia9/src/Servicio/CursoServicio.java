package Servicio;

import Entidad.Curso;
import java.util.Arrays;
import java.util.Scanner;

public class CursoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public String[] cargarAlumnos() {
        String[] alumnos = new String[5];
        System.out.println("Ingrese el nombre de los alumnos");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Nombre alumno " + (i + 1) + ":");
            alumnos[i] = leer.next();
        }
        return alumnos;
    }

    public Curso crearCurso() {
        System.out.println("Ingrese el nombre del curso:");
        String nombreCurso = leer.next();
        System.out.println("Ingrese la cantidad de horas por día:");
        int cantidadHorasPorDia = leer.nextInt();
        System.out.println("Ingrese la cantidad de dias por semana:");
        int cantidadDiasPorSemana = leer.nextInt();
        System.out.println("Ingrese el turno (mañana/tarde):");
        String turno = leer.next();
        System.out.println("Ingrese el precio por hora");
        int precioPorHora = leer.nextInt();
        String[] alumnos = cargarAlumnos();
        return new Curso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHora, alumnos);
    }

    public void calcularGananciaSemanal(Curso curso) {
        int gananciaSemanal = curso.getCantidadDiasPorSemana() * curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * 5;
        System.out.println("La ganancia semanal es de $" + gananciaSemanal);
    }

    public void resumenCurso(Curso curso) {
        System.out.println("Nombre del curso: " + curso.getNombreCurso());
        System.out.println("Alumnos: ");
        System.out.println(Arrays.toString(curso.getAlumnos()));
        System.out.println("Cantidad de horas por dia: " + curso.getCantidadHorasPorDia());
        System.out.println("Cantidad de dias por semana: " + curso.getCantidadDiasPorSemana());
        System.out.println("Turno: " + curso.getTurno());
        System.out.println("Precio por hora: $" + curso.getPrecioPorHora());
        calcularGananciaSemanal(curso);
    }

}
