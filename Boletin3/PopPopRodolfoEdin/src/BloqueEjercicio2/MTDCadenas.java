package BloqueEjercicio2;

public class MTDCadenas {
    public static void OpcionesMenu(){
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

        var dniValido = validaDNI(numeroDNI);

        if (dniValido) {
            var numero = Integer.parseInt(numeroDNI);
            var resto = numero % 23;

            letraDNI = letrasDNI[resto];
        } else {
            letraDNI = ' ';
        }
        return letraDNI;
    }

    public static String ConstruirTextoConGuiones(String texto, Character caracter) {
        String textoConGuiones = "";

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

        for (int i = 0; i < texto.length(); i++) {
            var caracterTexto = texto.charAt(i);
            //Construir texto con guiones y caracter introducido por usuario

            caracterIgual = false;
            for (int j = 0; j < caracter.length; j++) {
                if (caracterTexto == caracter[j]) {
                    textoConGuiones += caracter[j];
                    caracterIgual = true;
                    break;
                }
            }
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

                if (Character.isDigit(caracter)) {
                    digito = true;
                }
                if (Character.isLetter(caracter)) {
                    if (Character.isUpperCase(caracter)) {
                        mayuscula = true;
                    } else {
                        miniscula = true;
                    }
                }
            }
        }
        if (mayuscula && miniscula && digito) {
            return true;
        } else
            return false;
    }

}
