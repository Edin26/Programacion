import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        String emails[] = new String[100];
        boolean menuActivo = false;
        int opcionSeleccionada = 0;

        emails[0] = "edin@gmail.com";
        emails[1] = "jose@hotmail.com";
        emails[2] = "David@yahoo.com";
        emails[3] = "ana@gmail.com";
        emails[4] = "chito@outlook.com";

        menuActivo = true;

        do {
            System.out.println("1.Guardar un correo.");
            System.out.println("2.Buscar un correo.");
            System.out.println("3.Contar correos.");
            System.out.println("4.Porcenje de correos.");
            System.out.println("Selecciona una opcion del menu : ");

            Scanner lector = new Scanner(System.in);
            //region Seleccionar opcion menu
            try {
                opcionSeleccionada = lector.nextInt();
            } catch (Exception e) {
                System.out.println("Para seleccionar una opcion del menu se debe seleccionar los numeros de cada apartado.");
            }
            lector.nextLine();
            //endregion

            switch (opcionSeleccionada) {

                case 1:
                    //region Guardar Correo
                    String emailAGuardar = null;
                    boolean emailValido = false;
                    boolean emailYaExiste = false;

                    //almacenar email usuario
                    System.out.println("Ingresa el email a guardar : ");
                    emailAGuardar = lector.nextLine();
                    //Verificar que email tenga @ y que el punto no sea ultimo caracter
                    var ultimoCaracter = emailAGuardar.charAt(emailAGuardar.length() - 1);
                    for (int i = 0; i < emailAGuardar.length() - 1; i++) {
                        //buscar @
                        if (emailAGuardar.charAt(i) == '@') {
                            emailValido = true;
                        }
                    }
                    //Verificar si el email ya existe
                    for (var email : emails) {
                        if (email != null) {
                            if (email.equals(emailAGuardar)) {
                                emailYaExiste = true;
                            }
                        }
                    }
                    //Almaceno el email valido
                    if (!emailYaExiste) {
                        if (emailAGuardar.indexOf('.') > emailAGuardar.indexOf('@') && ultimoCaracter != '.' && emailValido) {
                            for (int i = 0; i < emails.length; i++) {
                                if (emails[i] == null) {
                                    emails[i] = emailAGuardar;
                                    System.out.println("Email guardado con exito. ");
                                    break;
                                }
                            }
                        } else {
                            System.out.println("El email no tiene la sintaxis correcta no se ha podigo guardar este email : " + emailAGuardar);
                        }
                    }
                    if (emailYaExiste) {
                        System.out.println("El email : " + emailAGuardar + " ya existe. ");
                    }
                    //endregion
                    break;
                case 2:
                    //region Buscar Correo
                    String emailABuscar = null;
                    boolean emailABuscarEncontrado = false;
                    System.out.println("Ingresa el email a buscar : ");
                    emailABuscar = lector.nextLine();
                    for (int i = 0; i < emails.length; i++) {
                        if (emailABuscar.equals(emails[i])) {
                            emailABuscarEncontrado = true;
                            System.out.println("Email : " + emails[i] + " encontrado, su posicion en el array es : " + i);
                            break;
                        }
                    }
                    if (!emailABuscarEncontrado) {
                        System.out.println("No se ha encontrado este email : " + emailABuscar);
                    }
                    //endregion
                    break;
                case 3:
                    //region Contar Correos
                    String dominioEmailAContar = null;
                    int numeroDeCorreos = 0;
                    System.out.println("Ingrese el dominio de email a contar, ejemplo gmail,yahoo, etc.");
                    dominioEmailAContar = lector.nextLine();
                    //Comprobar los dominios existentes en array
                    for (var email : emails) {
                        if (email != null) {
                            int indice = email.indexOf("@");
                            int indice2 = email.indexOf(".");
                            var dominio = email.substring(indice + 1, indice2);
                            if (dominioEmailAContar.equals(dominio)) {
                                numeroDeCorreos++;
                            }
                        }
                    }
                    //si no se encuentran dominios de correo
                    if (numeroDeCorreos == 0) {
                        System.out.println("No se han encontrado correos con este dominio");
                    } // dominios de correo encontrado
                    else if (numeroDeCorreos > 0) {
                        System.out.println("Se han encontrado : " + numeroDeCorreos + ", con dominio : " + dominioEmailAContar);
                    }
                    //endregion
                    break;
                case 4:
                    //region Mostrar el porcentaje de correos de cada uno de los 3 dominios : gmail, hotmail o outlook y yahoo.
                    int contadorGmail = 0;
                    int contadorHotmailyOutlook = 0;
                    int contadorYahoo = 0;
                    int contadorCorreosTotal=0;
                    //Comprobar los dominios existentes en array
                    for (var email : emails) {
                        if (email != null) {
                            //buscar dominio del email
                            int indice = email.indexOf("@");
                            int indice2 = email.indexOf(".");
                            var dominio = email.substring(indice + 1, indice2);
                            contadorCorreosTotal++;
                            //contar distintos tipos de dominio email
                            switch (dominio) {
                                case "gmail":
                                    contadorGmail++;
                                    break;
                                case "hotmail":
                                    contadorHotmailyOutlook++;
                                    break;
                                case "outlook":
                                    contadorHotmailyOutlook++;
                                    break;
                                case "yahoo":
                                    contadorYahoo++;
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                    //Calcula porcentaje de correos
                    double porcentajeGmail = ((double) contadorGmail / contadorCorreosTotal) * 100;
                    double porcentajeHotmailYOutlook = ((double) contadorHotmailyOutlook / contadorCorreosTotal) * 100;
                    double porcentajeYahoo = ((double) contadorYahoo / contadorCorreosTotal) * 100;
                    System.out.println("El porcentaje de correos gmail es : " + porcentajeGmail + "%");
                    System.out.println("El porcentaje de correos hotmail y Outlook es : " + porcentajeHotmailYOutlook + "%");
                    System.out.println("El porcentaje de correos yahoo es : " + porcentajeYahoo + "%");
                    //endregion
                    break;
                default:
                    break;
            }
            //region salir menu
            System.out.println();
            String salirMenu = "";
            if (opcionSeleccionada != 8) {
                System.out.println("Desea continuar ? S/N ");
                salirMenu = lector.next().toUpperCase();
            }
            if (salirMenu.equals("N") || opcionSeleccionada == 8) {
                System.out.println("Saliendo del programa ...");
                menuActivo = false;
            }
            opcionSeleccionada = 0;

            //endregion
        } while (menuActivo);
    }
}
