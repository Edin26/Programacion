package Pruebas;

import BloqueEjercicio2.MTDCadenas;
import BloqueEjercicios1.MTDNumeros;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PrincipalBloque1 {
    public static void main(String[] args) {
        boolean menuActivo = true;
        int opcionElejida = 0;

        do {
            Scanner entrada = new Scanner(System.in);
            //mostrar consola opciones menu
            MTDNumeros.OpcionesMenu();

            try {
                opcionElejida = entrada.nextInt();
            } catch (Exception e) {
                System.out.println("Opcion no valida.");
            }
            switch (opcionElejida) {
                case 1:
                    //region Numero Perfecto
                    int numero = 0;
                    try {
                        System.out.println("Introduce un numero : ");
                        numero = entrada.nextInt();
                    } catch (Exception e) {
                        System.out.println("Solo se permiten numeros.");
                    }
                    if (numero > 0) {
                        System.out.println("El numero es perfecto ? " + MTDNumeros.NumeroPerfecto(numero));
                    }
                    //endregion
                    break;
                case 2:
                    //region Minino Comun Multiplo
                    int num1 = 0, num2 = 0, num3 = 0;
                    boolean numerosValidos = false;
                    while (!numerosValidos) {
                        try {
                            System.out.println("Ingresa el primer numero mayor que 0 y menor que 100 : ");
                            num1 = entrada.nextInt();
                            System.out.println("Ingresa el segundo numero mayor que 0 y menor que 100 : ");
                            num2 = entrada.nextInt();
                            System.out.println("Ingresa el tercer numero mayor que 0 y menor que 100 : ");
                            num3 = entrada.nextInt();
                        } catch (Exception e) {
                            System.out.println("El numero tiene que ser un entero");
                        }
                        if ((num1 > 0 && num1 < 100) && (num2 > 0 && num2 < 100) && (num3 > 0 && num3 < 100)) {
                            numerosValidos = true;
                        } else {
                            System.out.println("Los numeros no estan en el rango");
                        }
                        entrada.nextLine();
                    }
                    System.out.println("El minimo comun multiplo es : " + MTDNumeros.MinimoComunMultiplo(num1, num2, num3));
                    //endregion
                    break;
                case 3:
                    //region Resistencia equivalente
                    float r1 = 5;
                    float r2 = 30;
                    System.out.println("Resistencia equivalente : " + MTDNumeros.CalculaResistenciaEquivalente(r1, r2) + " Ohmnios.");
                    System.out.println("Resistencia equivalente : " + MTDNumeros.CalculaResistenciaEquivalente(r1, r2, 1) + " microOhmnios.");
                    System.out.println("Resistencia equivalente : " + MTDNumeros.CalculaResistenciaEquivalente(r1, r2, 2) + " KiloOhmnios.");
                    //endregion
                    break;
                case 4:
                    //region AlmacenarMediaPositivos en array
                    int[] array = {100, 3, 9, -8, 4, -90, -7};
                    System.out.println("Array antes de llamar metodo modificar posiciones negativas ");
                    System.out.println(Arrays.toString(array));
                    MTDNumeros.AlmacenarMediaPositivos(array);
                    System.out.println("Array antes de llamar metodo modificar posiciones negativas ");
                    System.out.println(Arrays.toString(array));
                    //endregion
                    break;
                case 5:
                    //region Calcula media array
                    Random rnd = new Random();
                    float matrizTipoFloat[] = new float[10];
                    int matrizTipoInt[] = new int[10];

                    for (int i = 0; i < matrizTipoFloat.length; i++) {
                        matrizTipoFloat[i] = rnd.nextFloat(1, 100);
                    }
                    for (int i = 0; i < matrizTipoInt.length; i++) {
                        matrizTipoInt[i] = rnd.nextInt(1, 100);
                    }
                    System.out.println("La media de matriz de float es : " + MTDNumeros.CalculaMedia(matrizTipoFloat));
                    System.out.println("La media de matriz de int es : " + MTDNumeros.CalculaMedia(matrizTipoInt));

                    //endregion
                    break;
                case 6:
                    //region Redondear valaaron array enteros
                    float valoresfloat[] = {1.22f, 2.6f, 5.44f, 4.77f};

                    System.out.println("Valores antes redondear : ");
                    System.out.println(Arrays.toString(valoresfloat));

                    var redondearArriba = MTDNumeros.RedondearValores(valoresfloat, false);
                    System.out.println("Valores redondeados por arriba : ");
                    System.out.println(Arrays.toString(redondearArriba));

                    var redondearAbajo = MTDNumeros.RedondearValores(valoresfloat, true);
                    System.out.println("Valores redondeados por arriba : ");
                    System.out.println(Arrays.toString(redondearAbajo));

                    //endregion
                    break;
                case 7:
                    //region Modificar posiciones array con expresion (i* j)3 /2*(i + j)
                    double matriz[][] = {{1.4, 3.7, 4.6}, {2.6, 6.8, 3.66}, {6.77, 5.44, 1.55}};

                    double matriz2D [][] = {{1,2},{3,4},{5,6}};

                    System.out.println("Array antes de modificar posiciones ");
                    MTDNumeros.PrintarArray2D(matriz2D);

                    MTDNumeros.ModificarPosicionesArray(matriz2D);
                    System.out.println("Array despues de modificar posiciones");
                    MTDNumeros.PrintarArray2D(matriz2D);

                    System.out.println(Arrays.deepToString(matriz2D) );

                    //endregion
                    break;
                case 8:
                    int array1[][] = {{1, 3, 4}, {2, 6, 3}, {6, 5, 1}};
                    MTDNumeros.CalculaMediaDeFilas(array1);
                    break;
                case 9:
                    //region buscar filas repetidas
                    float valores[][] = {{1.5f, 3.8f, 4.6f},
                            {1.5f, 3.8f, 4.6f},
                            {3.4f, 8.8f, 3.6f}};

                    MTDNumeros.PrintarArray2D(valores);
                    System.out.println("Existen filas repetidas : " + MTDNumeros.BuscarFilasRepetidas(valores));
                    //endregion
                    break;
                case 10 :
                    //region salir del menu
                    System.out.println("Cerrando el programa...");
                    menuActivo = false;
                    //endregion
                    break;
            }
        } while (menuActivo);
    }
}
