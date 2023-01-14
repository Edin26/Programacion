package Ejercicio1;

import java.util.Arrays;

public class Festival {
    String nombre;
    private int duracion ;
    private float costeTotal;
    private GruposMusicales [] programa;
    public GruposMusicales[] getPrograma() {
        return programa;
    }
    public void setPrograma(GruposMusicales[] programa) {
        this.programa = programa;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public float getCosteTotal() {
        return costeTotal;
    }
    public void setCosteTotal(float costeTotal) {
        this.costeTotal = costeTotal;
    }

    public Festival(String nombre, int numeroDeGrupos) {

        setNombre(nombre);
        this.programa = new GruposMusicales[numeroDeGrupos];
    }
    public void AddGrupo (GruposMusicales grupo){

        for (int i = 0 ; i < programa.length;i++ ){
            if (programa[i]==null){
                programa[i] = grupo;

                this.duracion += grupo.getTiempoActuación();
                this.costeTotal += grupo.calcularPrecioFinal(grupo.getPopularidad(),grupo.getCoste());
                break;
            }
        }
    }
    public GruposMusicales dameGrupo(int posicion){
        GruposMusicales grupoADevolver = null ;
        if (posicion >= 0 && posicion < programa.length){
            grupoADevolver = programa[posicion];
        }
        return grupoADevolver;
    }

    @Override
    public String toString() {
        String factura = "";

        for (int i = 0; i<programa.length; i++){
            if (programa[i] != null){
                int numGrupo = i+1;
                factura +=  // "***************************************\n" +
                        "Festimad. Grupo " + numGrupo+  "\n" +
                        "***************************************\n" +
                        programa[i].toString() + "\n" +
                        "***************************************\n" +
                                "\n";
            }
        }
        factura += "Coste total : "+getCosteTotal() + " Euros \n" +
                "Duracion total del festival : "+ getDuracion()+" Minutos \n";
        return factura;

    }
}
