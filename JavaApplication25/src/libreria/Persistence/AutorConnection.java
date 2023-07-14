package libreria.Persistence;

import java.util.List;
import libreria.Entities.Autor;

public class AutorConnection extends Connection<Autor> {


    @Override
    public void guardar(Autor autor) {
        super.guardar(autor);
    }

    public void eliminar(Integer id) throws Exception {
        Autor autor = buscarPorId(id);
        super.eliminar(autor);
    }

    public void editar(Integer id) throws Exception {
        Autor autor = buscarPorId(id);
        super.editar(autor);
    }

    public Autor buscarPorId(Integer id) throws Exception {
        conectar();
        Autor autor = em.find(Autor.class, id);
        desconectar();
        return autor;
    }
    
    public List<Autor> listarTodos() throws Exception {
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a ").getResultList();
        desconectar();
        return autores;
    }
    
    public Autor buscarPorNombre(String nombre){
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre")
                .setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return autor;
    }

}
