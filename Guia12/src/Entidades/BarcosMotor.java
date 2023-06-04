package Entidades;

public class BarcosMotor extends Barco {

    protected int potenciaCV;

    public BarcosMotor() {
    }

    public BarcosMotor(int potenciaCV, String matricula, int eslora, String anioFabricacion, int modulo) {
        super(matricula, eslora, anioFabricacion, modulo);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public void calcularModulo() {
        super.calcularModulo();
        modulo += potenciaCV;
    }

    @Override
    public String toString() {
        return "Barco a Motor\n" + super.toString() + "Potencia: " + potenciaCV + " CV\n";
    }
}
