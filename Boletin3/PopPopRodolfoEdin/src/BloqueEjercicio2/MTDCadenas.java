package BloqueEjercicio2;

import java.util.Arrays;

public class MTDCadenas {
    public static void OpcionesMenu() {
        System.out.println();
        System.out.println("1. Calcula la letra del dni. ");
        System.out.println("2. Construir texto con guiones pasandole un caracter. ");
        System.out.println("3. Construir texto con guiones pasandole n caracteres. ");
        System.out.println("4. Validar si el texto contiene una mayuscula,minuscula,digito y longitud mayor igual que 8.");
        System.out.println("5. Codificar un texto.");
        System.out.println("6. Cerrar el programa ");
    }
    public static boolean validaDNI(String DNI) {
        return DNI.matches("^[0-9]{8}$");
    }

    public static Character CalculaLetraDNI(String numeroDNI) {
        final char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P',
                'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        Character letraDNI;
        //llamar metodo para saver si numero dni es valido
        var dniValido = validaDNI(numeroDNI);

        if (dniValido) {
            //almacenar numero dni
            var numero = Integer.parseInt(numeroDNI);
            var resto = numero % 23;
            //Calcula letra dni
            letraDNI = letrasDNI[resto];
        } else {
            letraDNI = ' ';
        }
        return letraDNI;
    }

    public static String ConstruirTextoConGuiones(String texto, Character caracter) {
        String textoConGuiones = "";
        //recorrer texto
        for (int i = 0; i < texto.length(); i++) {
            var caracterTexto = texto.charAt(i);
            //Construir texto con guiones y caracter introducido por usuario
            if (caracterTexto != caracter) {
                textoConGuiones += '-';
            } else if (caracterTexto == caracter) {
                textoConGuiones += caracter;
            }
        }
        return textoConGuiones;
    }

    public static String ConstruirTextoConGuiones(String texto, Character... caracter) {
        String textoConGuiones = "";
        boolean caracterIgual = false;
        //recorrer el texto
        for (int i = 0; i < texto.length(); i++) {
            var caracterTexto = texto.charAt(i);
            //Construir texto con guiones y caracter introducido por usuario
            caracterIgual = false;
            //buscar si el caracter coincide con alguno de los caracteres introducidos
            for (int j = 0; j < caracter.length; j++) {
                if (caracterTexto == caracter[j]) {
                    textoConGuiones += caracter[j];
                    caracterIgual = true;
                    break;
                }
            }
            //guardo un guion si no encontre caracter igual a los caracteres introducidos
            if (!caracterIgual) {
                textoConGuiones += '-';
            }
        }
        return textoConGuiones;
    }

    public static boolean ValidarTexto(String texto) {
        boolean mayuscula = false;
        boolean miniscula = false;
        boolean digito = false;

        if (texto.length() >= 8) {
            for (int i = 0; i < texto.length(); i++) {
                var caracter = texto.charAt(i);
            //comprobar si caracter es digito
                if (Character.isDigit(caracter)) {
                    digito = true;
                }
                //si el caracter el una letra
                if (Character.isLetter(caracter)) {
                    //comprueba caracter es mayuscula
                    if (Character.isUpperCase(caracter)) {
                        mayuscula = true;
                    } else {
                        miniscula = true;
                    }
                }
            }
        }
        //si se cumplen todas las condiciones
        if (mayuscula && miniscula && digito) {
            return true;
        } else
            return false;
    }

    public static void CodificarUnTexto(String texto) {
        //Remplazar texto
        texto = texto.replace('i', '1');
        texto = texto.replace('o', '0');
        texto = texto.replace('a', '*');

        //Separar palabras con caracter espacio
        var arrayPalabras = texto.split(" ");

        String palabrasModificadas[] = new String[arrayPalabras.length];

        for (int i = 0; i < arrayPalabras.length; i++) {
            //Buscar hashcode
            var hashcode = arrayPalabras[i].hashCode();
            //Concatenar con la palabra
            palabrasModificadas[i] = arrayPalabras[i] + hashcode;
            //numero de caracteres despues de modificar en binario
            String numeroCaracteres = Integer.toBinaryString(palabrasModificadas[i].length());
            //Almacenar la palabra antes de concatenar binario
            var temporal = palabrasModificadas[i];
            palabrasModificadas[i] = "";
            //Concatenar palabra modificada con numero de caracteres en binario
            palabrasModificadas[i] = numeroCaracteres + temporal;
        }
        //concatenar array de palabras en string
        String textoModificado = "";
        for (var palabra : palabrasModificadas) {
            textoModificado += palabra + " ";
        }
        //mostrar por consola texto modificado
        System.out.println(textoModificado);
    }
}
