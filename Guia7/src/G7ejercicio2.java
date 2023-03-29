
import Entidades.Circunferencia;
import java.util.Scanner;


public class G7ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el radio");
        double radio = leer.nextDouble();
        
        Circunferencia circulo = new Circunferencia(radio).crearCircunferencia(radio);
        
        System.out.println("Area = " + circulo.area());
        
        System.out.println("Perimetro = " + circulo.perimetro());
    }
    
}
