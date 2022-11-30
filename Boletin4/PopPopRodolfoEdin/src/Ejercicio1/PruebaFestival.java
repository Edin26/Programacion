package Ejercicio1;

import java.util.Scanner;

public class PruebaFestival {

    public static void main(String[] args) {
        boolean menuActivo = true;
        int opciones = 0;

        Festival festivales = new Festival("Musica ", 5);


        /* Añadir Grupo: Solicita los datos de un grupo y lo añade al Festival. 1 pto
        Buscar Grupo: Se solicita el nombre del grupo y se muestra la información del mismo y la posición en la que se encuentra en el Festival. 1 pto
        Obtener coste total: Muestra el coste total del Festival. 1 pto
        Mostrar grupos más caros: Muestra los 3 grupos más caros del Festival. 1 pto
        Mostrar grupos por polaridad: Permite al usuario introducir una popularidad y muestra los grupos con una popularidad superior. 1 pto
        Mostrar toda la información del festival,  incluyendo la duración y el coste total del Festival. 1 pto */

        do {

            System.out.println("1.Añadir Grupo");
            System.out.println("2.Buscar Grupo");
            System.out.println("3.Obtener coste total");
            System.out.println("4.Mostrar grupos más caros");
            System.out.println("5.Mostrar grupos por popularidad:");
            System.out.println("6.ostrar toda la información del festival");
            System.out.println("7.Cerrar Programa");

            try {
                opciones = new Scanner(System.in).nextInt();
            } catch (Exception e) {
                System.out.println("Opcion no valida.");
            }


            switch (opciones) {
                case 1:

                    System.out.println("Introduzca el nombre del grupo");
                    String nombre = new Scanner(System.in).nextLine();
                    System.out.println("Introduzca el tiempo de actuacion del grupo");
                    int tiempoActuación = new Scanner(System.in).nextInt();
                    System.out.println("Introduzca la popularidad de 0 a 10 del grupo");
                    int popularidad = new Scanner(System.in).nextInt();
                    System.out.println("Introduzca el coste del grupo");
                    float coste = new Scanner(System.in).nextFloat();


                    GruposMusicales grupoAGuardar = new GruposMusicales(nombre, tiempoActuación, popularidad, coste);
                    festivales.AddGrupo(grupoAGuardar);


                    break;
                case 2:
                    System.out.println("Ingresa el nombre del grupo a buscar");
                    String nombreABuscar = new Scanner(System.in).nextLine();
                    GruposMusicales grupoEncontrado = null;
                    int posicion = 0;

                    for(int i = 0; i<festivales.programa.length ; i++ ){
                        if (festivales.programa[i] != null ){
                            if (festivales.programa[i].getNombre().equals(nombreABuscar)){
                                grupoEncontrado = festivales.dameGrupo(i);
                                //TODO
                                break;
                            }
                        }
                    }


                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println(festivales.toString());
                    break;


            }


        } while (menuActivo);


    }


}
