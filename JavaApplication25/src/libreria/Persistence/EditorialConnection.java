package libreria.Persistence;

import java.util.List;
import libreria.Entities.Editorial;

public class EditorialConnection extends Connection<Editorial> {

    @Override
    public void guardar(Editorial autor) {
        super.guardar(autor);
    }

    public void eliminar(Integer id) throws Exception {
        Editorial autor = buscarPorId(id);
        super.eliminar(autor);
    }

    public void editar(Integer id) throws Exception {
        Editorial autor = buscarPorId(id);
        super.editar(autor);
    }

    public Editorial buscarPorId(Integer id) throws Exception {
        conectar();
        Editorial autor = em.find(Editorial.class, id);
        desconectar();
        return autor;
    }
    
    public List<Editorial> listarTodos() throws Exception {
        conectar();
        List<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e ").getResultList();
        desconectar();
        return editoriales;
    }

}
