package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Principal2
{

    public static void main(String[] args) {


        ArrayList<Libro> biblioteca = new ArrayList<Libro>();
        Libro biblio[] = new Libro[3];

        biblioteca.add(new Libro("La tiera","ken follet",30,9));
        biblioteca.add(new Libro("EL padrino","arturo",50,4));
        biblioteca.add(new Libro("La torre","juaneto",25,8));

        biblio[0] = biblioteca.get(0);
        biblio[1] = biblioteca.get(1);
        biblio[2] = biblioteca.get(2);

        Arrays.sort(biblio);

        for (var libro :biblioteca) {
            if (libro.getValoracion()>= 9){
                System.out.println(libro);
            }
        }

        Arrays.sort(biblio, new ComparadorLibros());

        //Ordelar la lista --> biblioteca por titulo
        biblioteca.sort(new ComparadorLibros());

        for (Libro l : biblioteca ) {
            System.out.println(l.getAutor());

        }
        //Orderndar por titulo
        biblioteca.sort(new ComparaLibroPorTitulo());

        //Ordenar por valoracion
        //clase anonima
        biblioteca.sort(new Comparator<Libro>()
        {
            @Override
            public int compare(Libro o1, Libro o2) {
                Float v1 = Float.valueOf(o1.getValoracion());
                Float v2 = Float.valueOf(o2.getValoracion());

                return v1.compareTo(v2);
            }
        });
        System.out.println("Best sellers : ordenador por valoracion ");
        for (Libro l : biblioteca) {
            System.out.println(l);
        }


    }


}
