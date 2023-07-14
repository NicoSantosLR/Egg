package libreria.Persistence;

import java.util.List;
import libreria.Entities.Libro;

public class LibroConnection extends Connection<Libro> {

    @Override
    public void guardar(Libro autor) {
        super.guardar(autor);
    }

    public void eliminar(Integer id) throws Exception {
        Libro autor = buscarPorId(id);
        super.eliminar(autor);
    }

    public void editar(Integer id) throws Exception {
        Libro autor = buscarPorId(id);
        super.editar(autor);
    }

    public Libro buscarPorId(Integer id) throws Exception {
        conectar();
        Libro autor = em.find(Libro.class, id);
        desconectar();
        return autor;
    }

    public List<Libro> listarTodos() throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l ").getResultList();
        desconectar();
        return libros;
    }

    public List<Libro> listarPorAutor(String nombre) {
        conectar();
        //SELECT p FROM Persona p JOIN p.direccion d WHERE d.pais LIKE :pais AND d.provincia LIKE :provincia "
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN l.autor a WHERE a.nombre LIKE :nombre ").setParameter("nombre", nombre).getResultList();
        desconectar();
        return libros;
    }

}
