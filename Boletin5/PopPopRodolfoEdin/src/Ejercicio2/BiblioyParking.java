package Ejercicio2;

import Ejercicio1.*;

import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class BiblioyParking {
    public static String sumarDiasAFecha(String fecha, int dias) {
        if(dias == 0){
            return fecha;
        }
        String[] f = fecha.split("-");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(f[0]), Integer.parseInt(f[1])-1, Integer.parseInt(f[2]));
        calendar.add(Calendar.DAY_OF_MONTH, dias);
        SimpleDateFormat fe = new SimpleDateFormat("YYYY-MM-dd");
        return fe.format(calendar.getTime());
    }


    public static void main(String[] args) {

        final String rutaDisco = System.getProperty("user.dir") + "/Discos.txt";
        final String rutaPelicula = System.getProperty("user.dir") + "/Peliculas.txt";
        final String rutaLibro = System.getProperty("user.dir") + "/Libros.txt";
        final String rutaVehiculos = System.getProperty("user.dir") + "/Vehiculos.txt";
        final String rutaAparcamiento = System.getProperty("user.dir") + "/Aparcamiento.txt";
        final int DISCO = 1;
        final int PELICULA = 2;
        final int LIBRO = 3;
        final int VEHICULO = 4;
        final int APARCAMIENTO = 5;

        ArrayList<IAlquilable> alquilables = new ArrayList<IAlquilable>();

        try {
            MetodosFicheros.ConexionFichero(alquilables, rutaDisco, DISCO);
            MetodosFicheros.ConexionFichero(alquilables, rutaPelicula, PELICULA);
            MetodosFicheros.ConexionFichero(alquilables, rutaLibro, LIBRO);
            MetodosFicheros.ConexionFichero(alquilables, rutaVehiculos, VEHICULO);º
        } catch (Exception e) {
            System.out.println("Error al guardar infomacion de ficheros");
        }

        LocalTime hora = LocalTime.now();
        var temp = LocalTime.now().getHour() + ":"+ LocalTime.now().getMinute();
        temp = "00:00";
        System.out.println(temp);

        LocalDate date = LocalDate.now();
        //System.out.println(date);
        date = LocalDate.parse("1111-11-11");
        System.out.println(date);
        //System.out.println(sumarDiasAFecha(date.toString() , 10));

        //endregionn
        boolean menuActivo = true;
        int opcionActual = 0;

        if (menuActivo=true) {
            do {
                System.out.println("1. Alquilar un libro.");
                System.out.println("2. Alquilar una Película.");
                System.out.println("3. Alquilar un DVD de música.");
                System.out.println("4. Devolver un producto.");
                System.out.println("5. Ver todos los productos disponibles.");
                System.out.println("6. Alquilar un Vehículo");
                System.out.println("7. Devolver un vehículo");
                System.out.println("8. Alquilar una plaza de aparcamiento.");
                System.out.println("9. Guardar Información en Ficheros");
                System.out.println("10. Salir");
                try {
                    System.out.println("Selecciona una opcion :");
                    opcionActual = new Scanner(System.in).nextInt();
                } catch (Exception e) {
                    System.out.println("Opcion no valida");
                }

                switch (opcionActual) {
                    case 1:
                        //region ALQUILAR UN LIBRO
                        //mostrar los libros disponibles
                        System.out.println("Libros disponibles para alquilar");
                        int numLibros = 0;
                        for (var p : alquilables) {
                            if (p instanceof Libro) {
                                if (((Producto) p).getAlquilado() == false) {
                                    System.out.println(p);
                                }
                                numLibros++;
                            }
                        }
                        if (numLibros > 0) {
                            System.out.println("Desea alquilar un libro ?");
                            System.out.println("S/N");
                            String codigoAdevolver = new Scanner(System.in).nextLine();
                            if (codigoAdevolver.equals("S") || codigoAdevolver.equals("s")) {
                                boolean alquilado = false;
                                System.out.println("Ingresa el coidgo del libro");
                                codigoAdevolver = new Scanner(System.in).nextLine();
                                //buscar codigo
                                for (var p : alquilables) {
                                    if (p instanceof Libro) {
                                        if (((Producto) p).getCodigo().equals(codigoAdevolver)) {
                                            p.alquilar();
                                            alquilado = true;
                                            break;
                                        }
                                    }
                                }
                                if (alquilado) {
                                    System.out.println("Se ha alquilado el libro con exito ");
                                } else {
                                    System.out.println("No se ha podido alquilar el libro con codigo " + codigoAdevolver);
                                }
                            }
                        } else {
                            System.out.println("No hay libros disponibles para alquilar.");
                        }
                        //endregion
                        break;
                    case 2:
                        //region ALQUILAR UNA PELICULA
                        //mostrar las peliculas disponibles
                        System.out.println("Peliculas disponibles para alquilar : ");
                        int numPeliculas = 0;
                        for (var p : alquilables) {
                            if (p instanceof Pelicula) {
                                if (((Producto) p).getAlquilado() == false) {
                                    System.out.println(p);
                                }
                                numPeliculas++;

                            }
                        }
                        if (numPeliculas > 0) {
                            System.out.println("Desea alquilar una pelicula ?");
                            System.out.println("S/N");
                            String codigoPelicula = new Scanner(System.in).nextLine();
                            if (codigoPelicula.equals("S") || codigoPelicula.equals("s")) {
                                boolean alquilado = false;
                                System.out.println("Ingresa el codigo de la pelicula : ");
                                codigoPelicula = new Scanner(System.in).nextLine();
                                //buscar codigo
                                for (var p : alquilables) {
                                    if (p instanceof Pelicula) {
                                        if (((Producto) p).getCodigo().equals(codigoPelicula)) {
                                            p.alquilar();
                                            alquilado = true;
                                            break;
                                        }
                                    }
                                }
                                if (alquilado) {
                                    System.out.println("Se ha alquilado la pelicula con exito ");
                                } else {
                                    System.out.println("No se ha podido alquilar la pelicula con codigo " + codigoPelicula);
                                }
                            }
                        } else {
                            System.out.println("No hay peliculas disponibles para alquilar.");
                        }
                        //endregion
                        break;
                    case 3:
                        //region ALQUILAR UN DVD MUSICA
                        //mostrar los libros disponibles
                        System.out.println("DVD Musica disponibles para alquilar : ");
                        int numDVD = 0;
                        for (var p : alquilables) {
                            if (p instanceof Musica) {
                                if (((Producto) p).getAlquilado() == false) {
                                    System.out.println(p);
                                }
                            }
                            numDVD++;
                        }
                        if (numDVD > 0) {
                            System.out.println("Desea alquilar un DVDMusica ?");
                            System.out.println("S/N");
                            String codigoMusica = new Scanner(System.in).nextLine();
                            if (codigoMusica.equals("S") || codigoMusica.equals("s")) {
                                boolean alquilado = false;
                                System.out.println("Ingresa el codigo de DVDMusica a alquilar : ");
                                codigoMusica = new Scanner(System.in).nextLine();
                                //buscar codigo
                                for (var p : alquilables) {
                                    if (p instanceof Musica) {
                                        if (((Producto) p).getCodigo().equals(codigoMusica)) {
                                            p.alquilar();
                                            alquilado = true;
                                            break;
                                        }
                                    }
                                }
                                if (alquilado) {
                                    System.out.println("Se ha alquilado el DVDMusica con exito ");
                                } else {
                                    System.out.println("No se ha podido alquilar el DVDMusica con codigo " + codigoMusica);
                                }
                            }
                        } else {
                            System.out.println("No hay DVDMusica disponibles para alquilar.");
                        }
                        //endregion
                        break;
                    case 4:
                        //region Devolucion producto
                        System.out.println("Ingrese el codigo del producto a devolver : ");
                        String codigoAdevolver = new Scanner(System.in).nextLine();
                        boolean devolucionOk = false;

                        for (var p : alquilables) {
                            if (p instanceof Producto) {
                                if (((Producto) p).getCodigo().equals(codigoAdevolver) && ((Producto) p).getAlquilado()) {
                                    p.devolver();
                                    devolucionOk = true;
                                    break;
                                }
                            }
                        }
                        if (devolucionOk) {
                            System.out.println("Se ha devuelto el producto con codigo :" + codigoAdevolver + " ");

                        } else {
                            System.out.println("No ha sido posible devoler el producto con codigo : " + codigoAdevolver);
                        }
                        System.out.println();
                        //endregion
                        break;
                    case 5:
                        //Mostrar todos los productos
                        if (alquilables.size() > 0) {
                            for (var p : alquilables) {
                                System.out.println(p);
                            }
                        } else {
                            System.out.println("No existen productos en los ficheros");
                        }
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        //region GuardarDatos Fichero
                        MetodosFicheros.GuardarDatosFicheros(alquilables, rutaDisco, DISCO);
                        System.out.println("Ficheros guardados con exito en ruta: " + rutaDisco);
                        MetodosFicheros.GuardarDatosFicheros(alquilables, rutaPelicula, PELICULA);
                        System.out.println("Ficheros guardados con exito en ruta: " + rutaPelicula);
                        MetodosFicheros.GuardarDatosFicheros(alquilables, rutaLibro, LIBRO);
                        System.out.println("Ficheros guardados con exito en ruta: " + rutaLibro);

                        //Actualizar Array List
                        alquilables.clear();
                        MetodosFicheros.ConexionFichero(alquilables, rutaDisco, DISCO);
                        MetodosFicheros.ConexionFichero(alquilables, rutaPelicula, PELICULA);
                        MetodosFicheros.ConexionFichero(alquilables, rutaLibro, LIBRO);
                        //endregion
                        break;
                    case 10:
                        menuActivo = false;
                        System.out.println("Cerrando la aplicacion... ");
                        break;
                }
            } while (menuActivo);
        }
    }
}
