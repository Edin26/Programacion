import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        int opcionElegida ;
        int numeroGenerado = 0;
        int intentos ;
        int puntuacionJuego = 0;
        int numeroUsuario ;
        boolean juegoActivo = true;

        do {
            System.out.println("Juego adivinar el numero.       Puntos actuales : " + puntuacionJuego);
            System.out.println("1.Nivel : numero entre 1 y 15, 3 intentos");
            System.out.println("2.Nivel : " + "numero entre 1 y 30, 4 intentos");
            System.out.println("3.Nivel : numero entre 1 y 50, 5 intentos");
            System.out.println("4.Salir del juego.");
            System.out.println("Selecciona una opcion del menu : ");
            Scanner lector = new Scanner(System.in);
            opcionElegida = lector.nextInt();
            Random rnd = new Random();

            switch (opcionElegida) {
                case 1:
                    //region Nivel 1
                    numeroGenerado = rnd.nextInt(1, 15);
                    intentos = 3;
                    boolean jugar = true;
                    while (jugar) {
                        boolean finDelJuego = false;
                        //solicitar numero al usuario
                        Scanner entrada = new Scanner(System.in);
                        System.out.println("Ingresa un número : ");
                        numeroUsuario = entrada.nextInt();

                        //Verificar si el numero del usuario es igual al generado
                        if (numeroUsuario > numeroGenerado) {
                            System.out.println("El número es menor al introducido.");
                            intentos--;
                            System.out.println("Numero de intentos restantes : " + intentos);
                        } else if (numeroUsuario < numeroGenerado) {
                            System.out.println("El número es mayor al introducido.");
                            intentos--;
                            System.out.println("Numero de intentos restantes : " + intentos);
                        } else if (numeroUsuario == numeroGenerado) {
                            System.out.println("!Has encontrado el numero¡");
                            finDelJuego = true;
                        }
                        //Puntos a ganar
                        if (finDelJuego) {
                            switch (intentos) {
                                case 3:
                                    puntuacionJuego += 10;
                                    System.out.println("Has Ganado 10 puntos.");
                                    jugar = false;
                                    break;
                                case 2:
                                    puntuacionJuego += 7;
                                    System.out.println("Has Ganado 7 puntos.");
                                    jugar = false;
                                    break;
                                case 1:
                                    puntuacionJuego += 5;
                                    System.out.println("Has Ganado 5 puntos.");
                                    jugar = false;
                                    break;
                                default:
                                    break;
                            }
                        }
                        //sin intentos disponibles
                        if (intentos == 0) {
                            System.out.println("Numero de intentos superado, fin del juego. ");
                            jugar = false;
                        }
                    }
                    //endregion
                    break;
                case 2:
                    //region Nivel 2
                    numeroGenerado = rnd.nextInt(1, 30);
                    intentos = 4;
                    jugar = true;
                    while (jugar) {
                        boolean finDelJuego = false;
                        //solicitar numero al usuario
                        Scanner entrada = new Scanner(System.in);
                        System.out.println("Ingresa un número : ");
                        numeroUsuario = entrada.nextInt();

                        //Verificar si el numero del usuario es igual al generado
                        if (numeroUsuario > numeroGenerado) {
                            System.out.println("El número es menor al introducido.");
                            intentos--;
                            System.out.println("Numero de intentos restantes : " + intentos);
                        } else if (numeroUsuario < numeroGenerado) {
                            System.out.println("El número es mayor al introducido.");
                            intentos--;
                            System.out.println("Numero de intentos restantes : " + intentos);
                        } else if (numeroUsuario == numeroGenerado) {
                            System.out.println("!Has encontrado el numero¡");
                            finDelJuego = true;
                        }
                        //Puntos a ganar
                        if (finDelJuego) {
                            switch (intentos) {
                                case 4:
                                    puntuacionJuego += 30;
                                    System.out.println("Has Ganado 30 puntos.");
                                    jugar = false;
                                    break;
                                case 3:
                                    puntuacionJuego += 20;
                                    System.out.println("Has Ganado 20 puntos.");
                                    jugar = false;
                                    break;
                                case 2:
                                    puntuacionJuego += 10;
                                    System.out.println("Has Ganado 10 puntos.");
                                    jugar = false;
                                    break;
                                case 1:
                                    puntuacionJuego += 7;
                                    System.out.println("Has Ganado 7 puntos.");
                                    jugar = false;
                                    break;
                                default:
                                    break;
                            }
                        }
                        //sin intentos disponibles
                        if (intentos == 0) {
                            System.out.println("Numero de intentos superado, fin del juego. ");
                            jugar = false;
                        }
                    }
                    //endregion
                    break;
                case 3:
                    //region Nivel 3
                    numeroGenerado = rnd.nextInt(1, 50);
                    intentos = 5;
                    jugar = true;
                    while (jugar) {
                        boolean finDelJuego = false;
                        //solicitar numero al usuario
                        Scanner entrada = new Scanner(System.in);
                        System.out.println("Ingresa un número : ");
                        numeroUsuario = entrada.nextInt();

                        //Verificar si el numero del usuario es igual al generado
                        if (numeroUsuario > numeroGenerado) {
                            System.out.println("El número es menor al introducido.");
                            intentos--;
                            System.out.println("Numero de intentos restantes : " + intentos);
                        } else if (numeroUsuario < numeroGenerado) {
                            System.out.println("El número es mayor al introducido.");
                            intentos--;
                            System.out.println("Numero de intentos restantes : " + intentos);
                        } else if (numeroUsuario == numeroGenerado) {
                            System.out.println("!Has encontrado el numero¡");
                            finDelJuego = true;
                        }
                        //Puntos a ganar
                        if (finDelJuego) {
                            switch (intentos) {
                                case 5:
                                    puntuacionJuego += 50;
                                    System.out.println("Has Ganado 50 puntos.");
                                    jugar = false;
                                    break;
                                case 4:
                                    puntuacionJuego += 35;
                                    System.out.println("Has Ganado 35 puntos.");
                                    jugar = false;
                                    break;
                                case 3:
                                    puntuacionJuego += 20;
                                    System.out.println("Has Ganado 20 puntos.");
                                    jugar = false;
                                    break;
                                case 2:
                                    puntuacionJuego += 15;
                                    System.out.println("Has Ganado 15 puntos.");
                                    jugar = false;
                                    break;
                                case 1:
                                    puntuacionJuego += 7;
                                    System.out.println("Has Ganado 7 puntos.");
                                    jugar = false;
                                    break;
                                default:
                                    break;
                            }
                        }
                        //sin intentos disponibles
                        if (intentos == 0) {
                            System.out.println("Numero de intentos superado, fin del juego. ");
                            jugar = false;
                        }
                    }
                    //endregion
                    break;
            }
            //region salir menu
            System.out.println();
            String salirMenu = "";
            if (opcionElegida != 4) {
                System.out.println("Desea volver a jugar ? S/N ");
                salirMenu = lector.next().toUpperCase();
            }
            if (salirMenu.equals("N") || opcionElegida == 4) {
                System.out.println("Cerrando el juego ...");
                juegoActivo = false;
            }
            opcionElegida = 0;
            //endregion
        } while (juegoActivo);


    }
}
