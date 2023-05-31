package Entidades;

import java.util.Scanner;

public class Electrodomesticos {

    protected Double precio;
    protected String color;
    protected String consumo;
    protected Double peso;
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Electrodomesticos() {
    }

    public Electrodomesticos(Double precio, String color, String consumo, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    protected void comprobarConsumoEnergetico(char letra) {
        if (!(letra >= 'a' && letra < 'f')) {
            consumo = "f";
        } else {
            consumo = String.valueOf(letra);
        }
    }

    public void comprobarColor(String unColor) {
        boolean comprobante = false;
        for (ColorElectro auxColor : ColorElectro.values()) {
            if (auxColor.toString().equalsIgnoreCase(color)) {
                color = unColor;
                comprobante = true;
                break;
            }
        }
        if (!comprobante) {
            color = "blanco";
        }
    }

    public void crearElectrodomestico() {
        precio = 1000d;
        System.out.println("Ingrese el color del electrodoméstico:");
        color = sc.next();
        comprobarColor(color);
        System.out.println("Ingrese el consumo eléctrico:");
        consumo = sc.next().toLowerCase();
        comprobarConsumoEnergetico(consumo.charAt(0));
        System.out.println("Ingrese el peso:");
        peso = sc.nextDouble();
    }

    public void precioFinal() {
        switch (consumo) {
            case "a":
                precio += 1000d;
                break;
            case "b":
                precio += 800d;
                break;
            case "c":
                precio += 600d;
                break;
            case "d":
                precio += 500d;
                break;
            case "e":
                precio += 300d;
                break;
            case "f":
                precio += 100d;
                break;
        }
        if (peso > 0 && peso < 20) {
            precio += 100;
        } else if (peso < 50) {
            precio += 500;
        } else if (peso < 80) {
            precio += 800;
        } else {
            precio += 1000;
        }
    }

    @Override
    public String toString() {
        return "\nPrecio: $" + precio + "\nColor: " + color + "\nConsumo: " + consumo + "\nPeso: " + peso + " Kg";
    }
    
    
}
