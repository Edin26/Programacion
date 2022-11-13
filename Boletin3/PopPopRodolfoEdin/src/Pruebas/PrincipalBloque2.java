package Pruebas;

import BloqueEjercicio2.MTDCadenas;
import BloqueEjercicios1.MTDNumeros;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PrincipalBloque2 {

    public static void main(String[] args) {

        boolean menuActivo = true;
        int opcionElejida = 0;


        do {
            Scanner entrada = new Scanner(System.in);
            //opciones menu
            MTDCadenas.OpcionesMenu();

            try {
                opcionElejida = entrada.nextInt();
            } catch (Exception e) {
                System.out.println("Opcion no valida.");
            }
            entrada.nextLine();
            switch (opcionElejida) {
                case 1:
                    //region Calcula letra del dni
                    String numeroDNI;
                    System.out.println("Introduce tu DNI sin Letra ");
                    numeroDNI = entrada.nextLine();
                    System.out.println("El la letra del dni es : "+ MTDCadenas.CalculaLetraDNI(numeroDNI));

                    //endregion
                    break;
                case 2:
                    //region construye texto con guiones con 1 caracter
                    String texto = "montecastelo";
                    var textoConGuiones = MTDCadenas.ConstruirTextoConGuiones(texto,'o');
                    System.out.println("El texto es : "+ textoConGuiones);
                    //endregion
                    break;
                case 3:
                    //region construye texto con guiones con n caracteres
                    String texto1 = "montecastelo";
                    var textoConGuiones1 = MTDCadenas.ConstruirTextoConGuiones(texto1,'m','n','o','e','t');

                    System.out.println("El texto es : "+ textoConGuiones1);
                    //endregion
                    break;
                case 4:
                    //region Validar un texto
                    System.out.println("Ingresa el texto a validar : ");
                    String textoAValidar = entrada.nextLine();
                    System.out.println("El texto es valido ? "+ MTDCadenas.ValidarTexto(textoAValidar));
                    //endregion
                    break;
                case 5:
                    //region Codificar un texto
                    String textoSinCodificar= "Pocholito nena";
                    System.out.println(textoSinCodificar);
                    MTDCadenas.CodificarUnTexto(textoSinCodificar);

                 //  System.out.println(textoSinCodificar);


                    //endregion
                    break;
                case 6 :
                    //salir del menu
                    System.out.println("Cerrando el programa...");
                    menuActivo = false;
                    //endregion
                    break;
            }
        } while (menuActivo);

    }

}
