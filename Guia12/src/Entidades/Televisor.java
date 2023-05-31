package Entidades;

public class Televisor extends Electrodomesticos {

    private Double pulgadas;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(Double pulgadas, boolean tdt, Double precio, String color, String consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    public Double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public String toString() {
        return "Televisor: " + super.toString() + "\nPulgadas: " + pulgadas + "\nPosee TDT:" + tdt;
    }

    public void crearTelevisor() {
        crearElectrodomestico();
        System.out.println("Ingrese el tamaño de la pantalla en pulgadas:");
        pulgadas = sc.nextDouble();
        System.out.println("¿Posee sintonizador TDT? (s/n):");
        tdt = sc.next().equalsIgnoreCase("s");
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (pulgadas > 40) {
            precio *= 1.3;
        }
        if (tdt) {
            precio += 500;
        }
    }
}
