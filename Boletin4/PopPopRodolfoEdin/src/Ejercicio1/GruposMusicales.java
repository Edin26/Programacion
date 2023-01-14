package Ejercicio1;

public class GruposMusicales {

    private String nombre;
    private int tiempoActuación;
    private int popularidad;
    private float coste;

    //Constructor por defecto
    public GruposMusicales() {
    }

    //Constructor que recibe los 4 atributos
    public GruposMusicales(String nombre, int tiempoActuación, int popularidad, float coste) {
        setNombre(nombre);
        setTiempoActuación(tiempoActuación);
        setCoste(coste);
        setPopularidad(popularidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoActuación() {
        return tiempoActuación;
    }

    public void setTiempoActuación(int tiempoActuación) {
        this.tiempoActuación = tiempoActuación;
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {

        if (popularidad >= 0 && popularidad <= 10) {
            this.popularidad = popularidad;
        } else {
            this.popularidad = 0;
        }
    }

    public float getCoste() {
        return coste;
    }

    public void setCoste(float coste) {
        this.coste = coste;
    }

    public float calcularPrecioFinal(int popularidad, float coste) {
        float costeTotal;

        costeTotal = coste + (coste * popularidad) / 100.0f;
        return costeTotal;
    }

    @Override
    public String toString() {
        return
                "Nombre = " + nombre + "\n" +
                "Tiempo de actuación " + tiempoActuación + " minutos"+ "\n" +
                "Popularidad: " + popularidad + "\n" +
                "Coste: " + coste + " Euros"+ "\n" +
                "Coste total: " + calcularPrecioFinal(popularidad,coste) + " Euros" ;
    }

}
