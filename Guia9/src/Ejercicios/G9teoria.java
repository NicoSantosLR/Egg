
package Ejercicios;

import Entidad.Vendedor;
import Servicio.VendedorServicio;

public class G9teoria {




    public static void main(String[] args) {
        /*
        Instanciamos un Objeto de tipo Servicio para poder acceder
        */
       VendedorServicio vs = new VendedorServicio();
       /*
       Instanciamos el Objeto donde alojo el retorno de lo construido en la
       clase de Servicio con todos los atributos cargados.
       */
       Vendedor v1 = vs.altaVendedor();
       /*
       Invocamos a los metodos declarados en la clase Servicio , pasandole 
       por parametro el Objeto.
       */
       vs.SueldoMensual(v1);
       vs.vacaciones(v1);
    }
}

