package Entidades;

public class Yates extends BarcosMotor {

    private int camarotes;

    public Yates() {
    }

    public Yates(int camarotes, int potenciaCV, String matricula, int eslora, String anioFabricacion, int modulo) {
        super(potenciaCV, matricula, eslora, anioFabricacion, modulo);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public void calcularModulo() {
        super.calcularModulo();
        modulo += camarotes;
    }

    @Override
    public String toString() {
        return "Yate tipo " + super.toString() + "Camarotes: " + camarotes + "\n";
    }
}
