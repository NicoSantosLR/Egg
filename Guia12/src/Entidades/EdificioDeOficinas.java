package Entidades;

/*
Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
 */
public class EdificioDeOficinas extends Edificio {

    private int cantOficinas;
    private int cantPersonas;
    private int cantPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int cantOficinas, int cantPersonas, int cantPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.cantOficinas = cantOficinas;
        this.cantPersonas = cantPersonas;
        this.cantPisos = cantPisos;
    }

    public int getCantOficinas() {
        return cantOficinas;
    }

    public void setCantOficinas(int cantOficinas) {
        this.cantOficinas = cantOficinas;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    /*
    De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
     */
    public void cantPersonas() {
//        System.out.println("Ingrese la cantidad de personas que entran en cada oficina:");
//        cantPersonas = sc.nextInt();
//        System.out.println("Cuántas oficinas posee el edificio?:");
//        cantOficinas = sc.nextInt();
//        System.out.println("Ingrese el número de pisos del edificio:");
//        cantPisos = sc.nextInt();
        int personasPiso = cantOficinas * cantPersonas;
        System.out.println("La cantidad de personas por piso es: " + personasPiso);
        int totalPersonas = cantPisos * cantOficinas * cantPersonas;
        System.out.println("El total de personas en el edificio es: " + totalPersonas);
    }

    @Override
    public double calcularSuperficie() {
        return ancho * largo;
    }

    @Override
    public double calcularVolumen() {
        return calcularSuperficie() * alto;
    }

}
