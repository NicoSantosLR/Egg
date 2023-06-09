package Servicio;

import Entidad.Persona;

import java.util.Scanner;

public class PersonaService {

    Scanner leer = new Scanner(System.in);

    public boolean esMayorDeEdad(Persona persona) {
        //Devuelve true para mayores de 18 años
        return persona.getEdad() >= 18;
    }

    public Persona crearPersona() {
        System.out.println("Ingrese el nombre de la persona:");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la edad:");
        int edad = leer.nextInt();
        System.out.println("Ingrese sexo: (H,M,O)");
        String sexo;
        do {
            sexo = leer.next();
        } while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O"));
        System.out.println("Ingrese el peso:");
        double peso = leer.nextDouble();
        System.out.println("Ingrese la altura:");
        double altura = leer.nextDouble();
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public int calcularIMC(Persona persona) {
        int estado = 2;
        double IMC = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        if (IMC < 20) {
            estado = -1;
        } else if (IMC >= 20 && IMC <= 25) {
            estado = 0;
        } else if (IMC > 25) {
            estado = 1;
        }
        return estado;
    }


}
