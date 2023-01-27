package Ejercicio1;

public abstract class Producto implements IAlquilable {

    private String codigo;
    private String titulo;
    private boolean alquilado;
    private int diasPrestamo;


    public Producto() {

    }

    public Producto(String codigo, String titulo) {
        setCodigo(codigo);
        this.titulo = titulo;
    }

    @Override
    public boolean alquilar() {
        return false;
    }

    @Override
    public void devolver() {
        this.alquilado = false;
        this.diasPrestamo =0;
    }


    public abstract String toStringFichero();

    public boolean ValidaCodigo(String codigo){
        return codigo.matches("^[A-Z]{2}[0-9]{2}$");
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (ValidaCodigo(codigo)){
            this.codigo = codigo;
        }
        //else {
         //   throw Exception ;
        //}
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean getAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    public int getDiasPrestamo() {
        return diasPrestamo;
    }

    public void setDiasPrestamo(int diasPrestamo) {
        this.diasPrestamo = diasPrestamo;
    }

    @Override
    public String toString() {
        return
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", alquilado=" + alquilado +
                ", diasPrestamo=" + diasPrestamo ;
    }
}
