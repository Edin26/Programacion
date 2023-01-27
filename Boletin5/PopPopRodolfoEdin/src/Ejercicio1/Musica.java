package Ejercicio1;

public class Musica extends DVD {

    String grupo;

    public Musica() {
    }

    public Musica(String codigo, String titulo, int duracion, String grupo) {
        super(codigo, titulo, duracion);
        this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public boolean alquilar() {
        if (getAlquilado()){
            return false;
        }
        else {
            setAlquilado(true);
            setDiasPrestamo(5);
            return true;
        }
    }

    @Override
    public String toString() {
        return "Musica"+super.toString() + ", Grupo: "+ getGrupo();
    }

    //String codigo, String titulo, int duracion, String director, String genero
    @Override
    public String toStringFichero() {
        String alquilado = "0";
        if (getAlquilado()){
            alquilado = "1";
        }
        String formato = getCodigo()+"," + getTitulo() + "," + getDuracion() + "," + getGrupo()+"," + alquilado + ","+getDiasPrestamo();

        return formato;
    }
}
