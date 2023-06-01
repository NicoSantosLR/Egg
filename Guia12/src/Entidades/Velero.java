package Entidades;

public class Velero extends Barco {

    private int cantMastiles;

    public Velero() {
    }

    public Velero(int cantMastiles, String matricula, int eslora, String anioFabricacion, int modulo) {
        super(matricula, eslora, anioFabricacion, modulo);
        this.cantMastiles = cantMastiles;
    }


    public int getCantMastiles() {
        return cantMastiles;
    }

    public void setCantMastiles(int cantMastiles) {
        this.cantMastiles = cantMastiles;
    }
    
    @Override
    public void calcularModulo(){
        super.calcularModulo();
        modulo += cantMastiles;
    }
}
