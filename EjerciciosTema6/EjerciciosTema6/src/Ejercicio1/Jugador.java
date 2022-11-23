package Ejercicio1;

public class Jugador {

    private String codigo;
    private String nombre;


    private int puntos;
    public static String competicion;


    public Jugador(String codigo, String nombre) {
        ValidarCodigo(codigo);
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static String getCompeticion() {
        return competicion;
    }

    public static void setCompeticion(String competicion) {
        Jugador.competicion = competicion;
    }

    public int getPuntos() {
        return puntos;
    }


    public void ValidarCodigo(String codigo) {
        if (codigo.matches("^[A-Z][0-9]$")) {
            this.codigo = codigo;
        }

    }
    public void ActualizarPuntos(int puntos){
        this.puntos += puntos;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", puntos=" + puntos +
                '}';
    }
}
