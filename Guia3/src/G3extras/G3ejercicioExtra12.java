/*
 Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo
sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package G3extras;

public class G3ejercicioExtra12 {

    public static void main(String[] args) {
        String primero, segundo, tercero;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    primero = String.valueOf(i);
                    if (primero.equals("3")) {
                        primero = "E";
                    }
                    segundo = String.valueOf(j);
                    if (segundo.equals("3")) {
                        segundo = "E";
                    }
                    tercero = String.valueOf(k);
                    if (tercero.equals("3")) {
                        tercero = "E";
                    }
                    String cadena = primero + " - " + segundo + " - " + tercero;
                    //cadena = cadena.replace("3", "E");
                    System.out.println(cadena);
                    /*primero = (i == 3) ? "E" : String.valueOf(i);
                    segundo = (j == 3) ? "E" : Integer.toString(j);
                    tercero = (k == 3) ? "E" : Integer.toString(k);
                    String cadena = primero + " - " + segundo + " - " + tercero;*/
                    System.out.println(cadena);
                }
            }
        }
    }
}