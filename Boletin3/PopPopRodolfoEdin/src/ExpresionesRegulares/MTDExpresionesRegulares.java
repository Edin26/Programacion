package ExpresionesRegulares;

public class MTDExpresionesRegulares {

    public static void OpcionesMenu(){
        System.out.println();
        System.out.println("1. Valida que un String tenga el formato AAA99.");
        System.out.println("2. Valida un dirección de correo electrónico.");
        System.out.println("3. Comprueba que el String  tiene sólo como caracteres a,b o c.");
        System.out.println("4. Comprueba que el String que recibe empieza por dígito y después contiene al menos 5 caracteres alfabéticos.");
        System.out.println("5. Salir del menu.");
    }
    public static boolean ValidarFormato(String texto) {
        return texto.matches("^[A-Z]{3}[0-9]{2}$");
    }
    public static boolean ValidarCorreo(String email) {
        return email.matches("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    }
    public static boolean ValidaTextoabc(String texto) {
        return texto.matches("^[a]||[b]||[c]$");
    }

    public static boolean ValidaTextoPorDigito(String texto) {
        return texto.matches("^[0-9][a-z]{5,}$");
    }


}
