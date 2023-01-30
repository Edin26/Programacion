package Ejercicio1;

public class DVD extends Producto {

    int duracion;

    public DVD(){}

    public DVD(String codigo, String titulo, int duracion) throws Exception {
        super(codigo, titulo);
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }


    @Override
    public String toString() {
        return "DVD " + super.toString() + ", Duracion: "+ getDuracion() ;
    }

    @Override
    public String toStringFichero() {
        return null;
    }


}
