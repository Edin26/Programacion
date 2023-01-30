package Ejercicio1;

import Ejercicio2.Aparcamiento;
import Ejercicio2.Vehiculo;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;


public class MetodosFicheros {

    public static void ConexionFichero(ArrayList productos, String ruta, int tipoProducto ) {
        try (BufferedReader bfLector = new BufferedReader(new FileReader(ruta))) {
            String linea = "";
            String datosFichero[];
            while (linea != null) {
                linea = bfLector.readLine();
                if (linea != null && !linea.equals("")) {
                    datosFichero = linea.split(",");
                    ConstruirProductos(productos,datosFichero,tipoProducto,ruta);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado con ruta : " + ruta);
        } catch (IOException e) {
            System.out.println("Error al conectar con el fichero : " + ruta);
        }
    }
    public static void ConstruirProductos( ArrayList productos,String datosFichero [],int tipo,String ruta){
        try {
            switch (tipo) {
                case 1:
                    var musica = new Musica(datosFichero[0], datosFichero[1], Integer.parseInt(datosFichero[2]), datosFichero[3]);
                    if (Integer.parseInt(datosFichero[4]) == 1) {
                        musica.setAlquilado(true);
                        musica.setDiasPrestamo(Integer.parseInt(datosFichero[5]));
                    }
                    productos.add(musica);
                    break;
                case 2:
                    var pelicula = new Pelicula(datosFichero[0], datosFichero[1], Integer.parseInt(datosFichero[2]), datosFichero[3], datosFichero[4]);
                    if (Integer.parseInt(datosFichero[5]) == 1) {
                        pelicula.setAlquilado(true);
                        pelicula.setDiasPrestamo(Integer.parseInt(datosFichero[6]));
                    }
                    productos.add(pelicula);
                    break;
                case 3:
                    var libro = new Libro(datosFichero[0], datosFichero[1], datosFichero[2], Integer.parseInt(datosFichero[3]));
                    if (Integer.parseInt(datosFichero[4]) == 1) {
                        libro.setAlquilado(true);
                        libro.setDiasPrestamo(Integer.parseInt(datosFichero[5]));
                    }
                    productos.add(libro);
                    break;
                case 4:
                    boolean vAlquilado=false;
                    if (Integer.parseInt(datosFichero[3]) == 1) {
                        vAlquilado = true;
                    }
                    var vehiculo = new Vehiculo(datosFichero[0],datosFichero[1],datosFichero[2],vAlquilado,
                            LocalDate.parse(datosFichero[4]),LocalDate.parse(datosFichero[5]));

                    productos.add(vehiculo);
                    break;
                case 5:
                    //String codigo, int numeroPlaza, boolean alquilada, LocalDate horaPrestamo, LocalDate horaDevolucion
                    boolean pAlquilado=false;
                    if (Integer.parseInt(datosFichero[2]) == 1) {
                        pAlquilado = true;
                    }

                    var aparcamiento = new Aparcamiento(datosFichero[0],Integer.parseInt(datosFichero[1]),pAlquilado,
                            LocalTime.parse(datosFichero[3]),LocalTime.parse(datosFichero[4]));
                    productos.add(aparcamiento);
                    break;
            }
        }catch (Exception e) {
            System.out.println("No se ha creado el producto porque no tiene un codigo valido :" + ruta);
        }

    }
    public static void GuardarDatosFicheros(ArrayList productos, String ruta, int tipo) {
        try (BufferedWriter bfWrite = new BufferedWriter(new FileWriter(ruta))) {
            for (var p : productos) {
                switch (tipo) {
                    case 1:
                        if (p instanceof Musica) {
                            bfWrite.write(((Musica) p).toStringFichero());
                            bfWrite.newLine();
                        }
                        break;
                    case 2:
                        if (p instanceof Pelicula) {
                            bfWrite.write(((Pelicula) p).toStringFichero());
                            bfWrite.newLine();
                        }
                        break;
                    case 3:
                        if (p instanceof Libro) {
                            bfWrite.write(((Libro) p).toStringFichero());
                            bfWrite.newLine();
                        }
                        break;
                    case 4:
                        if (p instanceof Vehiculo) {
                            bfWrite.write(((Vehiculo) p).toStringFichero());
                            bfWrite.newLine();
                        }
                        break;
                    case 5:
                        if (p instanceof Aparcamiento) {
                            bfWrite.write(((Aparcamiento) p).toStringFichero());
                            bfWrite.newLine();
                        }
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error al guardar datos en el fichero :" + ruta);
        }
    }






}
