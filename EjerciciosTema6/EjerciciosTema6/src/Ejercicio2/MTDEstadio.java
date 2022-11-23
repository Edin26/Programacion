package Ejercicio2;

public class MTDEstadio {

    public static boolean GuardarEstadio(Estadio estadioAGuardar, Estadio[] estadios) {

        for (int i = 0; i < estadios.length; i++) {
            if (estadios[i] == null) {
                estadios[i] = estadioAGuardar;
                return true;
            }

        }
        return false;
    }

    public static void PrintarEstadios(Estadio[] estadios) {

        for (var estadio : estadios) {
            if (estadio != null)
                System.out.println(estadio);
        }
    }

    public static void MostrarEstadiosSegunCapacidad(int capacidad, Estadio[] estadios) {
        for (var estadio : estadios) {
            if (estadio != null) {
                if (estadio.getCapacidad() > capacidad) {
                    System.out.println(estadio);
                }
            }
        }
    }
    public static void MostrarEstadiosSegunCiudad(String ciudad , Estadio [] estadios){

        for (var estadio : estadios) {
            if (estadio != null) {
                if (estadio.getCiudad().equals(ciudad) ) {
                    System.out.println(estadio);
                }
            }
        }
    }
    public static void BuscarEstadiosSegunNombre(String nombre , Estadio [] estadios){

        for (var estadio : estadios) {
            if (estadio != null) {
                if (estadio.getNombre().equals(nombre) ){
                    System.out.println(estadio);
                    break;
                }
            }
        }
    }



}
