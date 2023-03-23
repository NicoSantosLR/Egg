/*
Los profesores del curso de programación de Egg necesitan llevar un registro de
las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4
notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones
de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
Al final del programa los profesores necesitan obtener por pantalla la cantidad
de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
con promedio mayor o igual al 7 de sus notas del curso.
*/
package G5extras;

import java.util.Scanner;

public class G5ejercicioExtra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaramos vector y llenmos de notas
        float[] promedios = new float[10];
        for (int i = 0; i < promedios.length; i++) {
            System.out.println("Ingresando notas para alumno " + (i+1));
            System.out.print("Primer trabajo práctico -> ");
            int notaPrac1 = leer.nextInt();
            System.out.print("Segundo trabajo práctico -> ");
            int notaPrac2 = leer.nextInt();
            System.out.print("Primer integrador -> ");
            int integrador1 = leer.nextInt();
            System.out.print("Segundo integrador -> ");
            int integrador2 = leer.nextInt();
            promedios[i] = (float) (notaPrac1 * 0.1 + notaPrac2 * 0.1 + integrador1 * 0.25 + integrador2 * 0.5);
        }
        //Contamos aprobados y desaprobados
        int aprobados = 0, desaprobados = 0;
        for (float promedio : promedios) {
            if (promedio>=7)
                aprobados++;
            else 
                desaprobados ++;
        }
        //Mostramos resultado
        System.out.println("Hay " + aprobados + " alumnos aprobados y " + desaprobados + " desaprobados.");
    }
    
}
