package Ejercicio2;

import Ejercicio1.*;

import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class BiblioyParking {


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
            MetodosFicheros.ConexionFichero(alquilables, rutaVehiculos, VEHICULO);
            MetodosFicheros.ConexionFichero(alquilables, rutaAparcamiento, APARCAMIENTO);
        } catch (Exception e) {
            System.out.println("Error al guardar infomacion de ficheros");
        }

        LocalTime hora = LocalTime.now();
        var temp = LocalTime.now().getHour() + ":" + LocalTime.now().getMinute();
        temp = "00:00";
       // System.out.println(temp);

        LocalDate date = LocalDate.now();
        //System.out.println(date);
        date = LocalDate.parse("1111-11-11");
      //  System.out.println(date);
        //System.out.println(sumarDiasAFecha(date.toString() , 10));

        LocalTime d = LocalTime.now();
        String s = d.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT));
        System.out.println("SHORT: " + s);

        //System.out.println(LocalTime.now());

        //endregionn
        boolean menuActivo = true;
        int opcionActual = 0;

        if (menuActivo = true) {
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
                                    numLibros++;
                                }

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
                                    numPeliculas++;
                                }


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
                                    numDVD++;
                                }
                            }

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
                        //region ALQUILAR UN VEHICULO
                        //mostrar los vehiculos disponibles
                        System.out.println("Vehiculos disponibles para alquilar :");
                        int numvehiculos = 0;
                        for (var p : alquilables) {
                            if (p instanceof Vehiculo) {

                                if (((Vehiculo) p).getAlquilado() == false) {
                                    System.out.println(p);
                                    numvehiculos++;
                                }

                            }
                        }
                        if (numvehiculos > 0) {
                            System.out.println("Desea alquilar un vehiculo ?");
                            System.out.println("S/N");
                            String matricula = new Scanner(System.in).nextLine();
                            if (matricula.equals("S") || matricula.equals("s")) {
                                boolean alquilado = false;
                                System.out.println("Ingresa la matricula del vehiculo :");
                                matricula = new Scanner(System.in).nextLine();
                                Vehiculo vehiculoAlquilado = null;
                                //buscar codigo
                                for (var p : alquilables) {
                                    if (p instanceof Vehiculo) {
                                        if (((Vehiculo) p).getMatricula().equals(matricula)) {
                                            p.alquilar();
                                            vehiculoAlquilado = (Vehiculo) p;
                                            alquilado = true;
                                            break;
                                        }
                                    }
                                }
                                if (alquilado) {
                                    System.out.println("Se ha alquilado el vehiculo :" + vehiculoAlquilado.toString());
                                } else {
                                    System.out.println("No se ha podido alquilar el vehiculo con matricula " + matricula);
                                }
                            }
                        } else {
                            System.out.println("No hay vehiculos disponibles para alquilar.");
                        }
                        //endregion
                        break;
                    case 7:
                        //region Devolucion producto
                        System.out.println("Ingrese la matricula del vehiculo a devolver : ");
                        String matriculaADevolver = new Scanner(System.in).nextLine();
                        boolean devolucionVehiculoOk = false;
                        Vehiculo vehiculoDevuelto = null;
                        for (var p : alquilables) {
                            if (p instanceof Vehiculo) {
                                if (((Vehiculo) p).getMatricula().equals(matriculaADevolver) && ((Vehiculo) p).getAlquilado()) {
                                    p.devolver();
                                    devolucionVehiculoOk = true;
                                    vehiculoDevuelto = (Vehiculo) p;
                                    break;
                                }
                            }
                        }
                        if (devolucionVehiculoOk) {
                            System.out.println("Se ha devuelto el vehiculo :" + vehiculoDevuelto.toString());
                        } else {
                            System.out.println("No ha sido posible devoler el producto con codigo : " + matriculaADevolver);
                        }
                        //endregion
                        break;
                    case 8:
                        //region ALQUILAR PLAZA APARCAMIENTO
                        System.out.println("Plazas de aparcamiento disponibles para alquilar :");
                        int numAparcamientos = 0;
                        for (var p : alquilables) {
                            if (p instanceof Aparcamiento) {

                                if (((Aparcamiento) p).getAlquilada() == false) {
                                    System.out.println(p);
                                    numAparcamientos++;
                                }

                            }
                        }
                        if (numAparcamientos > 0) {
                            System.out.println("Desea alquilar una plaza de aparcamiento ?");
                            System.out.println("S/N");
                            String codigoPlaza = new Scanner(System.in).nextLine();
                            if (codigoPlaza.equals("S") || codigoPlaza.equals("s")) {
                                boolean alquilado = false;
                                System.out.println("Ingresa el codigo de la plaza de aparcamiento :");
                                codigoPlaza = new Scanner(System.in).nextLine();
                                Aparcamiento plazaAlquilada = null;
                                //buscar codigo
                                for (var p : alquilables) {
                                    if (p instanceof Aparcamiento) {
                                        if (((Aparcamiento) p).getCodigo().equals(codigoPlaza)) {
                                            p.alquilar();
                                            plazaAlquilada = (Aparcamiento) p;
                                            alquilado = true;
                                            break;
                                        }
                                    }
                                }
                                if (alquilado) {
                                    System.out.println("Se ha alquilado la plaza :" + plazaAlquilada.toString());
                                } else {
                                    System.out.println("No se ha podido alquilar la plaza de aparcamiento: " + codigoPlaza);
                                }
                            }
                        } else {
                            System.out.println("No hay plaza de aparcamiento disponibles para alquilar.");
                        }
                        //endregion
                        break;
                    case 9:
                        //region GuardarDatos Fichero
                        MetodosFicheros.GuardarDatosFicheros(alquilables, rutaDisco, DISCO);
                        System.out.println("Ficheros guardados con exito en ruta: " + rutaDisco);
                        MetodosFicheros.GuardarDatosFicheros(alquilables, rutaPelicula, PELICULA);
                        System.out.println("Ficheros guardados con exito en ruta: " + rutaPelicula);
                        MetodosFicheros.GuardarDatosFicheros(alquilables, rutaLibro, LIBRO);
                        System.out.println("Ficheros guardados con exito en ruta: " + rutaLibro);
                        MetodosFicheros.GuardarDatosFicheros(alquilables, rutaVehiculos, VEHICULO);
                        System.out.println("Ficheros guardados con exito en ruta: " + rutaVehiculos);

                        //Actualizar Array List
                        alquilables.clear();
                        MetodosFicheros.ConexionFichero(alquilables, rutaDisco, DISCO);
                        MetodosFicheros.ConexionFichero(alquilables, rutaPelicula, PELICULA);
                        MetodosFicheros.ConexionFichero(alquilables, rutaLibro, LIBRO);
                        MetodosFicheros.ConexionFichero(alquilables, rutaVehiculos, VEHICULO);
                        MetodosFicheros.ConexionFichero(alquilables, rutaAparcamiento, APARCAMIENTO);
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
