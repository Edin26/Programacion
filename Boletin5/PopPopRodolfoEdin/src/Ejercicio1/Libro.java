package Ejercicio1;

public class Libro extends Producto {

    String autor;
    int numPaginas;

    //#regionCONSTRUCTOR
    public Libro(){

    }

    public Libro(String codigo, String titulo, String autor, int numPaginas) throws Exception {
        super(codigo, titulo);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    //endregion

    //#region Metodos

    @Override
    public boolean alquilar() {
       if (getAlquilado()){
           return false;
       }
       else {
           setAlquilado(true);
           setDiasPrestamo(10);
           return true;
       }
    }
    //endregion

    //#region Metodos de acceso
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    //endregion


    @Override
    public String toString() {
        return "Libro: "+ super.toString()+ ", Autor: "+getAutor()+", Numero de paginas"+getNumPaginas();
    }

    //FICHERO+
    //public Libro(String codigo, String titulo, String autor, int numPaginas)
    @Override
    public String toStringFichero() {
        String alquilado = "0";
        if (getAlquilado()){
            alquilado = "1";
        }
        String formato = getCodigo()+"," + getTitulo() + "," + getAutor() + "," + getNumPaginas() + "," + alquilado + ","+getDiasPrestamo();

        return formato;
    }

}
