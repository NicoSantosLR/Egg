package Entidad;
/*
Luego, de las películas nos interesa saber
el título, duración, edad mínima y director.
*/

public class Pelicula {
    private String titulo;
    private int duracionMinutos;
    private int edadMinima;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, int duracionMinutos, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula: \n" +
                "Título: " + titulo + "\nDuración en minutos: " + duracionMinutos + 
                "\nEdad Mínima: " + edadMinima + "\nDirector: " + director;
    }
    
}
