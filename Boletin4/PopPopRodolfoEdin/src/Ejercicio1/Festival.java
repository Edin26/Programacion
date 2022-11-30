package Ejercicio1;

import java.util.Arrays;

public class Festival {

    String nombre;
    int duracion ;
    float costeTotal;
    GruposMusicales [] programa;

    public Festival(String nombre, int numeroDeGrupos) {

        this.nombre = nombre;
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

                factura +=  "***************************************\n" +
                        "Festimad. Grupo " + i+1 +  "\n" +
                        "***************************************\n" +
                        programa[i].toString() + "\n" +
                        "***************************************\n" ;
                System.out.println();
            }
        }
        return factura;

    }
}
