package Listas;

import java.util.Comparator;

public class ComparaLibroPorTitulo implements Comparator<Libro> {


        @Override
        public int compare(Libro o1, Libro o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    }

