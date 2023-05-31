package Servicio;

import Entidad.Butaca;
import Entidad.Pelicula;
import Entidad.Sala;
import java.util.ArrayList;
import java.util.Scanner;

public class SalaService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Sala sala;
    PeliculaService peliculaService;
    EspectadorService espectadorService;

    public SalaService() {
        this.sala = new Sala();
        this.peliculaService = new PeliculaService();
        this.espectadorService = new EspectadorService();
    }

    public void crearSala(ArrayList<Pelicula> peliculas) {
        Butaca[][] butacas = new Butaca[8][6];
        String[] columnas = {"A", "B", "C", "D", "E", "F"};
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < columnas.length; j++) {
                butacas[i][j] = new Butaca(i + 1, columnas[j]);
            }
        }
        sala.setEstado(true);
        System.out.println("Precio de entrada:");
        double precioEntrada = sc.nextDouble();
        System.out.println("Elija título de la película:");
        if (!peliculaService.peliculas.isEmpty()) {
            peliculaService.mostrarPeliculas();
        } else {
            System.out.println("La lista de peliculas está vacía");
            sala.setEstado(false);
        }
        String titulo = sc.next();
        Pelicula peliculaSeleccionada = null;
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                peliculaSeleccionada = pelicula;
                break;
            }
        }
        sala.setButacas(butacas);
        sala.setPrecioEntrada(precioEntrada);
        sala.setPelicula(peliculaSeleccionada);
        peliculaService.bibliotecaPeliculas();
        espectadorService.fabricaEspectadores();
    }

    public void mostrarSala() {
        Butaca[][] butacas = sala.getButacas();
        for (int i = butacas.length - 1; i >= 0; i--) {
            for (int j = 0; j < butacas[i].length; j++) {
                if (j == butacas[i].length - 1) {
                    System.out.print("|" + butacas[i][j] + "|\n");
                } else {
                    System.out.print("|" + butacas[i][j]);
                }
            }
        }
    }
    
    public void ubicarEspectadores(){
        
    }

    public void menu() {
        int opc;
        do {
            System.out.println("-------------------MENU-------------------");
            System.out.println("1 - Crear sala\n"
                    + "2 - Mostrar sala\n"
                    + "3 - Crear peliculas\n" // Agrega nuevas peliculas
                    + "4 - Mostrar peliculas\n"
                    + "5 - Crear espectadores\n" // Agrega nuevos espectadores
                    + "6 - Mostrar espectadores\n"
                    + "7 - Ubicar espectadores\n" // Falta
                    + "8 - Vaciar sala\n" // Falta
                    + "9 - Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    if (!sala.isEstado()) {
                        crearSala(peliculaService.peliculas);
                    } else {
                        System.out.println("La sala ya fué creada");
                    }
                    break;
                case 2:
                    if (sala.isEstado()) {
                        mostrarSala();
                    } else {
                        System.out.println("Necesita crear una sala primero");
                    }
                    break;
                case 3:
                    peliculaService.agregarPelicula();
                    break;
                case 4:
                    if (!peliculaService.peliculas.isEmpty()) {
                        peliculaService.mostrarPeliculas();
                    } else {
                        System.out.println("Se debe agregar una lista de peliculas");
                    }
                    break;
                case 5:
                    espectadorService.agregarEspectador();
                    break;
                case 6:
                    if (!sala.isEstado()) {
                        espectadorService.mostrarEspectadores();
                    } else {
                        System.out.println("Debe crear la sala");
                    }
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    ;
            }
        } while (opc != 8);
    }

}
