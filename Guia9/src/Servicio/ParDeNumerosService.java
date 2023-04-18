package Servicio;

import Entidad.ParDeNumeros;

public class ParDeNumerosService {

    public void mostrarValores(ParDeNumeros numeros) {
        System.out.println(numeros.getNumero1());
        System.out.println(numeros.getNumero2());
    }

    public void devolverMayor(ParDeNumeros numeros) {
        int comparacion = Integer.compare((int) numeros.getNumero1(), (int) numeros.getNumero2());
        if (comparacion == 0) {
            System.out.println("Los números son iguales");
        } else if (comparacion < 0) {
            System.out.println("El segundo número es mayor " + numeros.getNumero2());
        } else {
            System.out.println("El primer número es mayor " + numeros.getNumero1());
        }
    }

    public void calcularPotencia(ParDeNumeros numeros) {
        int num1 = (int) Math.round(numeros.getNumero1());
        int num2 = (int) Math.round(numeros.getNumero2());
        if (num1 > num2) {
            System.out.println("La potencia de " + num1 + " elevado a " + num2 + " es: " + Math.pow(num1, num2));
        } else {
            System.out.println("La potencia de " + num2 + " elevado a " + num1 + " es: " + Math.pow(num2, num1));
        }
    }

    public void calculaRaiz(ParDeNumeros numeros) {
        int abs;
        if (numeros.getNumero1()>numeros.getNumero2()) {
            abs = (int) Math.round(numeros.getNumero2());
        } else {
            abs = (int) Math.round(numeros.getNumero1());
        }
        abs = Math.abs(abs);
        System.out.println("La raiz cuadrad de " + abs + " es " + Math.sqrt(abs));
    }

}
