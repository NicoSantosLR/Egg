package libreria.Services;

import java.util.ArrayList;
import libreria.Entities.Autor;
import libreria.Entities.Editorial;
import libreria.Entities.Libro;
import libreria.Persistence.LibroConnection;

public class LibroService {

    private final LibroConnection coneccion;

    public LibroService() {
        this.coneccion = new LibroConnection();
    }

    public Libro crearLibro(String titulo, Integer anio, Integer ejemplares, Autor autor, Editorial editorial) {
        Libro libro = new Libro();
        try {
            libro.setAlta(true);
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            libro.setEjemplaresPrestados(0);
            libro.setEjemplaresRestantes(ejemplares);
            coneccion.guardar(libro);
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void eliminarLibro(Integer id) {
        try {
            coneccion.eliminar(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void editarLibro(Integer id) {
        try {
            coneccion.editar(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Libro> listarLibros() {
        try {
            ArrayList<Libro> listaDeLibros = new ArrayList<>(coneccion.listarTodos());
            return listaDeLibros;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

}
