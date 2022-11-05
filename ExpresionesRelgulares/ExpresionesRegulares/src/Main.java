import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {





    public static void main(String[] args) {


/*        System.out.println("12345678F "+validaDNI("12345678F"));

        System.out.println("Manuel Fernando : "+validarNombre("Manuel Fernando"));

        System.out.println("-100: " + validarNumeroEntero("-100"));

        System.out.println("100: " + validarNumeroEnteroPositivo("100"));

        System.out.println("-100: " + validarNumeroEnteroNegativo("-100"));

        System.out.println(validarBinario("1010101010a10"));

        System.out.println(validarOctal("78"));

        System.out.println(validarHexadecimal("00FF11"));

        System.out.println(validarRealNegativo("-5"));

        System.out.println(validarReal("-5_5",1));

         System.out.println(validarMatricula("1234ABC"));
        */




    }


    public static  boolean validaDNI(String DNI){

        return DNI.matches("^[0-9]{7,8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");
    }
    public static  boolean validarNombre( String nombre){
        return nombre.matches("^([A-Z]{1}[a-z]+[ ]?){1,2}$");
    }
    public static boolean validarNumeroEntero(String texto){
        return texto.matches("^-?[0-9]+$");
    }
    public static boolean validarNumeroEnteroPositivo (String texto){
        return texto.matches("^[0-9]+$");
    }
    public static boolean validarNumeroEnteroNegativo (String texto){
        return texto.matches("^-[0-9]+$");
    }

    public static boolean validarBinario(String binario){
        return binario.matches("^[0-1]+$");
    }
    public static boolean validarOctal(String octal){
        return octal.matches("^[0-7]+$");
    }
    public  static boolean validarHexadecimal ( String hexadecimal){
        return hexadecimal.matches("^[0-9A-F]+$");
    }
    public static boolean validarReal(String texto){
        return texto.matches("^-?[0-9]+([\\.,][0-9]+)?$");
    }
    public static boolean validarRealPositivo(String texto){
        return texto.matches("^[0-9]+([\\.,][0-9]+)?$");
    }
    public static boolean validarRealNegativo(String texto){
        return texto.matches("^-[0-9]+([\\.,][0-9]+)?$");
    }
    public  static boolean validarReal(String texto , int numDecimales) {
        if (numDecimales > 0) {
            return texto.matches("^-?[0-9]+([\\.,][0-9]{1," + numDecimales + "})?$");
        }
        else {
            return false;
        }
    }

    public static boolean validarMatricula(String texto){
        return texto.matches("^[0-9]{4}[A-Z]{3}$");
    }

    public static boolean validarFecha(String texto){
        return texto.matches("^$");
    }
}