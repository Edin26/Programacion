import java.util.Scanner;

public class Palabras {

    public String[] palabrasGuardadas = new String[5];
    public boolean menuActivo;
    public int opcionElegida;
    public int contadorPalabrasCont = 0;

    public void Ejecutar() {

        do {
            System.out.println("Escoja una opcion : ");
            System.out.println("1. Guardar una palabra.");
            System.out.println("2. Contar palabras con t.");
            System.out.println("3. Buscar una palabra.");
            System.out.println("4. Salir del programa.");
            Scanner entrada = new Scanner(System.in);
            opcionElegida = entrada.nextInt();
            menuActivo=true;

            switch (opcionElegida) {

                case 1:
                    GuardarPalabra(palabrasGuardadas);
                    menuActivo = SalirDelMenu();
                    break;
                case 2:
                    ContarPalabrasCont(palabrasGuardadas);
                    menuActivo = SalirDelMenu();
                    break;
                case 3:
                    BuscarUnaPalabra(palabrasGuardadas);
                    menuActivo = SalirDelMenu();
                    break;
                case 4:
                    System.out.println("Cerrando el programa :D ");
                    menuActivo = false;
                    break;
                default:
                    break;
            }

        } while (menuActivo);

    }

    public void GuardarPalabra(String[] palabras) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe la palabra a guardar : ");
        String palabra = entrada.nextLine();

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i] == null) {
                palabras[i] = palabra;
                break;
            }
        }


    }
    public void ContarPalabrasCont(String[] palabras) {
        contadorPalabrasCont =0;
        for (String p : palabras) {
            if (p != null) {
                if (p.indexOf("t") >= 0) {
                    contadorPalabrasCont += 1;
                }
            }
        }
        System.out.println("El total de palabras con t es : " + contadorPalabrasCont);

    }
    public void BuscarUnaPalabra(String[] palabras){
        System.out.println("Escribe la palabra a buscar : ");
        Scanner entrada = new Scanner(System.in);
        var palabraABuscar = entrada.nextLine();
        boolean palabraEncontrada=false;
        for(int i=0; i<palabras.length;i++ ){
            if( palabras[i] == palabraABuscar){
                palabraEncontrada = true;
                System.out.println("Palabra a buscar : "+ palabraABuscar +" Esta esta en la posicion : "+i);
                break;
            }
        }
        if (palabraEncontrada == false){
            System.out.println("Esta palabra no se encuentra guardada.");
        }
    }
    public boolean SalirDelMenu(){
        System.out.println("Desea continuar ? s/n : ");
        Scanner entrada = new Scanner(System.in);
        var respuesta = entrada.nextLine();
        if( respuesta == "n" ){
            return false;
        }
        else
        {
            return true;
        }

    }
}
