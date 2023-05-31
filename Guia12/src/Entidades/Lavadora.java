package Entidades;

public class Lavadora extends Electrodomesticos {

    private Double carga;

    public Lavadora() {
    }

    public Lavadora(Double carga, Double precio, String color, String consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora: " + super.toString() + "\nCarga: " + carga + " Kg";
    }

    public void crearLavadora() {
        super.crearElectrodomestico();
        System.out.println("Ingrese la capacidad de carga (en Kg):");
        carga = sc.nextDouble();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            precio += 500;
        }
    }

}
