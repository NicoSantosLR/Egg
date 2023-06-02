package Ejercicios;

import Entidad.Curso;
import Servicio.CursoServicio;

public class G9ejercicio6 {

    public static void main(String[] args) {
        CursoServicio servicio = new CursoServicio();
        Curso curso1 = servicio.crearCurso();
        servicio.resumenCurso(curso1);
    }

}
