package Ejercicio2;

import java.util.Scanner;

public class pruebaEstadio {

    public static void main(String[] args) {

        int opcion ;
        boolean menuActivo = true;

        Estadio[] estadios = new Estadio[100];

        while (menuActivo) {

            System.out.println("1.Guardar estadio");
            System.out.println("2.Mostrar todos los estadios con capacidad superior a una dada.");
            System.out.println("3.Mostrar todos los estadios de una determinada ciudad");
            System.out.println("4.Buscar un estadio a partir del nombre.");

            opcion = new Scanner(System.in).nextInt();
            switch (opcion) {

                case 1:
                    try {
                        System.out.println("nombre estadio");
                        String nombre = new Scanner(System.in).nextLine();
                        System.out.println("capacidad");
                        int capacidad = new Scanner(System.in).nextInt();
                        System.out.println("ciudad");
                        String ciudad = new Scanner(System.in).nextLine();

                        Estadio estadioUsuario = new Estadio(nombre, capacidad, ciudad);

                        if (MTDEstadio.GuardarEstadio(estadioUsuario, estadios)) {
                            System.out.println("guardado");
                        } else {
                            System.out.println("no guardado");
                        }
                        MTDEstadio.PrintarEstadios(estadios);


                    } catch (Exception e) {
                        System.out.println("no");
                    }

                    break;
                case 2:
                    System.out.println("intro capacidad");
                    int capacidad = new Scanner(System.in).nextInt();
                    MTDEstadio.MostrarEstadiosSegunCapacidad(capacidad,estadios);

                    break;
                case 3:
                    System.out.println("intro ciudad");
                    String ciudad = new Scanner(System.in).nextLine();
                    MTDEstadio.MostrarEstadiosSegunCiudad(ciudad,estadios);
                    break;
                case 4:
                    System.out.println("intro nombre");
                    String nombre = new Scanner(System.in).nextLine();
                    MTDEstadio.BuscarEstadiosSegunNombre(nombre,estadios);
                    break;
                default:
                    break;
            }
        }

    }


}
