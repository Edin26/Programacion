package Ejercicios;

import java.io.*;

public class FuncionesFicheros {




    public static int contarRegistros(String ruta){

        int contador = 0;

        try (FileReader lector = new FileReader(ruta);
            BufferedReader bflector = new BufferedReader(lector);){
            String linea ="";
            while (linea != null){
                linea = bflector.readLine();
                if (linea != null){
                    contador++;}
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Archivo no existe");

        } catch (IOException e) {

            e.printStackTrace();
        }
        return contador;
    }

    //escribir en el fichero
    public static void escribirFichero (String ruta, String mensaje){

        try(BufferedWriter bfEscritor = new BufferedWriter(new FileWriter(ruta,true));){
                bfEscritor.write(mensaje);
        }
        catch (FileNotFoundException e) {
            System.out.println("Archivo no existe");

        } catch (IOException e) {

            e.printStackTrace();
        }

    }
    // Función que vuelca en una matriz de Strings registros de un fichero cada posicion de string es una linea

    public static String [] volvarFichero( String ruta ){

        String registros[] = new String[contarRegistros(ruta)];

        try(BufferedReader lector = new BufferedReader(new FileReader(ruta));){
            String linea ="";
            int i =0;

            while(linea!=null&&i<registros.length) {
                registros[i] = lector.readLine();
                i++;
            }

        }
        catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("Archivo no existe");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return registros;

    }

    public static void volcarMatrizAFichero(String []matriz , String ruta) {
        int i = 0;
        while(i<matriz.length&&matriz[i]!=null) {
            escribirFichero(ruta , matriz[i]);
            i++;
        }
    }

    public static void mostrarDirectorios(String ruta) {
        File file = new File(ruta);
        String archivos[] = file.list();

        for(String s : archivos) {
            File fInterno = new File(file.getAbsolutePath(),s);
            if(fInterno.isDirectory()) {
                System.out.println(fInterno.getName());
            }

        }

    }
    public static void mostrarFicherosorExtension(String ruta , String extension) {
        File f = new File(ruta);
        String []ficheros = f.list();

        for(String fi : ficheros) {
            File archivoHijo = new File(f.getAbsolutePath(),fi);
            if(archivoHijo.isFile()) {
                String nombre = archivoHijo.getName();
                //Comprobar existencia extension
                int posPunto = nombre.indexOf(".");
                if(posPunto>0) {
                    String ext = nombre.substring(posPunto+1);


                    if(ext.equals(extension)) {
                        System.out.println(nombre);
                    }
                }

            }
        }
    }


    }
