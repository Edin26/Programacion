package pruebas;

import bloqueEjercicios1.MTDNumeros;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


//import static bloqueEjercicios1.MTDNumeros.NumeroPerfecto;


public class PrincipalBloque1 {

    public static void main(String[] args) {
        boolean menuActivo = true;
        int opcionElejida = 0;


        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println();
            System.out.println("1. Numero perfecto. ");
            System.out.println("2. Minimo comun multiplo. ");
            System.out.println("3. Resistencia equivalente. ");
            System.out.println("4. Modifica todas aquellas posiciones que almacenan un número negativo ");
            System.out.println("5. Calcula la media de una matriz.");

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
                    float r1=5;
                    float r2=30;
                    System.out.println("Resistencia equivalente : "+MTDNumeros.CalculaResistenciaEquivalente(r1,r2)+" Ohmnios.");
                    System.out.println("Resistencia equivalente : "+ MTDNumeros.CalculaResistenciaEquivalente(r1,r2,1)+" microOhmnios.");
                    System.out.println("Resistencia equivalente : "+MTDNumeros.CalculaResistenciaEquivalente(r1,r2,2)+" KiloOhmnios.");
                    //endregion
                    break;
                case 4:
                    int [] array = {100,3,9,-8,4,-90,-7};
                    System.out.println("Array antes de llamar metodo modificar posiciones negativas ");
                    System.out.println(Arrays.toString(array));
                    MTDNumeros.AlmacenarMediaPositivos(array);
                    System.out.println("Array antes de llamar metodo modificar posiciones negativas ");
                    System.out.println(Arrays.toString(array));
                    break;
                case 5:
                    //region Calcula media
                    Random rnd = new Random();
                    float matrizTipoFloat []= new float[10];
                    int matrizTipoInt []= new int[10];

                    for (int i =0; i<matrizTipoFloat.length;i++){
                        matrizTipoFloat[i] = rnd.nextFloat(1,100);
                    }
                    for (int i =0; i<matrizTipoInt.length;i++){
                        matrizTipoInt[i] = rnd.nextInt(1,100);
                    }
                    System.out.println("La media de matriz de float es : "+ MTDNumeros.CalculaMedia(matrizTipoFloat) );
                    System.out.println("La media de matriz de int es : "+ MTDNumeros.CalculaMedia(matrizTipoInt) );



                    //endregion
                    break;
                case 6:
                    break;

            }

        } while (menuActivo);


    }

}
