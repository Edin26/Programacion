package Ejercicio1;

public class Pelicula extends DVD {


    String director;
    String genero;

    public Pelicula() {
    }

    public Pelicula(String codigo, String titulo, int duracion, String director, String genero) {
        super(codigo, titulo, duracion);
        this.director = director;
        this.genero = genero;
    }

    @Override
    public boolean alquilar() {
        if (getAlquilado()){
            return false;
        }
        else {
            setAlquilado(true);
            setDiasPrestamo(3);
            return true;
        }
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pelicula"+super.toString() + ", Director: "+ getDirector()+ ", Genero: "+getGenero();
    }

    //String codigo, String titulo, int duracion, String director, String genero
    @Override
    public String toStringFichero() {
        String alquilado = "0";
        if (getAlquilado()){
            alquilado = "1";
        }
        String formato = getCodigo()+"," + getTitulo() + "," + getDuracion() + "," + getDirector() + "," + getGenero()+"," + alquilado + ","+getDiasPrestamo();

        return formato;
    }
}
