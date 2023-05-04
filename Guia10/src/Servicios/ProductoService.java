package Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Iterator;

public class ProductoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void introducirProducto(HashMap<String, Double> productos) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el nombre del producto:");
            String nombre = leer.next();
            System.out.println("Ingrese el precio del producto:");
            Double precio = leer.nextDouble();
            productos.put(nombre, precio);
            System.out.println("Desea continuar cargando otro producto? s/n");
            continuar = leer.next().equalsIgnoreCase("s");
        }
    }

    public void cambiarPrecio(HashMap<String, Double> productos) {
        Iterator<Map.Entry<String, Double>> it = productos.entrySet().iterator();
        System.out.println("De que producto desea cambiar el precio?");
        String productoBuscar = leer.next();
        while (it.hasNext()) { 
            if (productoBuscar.equalsIgnoreCase(it.next().getKey())) {
                System.out.println("Ingrese el nuevo precio:");
                double precioNuevo = leer.nextDouble();
                productos.put(productoBuscar, precioNuevo);
            }
        }
    }
    
    public void eliminarProducto(HashMap<String, Double> productos) {
        Iterator<Map.Entry<String, Double>> it = productos.entrySet().iterator();
        System.out.println("Que producto desea eliminar?");
        String productoBuscar = leer.next();
        while (it.hasNext()) { 
            if (productoBuscar.equalsIgnoreCase(it.next().getKey())) {
                productos.remove(productoBuscar);
            }
        }
    }
    
    public void mostrarProductos(HashMap<String, Double> productos) {
        System.out.println(productos.toString());
    }
}
