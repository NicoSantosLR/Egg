package Ejercicios;

public class G13ejercicio2 {

    /*
    Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
     */
    public static void main(String[] args) {
        int[] numeros = new int[5];
        try {
            for (int i = 0; i < 10; i++) {
                numeros[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println(a.toString());
            System.out.println("Salió de rango");
        } catch (Exception e) {
            System.out.println("Error del sistema");
        }
        System.out.println("Marce continua");
    }

}

class Prueba {

    private String nameString;

    public Prueba() {
    }

    public Prueba(String nameString) {
        this.nameString = nameString;
    }

}
