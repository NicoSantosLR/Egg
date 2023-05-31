package Servicio;

import Entidad.Espectador;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EspectadorService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Espectador> espectadores;

    public EspectadorService() {
        this.espectadores = new ArrayList<>();
    }

    public Espectador crearEspectador() {
        System.out.println("Ingrese el nombre del espectador:");
        String nombre = sc.next();
        System.out.println("La edad del mismo:");
        int edad = sc.nextInt();
        System.out.println("Dinero disponible:");
        double dinero = sc.nextDouble();
        return new Espectador(nombre, edad, dinero);
    }
    
    public void agregarEspectador(){
        espectadores.add(crearEspectador());
    }

    public void fabricaEspectadores() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            espectadores.add(new Espectador("Juan" + i, random.nextInt(100) + 16, random.nextDouble() * 1000));
        }
    }
    
    public void mostrarEspectadores(){
        for (Espectador espectador : espectadores) {
            System.out.println(espectador);
        }
    }
    
}
