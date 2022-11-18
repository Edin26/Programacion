package Pruebas;

import BloqueEjercicio2.MTDCadenas;
import ExpresionesRegulares.MTDExpresionesRegulares;

import java.util.Scanner;

public class PrincipalBloque3 {

    public static void main(String[] args) {

        boolean menuActivo = true;
        int opcionElejida = 0;


        do {
            Scanner entrada = new Scanner(System.in);
            //opciones menu
            MTDExpresionesRegulares.OpcionesMenu();

            try {
                opcionElejida = entrada.nextInt();
            } catch (Exception e) {
                System.out.println("Opcion no valida.");
            }
            entrada.nextLine();
            switch (opcionElejida) {
                case 1:
                    System.out.println("Ingresa la frase :");
                    String frase = entrada.nextLine();
                    System.out.println("Frase cumple con el formato ? "+ MTDExpresionesRegulares.ValidarFormato(frase));
                    break;
                case 2:
                    System.out.println("Ingresa la dirección de correo electrónico :");
                    String email = entrada.nextLine();
                    System.out.println("Correo es valido ? "+ MTDExpresionesRegulares.ValidarCorreo(email));
                    break;
                case 3:
                    System.out.println("Ingresa la frase :");
                    String fraseCaracteresabc = entrada.nextLine();
                    System.out.println("Frase cumple con el formato ? "+ MTDExpresionesRegulares.ValidaTextoabc(fraseCaracteresabc));

                    break;
                case 4:
                    System.out.println("Ingresa la frase :");
                    String fraseConDigitoYLetras = entrada.nextLine();
                    System.out.println("Frase cumple con el formato ? "+ MTDExpresionesRegulares.ValidaTextoPorDigito(fraseConDigitoYLetras));

                    break;
                case 5 :
                    //salir del menu
                    System.out.println("Cerrando el programa...");
                    menuActivo = false;
                    //endregion
                    break;
            }
        } while (menuActivo);

    }

}
