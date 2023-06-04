package Entidades;

public class Barco {

    //su matrícula, su eslora en metros y año de fabricación
    protected String matricula;
    protected int eslora;
    protected String anioFabricacion;
    protected int modulo;

    public Barco() {
    }

    public Barco(String matricula, int eslora, String anioFabricacion, int modulo) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
        this.modulo = modulo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public String getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(String anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int getModulo() {
        return modulo;
    }

    public void setModulo(int modulo) {
        this.modulo = modulo;
    }

    public void calcularModulo() {
        modulo = eslora * 10;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + "\nEslora: " + eslora + " m\nAño de Fabricación: " + anioFabricacion + "\nModulo: " + modulo + "\n";
    }

}
