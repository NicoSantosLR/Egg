/*
Crear una función rellene un vector con números aleatorios, pasándole un
arreglo por parámetro. Después haremos otra función o procedimiento que imprima
el vector.
*/
package G5extras;

public class G5ejercicioExtra3 {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static int[] relleno(int largo){
        int[] retorno = new int[largo];
        for (int i = 0; i < retorno.length; i++) {
            retorno[i] = (int)(Math.random()*10)+1;
        }
        return retorno;
    }
    
    public static void muestra(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println("");
    }
}
