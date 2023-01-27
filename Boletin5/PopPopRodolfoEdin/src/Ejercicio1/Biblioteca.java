package Ejercicio1;

import Ejercicio2.Vehiculo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Biblioteca {


    public static void DatosFichero(ArrayList productos, String ruta) {

        //mostrar discos
        try (BufferedReader bfLector = new BufferedReader(new FileReader(ruta))) {
            Musica m1 = new Musica("AA12", "Pig", 12, "Pink");

            String linea = "";
            while (linea != null) {
                linea = bfLector.readLine();
                if (linea != null) {
                    var datosDisco = linea.split(",");
                    var musica = new Musica(datosDisco[0], datosDisco[1], Integer.parseInt(datosDisco[2]), datosDisco[3]);
                    if (Integer.parseInt(datosDisco[4])==1){
                        musica.setAlquilado(true);
                        musica.setDiasPrestamo(Integer.parseInt(datosDisco[5]));
                    }
                    productos.add(musica);
                }
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }


    public static void main(String[] args) {

        final String rutaDisco = System.getProperty("user.dir") + "/Discos.txt";
        final String rutaPelicula = System.getProperty("user.dir") + "/Peliculas.txt";
        final String rutaLibro = System.getProperty("user.dir") + "/Libros.txt";
        final String rutaVehiculos = System.getProperty("user.dir") + "/Vehiculos.txt";
        final String rutaAparcamiento = System.getProperty("user.dir") + "/Aparcamiento.txt";

        ArrayList<IAlquilable> Alquilables = new ArrayList<IAlquilable>();

        DatosFichero(Alquilables,rutaDisco);

        for (var p : Alquilables ) {
            if (p instanceof Producto) {
                if (((Producto) p).getAlquilado()==false){
                    System.out.println(p);
                }
            }
        }



        //endregion

        boolean menuActivo = false;
        int opcionActual = 0;

        if (opcionActual != 0) {
            do {
                System.out.println("1. Alquilar un libro.");
                System.out.println("2. Alquilar una Película.");
                System.out.println("3. Alquilar un DVD de música.");
                System.out.println("4. Devolver un producto.");
                System.out.println("5. Ver todos los productos disponibles.");
                System.out.println("6. Guardar Información en Ficheros");
                System.out.println("7. Salir");

                try {
                    System.out.println("Selecciona una opcion :");
                    opcionActual = new Scanner(System.in).nextInt();
                } catch (Exception e) {
                    System.out.println("Opcion no valida");
                }

                switch (opcionActual) {
                    case 1:


                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        menuActivo = false;
                        System.out.println("Cerrando la aplicacion... ");
                        break;

                }


            } while (menuActivo);
        }

    }
}

