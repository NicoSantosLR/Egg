package libreria.Services;

import java.util.ArrayList;
import java.util.Scanner;
import libreria.Entities.Autor;
import libreria.Persistence.AutorConnection;

public class AutorService {

    private final AutorConnection coneccion;
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public AutorService() {
        this.coneccion = new AutorConnection();
    }

    public void crearAutor() {
        Autor autor;
        System.out.println("Ingrese el nombre del autor");
        String nombre = sc.next();
        autor = coneccion.buscarPorNombre(nombre);
        try {
            if (autor == null) {
                autor.setNombre(nombre);
                autor.setAlta(Boolean.TRUE);
                coneccion.guardar(autor);
                System.out.println("Autor ingresado");
            }
        } catch (Exception e) {
            System.out.println("El autor ya estaba ingresado");
            System.out.println(e.getMessage());
            
        }

    }

    public void eliminarAutor(Integer id) {
        try {
            coneccion.eliminar(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Autor bajaAutor(String nombre) {
        Autor autor = new Autor();
        try {
            autor.setNombre(nombre);
            autor.setAlta(true);
            coneccion.guardar(autor);
            return autor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void editarAutor(Integer id) {
        try {
            coneccion.editar(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Autor> listarAutores() {
        try {
            ArrayList<Autor> listaDeAutores = new ArrayList<>(coneccion.listarTodos());
            return listaDeAutores;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public Autor buscarAutorPorNombre(String nombre) {
        try {
            return coneccion.buscarPorNombre(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
