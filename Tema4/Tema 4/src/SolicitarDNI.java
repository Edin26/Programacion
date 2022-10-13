import java.util.Scanner;

public class SolicitarDNI {
    public String DNI = null;

    public void Ejecutar() {
        IngresarDatos();
        if (VerificaSinxtaxisDNI(DNI)) {
            System.out.println("Sintaxis del DNI Correcta");
        } else {
            System.out.println("Sintaxis del DNI no es valida");
        }
    }
    public void IngresarDatos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el numero de DNI con letra : ");
        DNI = entrada.next();
    }
    public boolean VerificaSinxtaxisDNI(String DNI) {
        var cantidadDigitosDNI = DNI.length() - 1;
        var letraDNI = DNI.charAt(DNI.length() - 1);
        boolean letraCorrecta = VefiricarSiElCaracterEsLetra(letraDNI);

        if (letraCorrecta && cantidadDigitosDNI == 8) {
            return true;
        } else {
            return false;
        }
    }
    public boolean VefiricarSiElCaracterEsLetra(char letra) {
        var resultado = Character.isLetter(letra);
        if (resultado) {
            return true;
        } else {
            return false;
        }
    }

}
