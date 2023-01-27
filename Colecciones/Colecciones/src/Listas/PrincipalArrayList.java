package Listas;

import java.util.ArrayList;

public class PrincipalArrayList {


    public static void main(String[] args) {

        ArrayList<String> matriculas = new ArrayList<String>();


        matriculas.add("123123ASD");
        matriculas.add("444213DAAS");
        matriculas.add("6546545421D");

        ArrayList<String> alumnos = new ArrayList<String>(2);
        alumnos.add("juan1");
        alumnos.add("pedro");
        alumnos.add("maria");


        ArrayList<String> matriculados = new ArrayList<String>(alumnos);

        //Recuperar objetos guardados
        String Alumno = alumnos.get(0);

        //busqueda
        int posicion = alumnos.indexOf("juan3");

        //eliminar objetos remove, clear
        alumnos.remove("juan2");

        //visualizar consola
        for (int i = 0 ; i< alumnos.size();i++){
            System.out.println(alumnos.get(i));
        }
        //alumnos por j
        for (var al :alumnos) {
            if (al.startsWith("m")){
                System.out.println(al);
            }

        }




    }




}
