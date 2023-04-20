package Servicio;

import Entidad.Cadena;

public class CadenaServicio {

    public void mostrarVocales(Cadena cadena) {
        int contador = 0;
        char letra;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            letra = cadena.getFrase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o'
                    || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I'
                    || letra == 'O' || letra == 'U') {
                contador++;
            }
        }
        System.out.println("La frase tiene " + contador + " vocales");
    }

    // a)
    public void mostrarVocales2(Cadena cadena) {
        String vocales = "AEIOUaeiou";
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            String letra = cadena.getFrase().substring(i, i + 1);
            if (vocales.contains(letra)) {
                contador++;
            }
        }
        System.out.println("La frase tiene " + contador + " vocales");
    }

    // b) Concatena con método concatenar y convierte en String el char con valueOff
    public void invertirFrase(Cadena cadena) {
        String fraseInvertida = "";
        for (int i = cadena.getLongitud() - 1; i >= 0; i--) {
            fraseInvertida = fraseInvertida.concat(String.valueOf(cadena.getFrase().charAt(i)));
        }
        System.out.println("La frase invertida es:");
        System.out.println(fraseInvertida);
    }

    // b) Se usa concatenar sumando con un substring
    public void invertirFrase2(Cadena cadena) {
        String fraseInvertida = "";
        for (int i = cadena.getLongitud() - 1; i >= 0; i--) {
            fraseInvertida += cadena.getFrase().substring(i, i + 1);
        }
        System.out.println("Frase normal: " + cadena.getFrase());
        System.out.println("Frase invertida: " + fraseInvertida);
    }

    public void vecesRepetido(Cadena cadena, char letra) {
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println("El caracter '" + letra + "' se repite " + contador + " veces");
    }

    public void compararLongitud(Cadena cadena, String frase) {
        if (cadena.getLongitud() == frase.length()) {
            System.out.println("Las frases tienen la misma longitud");
        } else if (cadena.getLongitud() > frase.length()) {
            System.out.println("La primera frase es más larga");
        } else if (cadena.getLongitud() < frase.length()) {
            System.out.println("La segunda frase es más larga");
        }
    }

    public void unirFrases(Cadena cadena, String frase) {
        String fraseUnida = cadena.getFrase().concat(" ").concat(frase);
        System.out.println("Las frases unidas quedan:");
        System.out.println(fraseUnida);
    }

    public void unirFrases2(Cadena c, String fraseUsuario) {

        String frase = c.getFrase();
        frase += fraseUsuario;
        System.out.println("Frases unificadas: " + frase);
    }

    public void reemplazar(Cadena cadena, String letra) {
        String fraseNueva = cadena.getFrase().replace("a", letra).replace("A", letra);
    }

    public void reemplazar2(Cadena c, String letraUsuario) {

        //String fraseReemplazada = f.getFrase().replace("A", letraUsuario).replace("a", letraUsuario);
        String fraseReemplazada = "";
        String vocales = "Aa";
        for (int i = 0; i < c.getLongitud(); i++) {
            String letra = c.getFrase().substring(i, i + 1);
            if (vocales.contains(letra)) {
                fraseReemplazada += letraUsuario;
            } else {
                fraseReemplazada += letra;
            }
        }
        System.out.println(fraseReemplazada);
    }
    
    public void remplazarLaA(Cadena cadena, String letraNuevaParaLaA) { 

        if (cadena.getFrase().toLowerCase().contains("a")) {
            cadena.setFrase(cadena.getFrase().replace("a", letraNuevaParaLaA));
        } else {
            System.out.println("No tiene a no se remplaza nada");
        }

    }

    public boolean contiene(Cadena c, String letraUsuario) {
        
        boolean contiene = false;
        for (int i = 0; i < c.getLongitud(); i++) {
            String letra = c.getFrase().substring(i, i + 1);
            if (letraUsuario.contains(letra)) {
                contiene = true;
                break;
            }
        }
        return contiene;
    }
    
    public boolean contiene2(Cadena cadena, String letra) { 
        boolean contiene = false;
        if (cadena.getFrase().contains(letra)) {
            System.out.println("Si la contiene ");
            contiene = true;
        } else {
            System.out.println("No la contiene ");
        }
        return contiene;

    }
}
