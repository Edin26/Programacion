package Ejercicio1;

import java.util.Scanner;

public class PruebaFestival {

    public static void main(String[] args) {
        boolean menuActivo = true;
        int opciones = 0;

        Festival festivales = new Festival("Musica ", 10);
        do {

            System.out.println("1.Añadir Grupo");
            System.out.println("2.Buscar Grupo");
            System.out.println("3.Obtener coste total");
            System.out.println("4.Mostrar grupos más caros");
            System.out.println("5.Mostrar grupos por popularidad:");
            System.out.println("6.Mostrar toda la información del festival");
            System.out.println("7.Cerrar Programa");

            try {
                opciones = new Scanner(System.in).nextInt();
            } catch (Exception e) {
                System.out.println("Opcion no valida.");
            }


            switch (opciones) {
                case 1:
                    //region Añadir Grupo
                    try {
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
                    } catch (Exception e) {
                        System.out.println("Error al guardar el grupo");
                    }
                    //endregion
                    break;
                case 2:
                    //region Buscar Grupo
                    System.out.println("Ingresa el nombre del grupo a buscar");
                    String nombreABuscar = new Scanner(System.in).nextLine();
                    GruposMusicales grupoEncontrado = null;
                    int posicionGrupo = 0;

                    for (int i = 0; i < festivales.getPrograma().length; i++) {
                        if (festivales.getPrograma()[i] != null) {
                            if (festivales.getPrograma()[i].getNombre().equals(nombreABuscar)) {
                                grupoEncontrado = festivales.dameGrupo(i);
                                posicionGrupo = i + 1;
                                break;
                            }
                        }
                    }
                    if (grupoEncontrado != null) {
                        System.out.println("Grupo encontrado :");
                        System.out.println(grupoEncontrado.toString());
                        System.out.println("Posicion : " + posicionGrupo);
                        System.out.println();
                    } else {
                        System.out.println("No se ha encontrado este grupo ");
                    }
                    //endregion
                    break;
                //Obtener coste total: Muestra el coste total del Festival. 1 pto
                case 3:
                    System.out.println("El coste total del festival es : " + festivales.getCosteTotal() + " Euros.");
                    break;
                case 4:
                    GruposMusicales grupoCaro1 = new GruposMusicales();
                    GruposMusicales grupoCaro2 = new GruposMusicales();
                    GruposMusicales grupoCaro3 = new GruposMusicales();

                    if (festivales.getPrograma()[0] != null) {
                        grupoCaro1 = festivales.getPrograma()[0];
                    }
                    for (var grupo : festivales.getPrograma()) {
                        if (grupo != null) {
                            if (grupo.getCoste() > grupoCaro1.getCoste()) {
                                grupoCaro1 = grupo;
                            }
                        }
                    }
                    for (var grupo : festivales.getPrograma()) {
                        if (grupo != null) {
                            if (grupo.getCoste() > grupoCaro2.getCoste() && grupo.getCoste() != grupoCaro1.getCoste()) {
                                grupoCaro2 = grupo;
                            }
                        }
                    }
                    for (var grupo : festivales.getPrograma()) {
                        if (grupo != null) {
                            if (grupo.getCoste() > grupoCaro3.getCoste() && grupo.getCoste() != grupoCaro2.getCoste()
                                    && grupo.getCoste() != grupoCaro1.getCoste()) {
                                grupoCaro3 = grupo;
                            }
                        }
                    }
                    System.out.println("Grupos mas caros ");
                    if (grupoCaro1.getCoste() != 0) {
                        System.out.println("Primer grupo : ");
                        System.out.println(grupoCaro1.toString());
                        System.out.println();
                    }
                    if (grupoCaro2.getCoste() != 0) {
                        System.out.println("Segundo grupo : ");
                        System.out.println(grupoCaro2.toString());
                        System.out.println();
                    }
                    if (grupoCaro3.getCoste() != 0) {
                        System.out.println("Tercer grupo : ");
                        System.out.println(grupoCaro3.toString());
                        System.out.println();
                    }


                    break;
                case 5:
                    System.out.println("Introduce la popularidad entre 0 y 10: ");
                    int popularidadABuscar = new Scanner(System.in).nextInt();
                    if (popularidadABuscar >= 0 && popularidadABuscar <= 10) {
                        System.out.println("Grupos con popularidad superior a " + popularidadABuscar + ": ");
                        for (int i = 0; i < festivales.getPrograma().length; i++) {
                            if (festivales.getPrograma()[i] != null) {
                                if (festivales.getPrograma()[i].getPopularidad() > popularidadABuscar) {
                                    System.out.println(festivales.getPrograma()[i].getNombre());
                                }
                            }
                        }
                    } else {
                        System.out.println("Popularidad no esta en el rango");
                    }
                    break;

                case 6:
                    if (festivales.toString().equals("")) {
                        System.out.println("No existen grupos. \n");
                    } else {
                        System.out.println(festivales.toString());
                    }

                    break;
                case 7:
                    System.out.println("Cerrando el programa...");
                    menuActivo = false;
                    break;


            }


        } while (menuActivo);


    }


}
