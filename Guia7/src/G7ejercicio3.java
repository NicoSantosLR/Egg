
import Entidades.Operacion;

public class G7ejercicio3 {

    public static void main(String[] args) {
        Operacion oper = new Operacion();

        oper.crearOperacion();

        System.out.println("La suma es:" + oper.suma());
        System.out.println("La resta es:" + oper.restar());
        System.out.println("La multiplicación es:" + oper.multiplicar());
        System.out.println("La división es:" + oper.dividir());
    }

}
