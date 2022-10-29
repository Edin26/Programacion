import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        boolean juegoActivo = false;
        int nivelAJugar = 0;
        int numeroGenerado = 0;
        int intentos = 0;
        int puntuacionJuego = 0;
        int numeroUsuario = 0;

        do {

            System.out.println("Juego adivinar el numero.");

            System.out.println("1.Nivel 1: numero entre 1 y 15, 3 intentos");
            System.out.println("2.Nivel 2: numero entre 1 y 30, 4 intentos");
            System.out.println("3.Nivel 3: numero entre 1 y 50, 5 intentos");
            System.out.println("4.Salir del juego.");
            System.out.println("Elije el nivel : ");
            Scanner lector = new Scanner(System.in);
            nivelAJugar = lector.nextInt();
            Random rnd = new Random();

            switch (nivelAJugar) {
                case 1:
                    numeroGenerado = rnd.nextInt(1, 15);
                    intentos = 3;
                    boolean jugar = true;
                    while (jugar) {
                        boolean finDelJuego = false;
                        Scanner entrada = new Scanner(System.in);
                        System.out.println("Ingresa un número : ");
                        numeroUsuario = entrada.nextInt();

                        if (numeroUsuario > numeroGenerado) {
                            System.out.println("El número es menor al introducido.");
                            intentos--;
                            System.out.println("Numero de intentos restantes : "+ intentos);
                        } else if (numeroUsuario < numeroGenerado) {
                            System.out.println("El número es mayor al introducido.");
                            intentos--;
                            System.out.println("Numero de intentos restantes : "+ intentos);
                        } else if (numeroUsuario == numeroGenerado) {
                            System.out.println("Has encontrado el numero ");
                            finDelJuego = true;
                        }
                        if (finDelJuego) {
                            switch (intentos) {
                                case 3:
                                    puntuacionJuego += 10;
                                    break;
                                case 2:
                                    puntuacionJuego += 7;
                                    break;
                                case 1:
                                    puntuacionJuego += 5;
                                    break;
                                default:break;
                            }
                        }
                        if(intentos == 0){
                            System.out.println("Numero de intentos superado ");
                        }
                    }
                    break;
            }
            //region salir menu
            System.out.println();
            String salirMenu = "";
            if (nivelAJugar != 4) {
                System.out.println("Desea continuar ? s/n ");
                salirMenu = lector.next();
            }
            if (salirMenu.equals("n") || nivelAJugar == 4) {
                System.out.println("Saliendo del programa ...");
                juegoActivo = false;
            }
            nivelAJugar = 0;

            //endregion


        } while (juegoActivo);


    }
}
