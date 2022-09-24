import java.util.Scanner;

public class CalculaLetraDNI {

    public int _numeroDNI = 0;
    private boolean _longitudDniCorrecta = false;
    private char[] LetraDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P',
            'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public void IngresaValores() {
        var entrada = new Scanner(System.in);
        do {
            System.out.println("Introduce tu DNI sin Letra ");
            _numeroDNI = entrada.nextInt();
            _longitudDniCorrecta = LogitudDNICorrecta(_numeroDNI);

        } while (!_longitudDniCorrecta);
    }
    public boolean LogitudDNICorrecta(int numeroDNI) {

        int numDigits = String.valueOf(numeroDNI).length();
        if (numDigits == 8) {
            return true;
        }
        else
        {
            System.out.println("La longitud del DNI debe ser de 8 cifras");
            return false;
        }
    }
    public void CalculaLetraDNI() {

        var resto = _numeroDNI % 23;

        System.out.println("La letra del DNI es " + LetraDNI[resto]);
    }

}


