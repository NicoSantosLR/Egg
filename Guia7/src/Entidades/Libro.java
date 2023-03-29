package Entidades;

import java.util.Scanner;

public class Libro {

    private String ISBN;
    private String titulo;
    private String autor;
    private int paginas;

    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Libro crearLibro() {

        Scanner leer = new Scanner(System.in);
        Libro libroCreado = new Libro();

        System.out.println("Ingrese ISBN");
        libroCreado.setISBN(leer.next());
        System.out.println("Ingrese Título");
        libroCreado.setTitulo(leer.next());
        System.out.println("Ingrese Autor");
        libroCreado.setAutor(leer.next());
        System.out.println("Ingrese páginas");
        libroCreado.setPaginas(leer.nextInt());
        
        return libroCreado;
    }
    
    public void mostrarLibro(Libro libroCreado){
        System.out.println("Libro" + "\nISBN = " + ISBN + "\nTitulo = " + titulo + "\nAutor = " + autor + "\nPaginas = " + paginas); 
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }
    
    
}
