
import Entidades.Circunferencia;


public class G7ejercicio2 {

    public static void main(String[] args) {
        
        Circunferencia circulo = new Circunferencia();
        
        circulo.crearCircunferencia();
        
        System.out.println("Area = " + circulo.area());
        
        System.out.println("Perimetro = " + circulo.perimetro());
    }
    
}
