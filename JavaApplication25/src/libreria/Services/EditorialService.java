package libreria.Services;

import java.util.ArrayList;
import libreria.Entities.Editorial;
import libreria.Persistence.EditorialConnection;


public class EditorialService {
    
    private final EditorialConnection coneccion;

    public EditorialService() {
        this.coneccion = new EditorialConnection();
    }

    public Editorial crearEditorial(String nombre, Boolean alta) {
        Editorial editorial = new Editorial();
        try {
            editorial.setNombre(nombre);
            editorial.setAlta(true);
            coneccion.guardar(editorial);
            return editorial;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void eliminarEditorial(Integer id) {
        try {
            coneccion.eliminar(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void editarEditorial(Integer id) {
        try {
            coneccion.editar(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Editorial> listarEditoriales() {
        try {
            ArrayList<Editorial> listaDeEditoriales = new ArrayList<>(coneccion.listarTodos());
            return listaDeEditoriales;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }
}
