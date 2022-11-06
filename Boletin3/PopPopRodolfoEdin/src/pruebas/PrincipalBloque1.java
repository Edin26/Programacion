package pruebas;

import bloqueEjercicios1.MTDNumeros;

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

            try {
                opcionElejida = entrada.nextInt();
            }catch (Exception e){
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
                        System.out.println("El numero es perfecto ? "+ MTDNumeros.NumeroPerfecto(numero));
                    }
                    //endregion
                    break;
                case 2:
                    int num1,num2,num3=0;
                    System.out.println("Ingresa el primer numero : ");
                    num1 = entrada.nextInt();
                    System.out.println("Ingresa el segundo numero : ");
                    num2 = entrada.nextInt();
                    System.out.println("Ingresa el tercer numero : ");
                    num3 = entrada.nextInt();

                    System.out.println("Resultado : "+MTDNumeros.MinimoComunMultiplo(num1,num2,num3));


                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    break;
                case 6:
                    break;

            }

        } while (menuActivo);


    }

}
