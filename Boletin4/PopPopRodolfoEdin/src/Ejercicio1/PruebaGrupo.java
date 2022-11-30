package Ejercicio1;

public class PruebaGrupo {

    public static void main(String[] args) {

        var grupo1 = new GruposMusicales("U2",2,3, 80000f);
        var grupo2 = new GruposMusicales("ZonoraDinamita",3,15,76000f);

        System.out.println(grupo1.toString());
        System.out.println();
        System.out.println (grupo2.toString());
    }



}
