package Servicios;

import java.util.*;


public class PaisesService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Set<String> cargarPaises(){
        Set<String> paises = new HashSet();
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el nombre del pais:");
            paises.add(leer.next());
            System.out.println("Dese cargar otro pais: s/n");
            continuar = leer.next().equalsIgnoreCase("s");
        }
        return paises;
    }
    
    public void mostrarPaises(Set<String> paises){
            System.out.println(paises.toString());
    }
    
    public void ordenar(Set<String> paises){
        TreeSet<String> treeset = new TreeSet(paises);
        mostrarPaises(treeset);
    }
    
    public void eliminarPais(Set<String> paises){
        Iterator<String> it = paises.iterator();
        System.out.println("Ingrese el país a eliminar:");
        String paisBuscado = leer.next();
        boolean eliminado = false;
        while (it.hasNext()) { 
            String aux = it.next();
            if (aux.equalsIgnoreCase(paisBuscado)) {
                it.remove();
                eliminado = true;
            }
        }
        if (eliminado) {
            System.out.println("Pais eliminado de la lista");
        } else {
            System.out.println("País no encontrado");
        }
        ordenar(paises);
    }
}
