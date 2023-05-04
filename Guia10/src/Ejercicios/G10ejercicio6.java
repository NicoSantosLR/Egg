
package Ejercicios;

import Servicios.ProductoService;
import java.util.HashMap;

public class G10ejercicio6 {

    public static void main(String[] args) {
        HashMap<String, Double> productos = new HashMap();
        ProductoService service = new ProductoService();
        service.introducirProducto(productos);
        System.out.println("------------------------------");
        service.cambiarPrecio(productos);
        System.out.println("------------------------------");
        service.eliminarProducto(productos);
        System.out.println("------------------------------");
        service.mostrarProductos(productos);
        System.out.println("------------------------------");
    }

}
