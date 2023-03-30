
import Entidades.Rectangulo;


public class G7ejercicio4 {

    public static void main(String[] args) {
        Rectangulo r = new Rectangulo();
        
        r.crearRectangulo();
        
        System.out.println("La superficie del rectángulo es: " + r.superficie());
        System.out.println("El perímetro del rectángulo es: " + r.perimetro());
        System.out.println(" ");
        
        r.dibujarRectangulo();
    }
    
}
