import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {


    public static void main(String[] args) {

        int[] matrizNumerosEnteros = new int[100];
        int numeroUsuario = 0;
        boolean menuActivo = false;
        int opcionSeleccionada = 0;


        // array de 100 números enteros con valores aleatorios entre 0 y 100
        Random rnd = new Random();

        // Relleno array de numeros enteros de 0 a 100
        for (int i = 0; i < matrizNumerosEnteros.length; i++) {
            matrizNumerosEnteros[i] = rnd.nextInt(100);
        }
        menuActivo = true;
        //Creamos un menu con bucle do while
        do {
            System.out.println();
            System.out.println("1. Mostrar valores superiores a un numero.");
            System.out.println("2. Calcula la media de 50 primeros numeros");
            System.out.println("3. Mostrar por pantalla los 10 primeros valores superiores a 20");
            System.out.println("4. Mostrar el primer valor inferior a un numero");
            System.out.println("5. Mostrar por pantalla los valores que son primos");
            System.out.println("6. Mostrar el valor máximo y el mínimo del array");
            System.out.println("7. Mostrar valores multiplos de 3 y 5 en binario ");
            System.out.println("8. Salir.");
            System.out.println("Selecione una opcion : ");

            Scanner entrada = new Scanner(System.in);
            opcionSeleccionada = entrada.nextInt();

            switch (opcionSeleccionada) {

                case 1:
                    //region Mostrar valores superiores a uno introducido por el usuario
                    System.out.println("Introduce un valor entero :  ");
                    numeroUsuario = entrada.nextInt();
                    boolean numerosSuperiores = false;
                    System.out.println("Numeros superiores a : " + numeroUsuario);
                    for (int i = 0; i < matrizNumerosEnteros.length; i++) {
                        if (numeroUsuario < matrizNumerosEnteros[i]) {
                            System.out.print(matrizNumerosEnteros[i] + ", ");
                            numerosSuperiores = true;
                        }
                    }
                    if (numerosSuperiores == false) {
                        System.out.println("No se han encontrado numeros superiores a : " + numeroUsuario);
                    }
                    System.out.println();
                    break;
                //endregion
                case 2:
                    //region Calcular la media de los 50 primeros valores almacenados.
                    int sumaNumeros = 0;
                    double media = 0.0;
                    int contadorPrueba = 0;
                    for (int i = 0; i < 50; i++) {
                        sumaNumeros += matrizNumerosEnteros[i];
                        contadorPrueba += 1;
                    }
                    media = (double) sumaNumeros / 50;
                    System.out.println("La media de los 50 primeros numeros es : " + media);
                    break;
                //endregion
                case 3:
                    //region Mostrar por pantalla los 10 primeros valores que sean superiores a 20 junto con las posiciones que ocupan.
                    int contadorNumerosMayoresA20 = 0;
                    System.out.println("10 Primeros numeros mayores a 20 : ");
                    for (int i = 0; i < matrizNumerosEnteros.length; i++) {
                        if (matrizNumerosEnteros[i] > 20 && contadorNumerosMayoresA20 <= 10) {
                            contadorNumerosMayoresA20 += 1;
                            System.out.println("Numero : " + matrizNumerosEnteros[i] + " Posicion en array : " + i);
                        }
                        if (contadorNumerosMayoresA20 > 10) {
                            break;
                        }
                    }
                    break;
                //endregion
                case 4:
                    //region Mostrar por pantalla el primer valor inferior al introducido por el usuario.
                    System.out.println("Introduce un valor entero :  ");
                    numeroUsuario = entrada.nextInt();
                    for (int i = 0; i < matrizNumerosEnteros.length; i++) {
                        if (numeroUsuario > matrizNumerosEnteros[i]) {
                            System.out.println("El primer valor inferior a : " + numeroUsuario + " Es : " + matrizNumerosEnteros[i]);
                            break;
                        }
                    }
                    break;
                //endregion
                case 5:
                    //region Detectar números primos en array de numeros enteros
                    System.out.println("Numeros primos : ");
                    for (int i = 0; i < matrizNumerosEnteros.length; i++) {

                        int numeroAComprobar = matrizNumerosEnteros[i];
                        boolean esPrimo = true;
                        for (int j = 2; j < numeroAComprobar; j++) {
                            if (numeroAComprobar % j == 0) {
                                esPrimo = false;
                                break;
                            }
                        }
                        if (esPrimo) {
                            System.out.print(numeroAComprobar + ", ");
                        }
                    }
                    System.out.println();
                    //endregion
                case 6:
                    //region Mostrar el valor máximo y el mínimo del array
                    int primerNumeroMaximo = 0;
                    int segundoNumeroMaximo = 0;
                    int primerNumeroMinimo = matrizNumerosEnteros[0];
                    int segundoNumeroMinimo = matrizNumerosEnteros[0];
                    System.out.println("Numero Maximo Y Minimo del array ");

                    for (int valor : matrizNumerosEnteros) {
                        if (valor > primerNumeroMaximo) {
                            primerNumeroMaximo = valor;
                        }
                        if(valor < primerNumeroMinimo ){
                            primerNumeroMinimo = valor;
                        }
                    }
                    System.out.println("Primer Numero maximo : " + primerNumeroMaximo);
                    System.out.println("Primer Numero minimo : " + primerNumeroMinimo);
                    break;
                    //endregion

                    // default:
                    //     System.out.println("Opcion selecionada no valida. ");
                    //     break;

            }

            System.out.println("Desea continuar ? s/n ");
            String salirMenu = "";
            salirMenu = entrada.next();

            if (salirMenu.equals("n")) {
                System.out.println("Saliendo del programa ...");
                menuActivo = false;
            }

        } while (menuActivo);


    }
}
