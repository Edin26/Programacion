import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {


    public static void main(String[] args) {

        int[] numerosEnteros = new int[100];
        int numeroUsuario = 0;
        boolean menuActivo = false;
        int opcionSeleccionada = 0;

        // array de 100 números enteros con valores aleatorios entre 0 y 100
        Random rnd = new Random();

        // Relleno array de numeros enteros de 0 a 100
        for (int i = 0; i < numerosEnteros.length; i++) {
            numerosEnteros[i] = rnd.nextInt(100);
        }


        //numeros primos
        //Detectar números primos

/*        int numero = 7;

        boolean primo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
                break;

            }
        }

        if (primo) {
            System.out.print("Número primo");
        } else {
            System.out.println("Número no primo");
        }*/
        menuActivo = true;
        //Creamos un menu con bucle do while
        do {

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
                    //Mostrar valores superiores a uno introducido por el usuario
                    System.out.println("Introduce un valor entero :  ");
                    numeroUsuario = entrada.nextInt();
                    boolean numerosSuperiores = false;
                    System.out.println("Numeros superiores a : " + numeroUsuario);
                    for (int i = 0; i < numerosEnteros.length; i++) {
                        if (numeroUsuario < numerosEnteros[i]) {
                            System.out.print(numerosEnteros[i] + ", ");
                            numerosSuperiores = true;
                        }
                    }
                    if (numerosSuperiores == false) {
                        System.out.println("No se han encontrado numeros superiores a : " + numeroUsuario);
                    }
                    System.out.println();
                    break;
                case 2:
                    //Calcular la media de los 50 primeros valores almacenados.
                    int sumaNumeros = 0;
                    double media = 0.0;
                    int contadorPrueba = 0;
                    for (int i = 0; i < 50; i++) {
                        sumaNumeros += numerosEnteros[i];
                        contadorPrueba += 1;
                    }
                    media = (double) sumaNumeros / 50;
                    System.out.println("La media de los 50 primeros numeros es : " + media);
                    break;
                case 3:
                    //Mostrar por pantalla los 10 primeros valores que sean superiores a 20 junto con las posiciones que ocupan.
                    int contadorNumerosMayoresA20 = 0;
                    System.out.println("10 Primeros numeros mayores a 20 : ");
                    for (int i = 0; i < numerosEnteros.length; i++) {
                        if (numerosEnteros[i] > 20 && contadorNumerosMayoresA20 <= 10) {
                            contadorNumerosMayoresA20 += 1;
                            System.out.println("Numero : " + numerosEnteros[i] + " Posicion en array : " + i);
                        }
                        if (contadorNumerosMayoresA20 > 10) {
                            break;
                        }
                    }
                    break;
                case 4:
                    //Mostrar por pantalla el primer valor inferior al introducido por el usuario.
                    System.out.println("Introduce un valor entero :  ");
                    numeroUsuario = entrada.nextInt();
                    for (int i = 0; i < numerosEnteros.length; i++) {
                        if (numeroUsuario > numerosEnteros[i]) {
                            System.out.println("El primer valor inferior a : " + numeroUsuario + " Es : " + numerosEnteros[i]);
                            break;
                        }
                    }
                    break;

                default:
                    System.out.println("Opcion selecionada no valida. ");
                    break;
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
