import java.util.Scanner;

public class Cadena {

    String _cadena = null;
    String _palabras[];
    Scanner entrada = new Scanner(System.in);

    public void MetodosCadena() {
        IngresarCadena();
        ContadorPalabras();
        BuscarCaracterEnPalabras();
        PrimerYUltimoCaracter();
        BuscarLetra();
    }

    public void IngresarCadena() {
        System.out.println("Ingrese una frase: ");
        _cadena = entrada.nextLine();
    }

    public void ContadorPalabras() {
        _palabras = _cadena.split(" ");
        var contador = _palabras.length;
        System.out.println("La cadena se compone de " + contador + " palabras.");
    }

    public void BuscarCaracterEnPalabras() {

        for (int i = 0; i < _palabras.length; i++) {
            int posicion = _palabras[i].indexOf('a');
            if (posicion == -1) {
                System.out.printf("El caracter a en la palabra (" + _palabras[i] + ") no existe ");
            } else {
                System.out.printf("El caracter a en la palabra (" + _palabras[i] + ") esta en la posicion :" + posicion);
            }
            System.out.println();
        }
    }

    public void PrimerYUltimoCaracter() {
        for (int i = 0; i < _palabras.length; i++) {
            var primerCaracter = _palabras[i].charAt(0);
            var ultimoCaracter = _palabras[i].charAt(_palabras[i].length() - 1);
            System.out.println("El primer caracter de la palabra (" + _palabras[i] + ") es: " + primerCaracter);
            System.out.println("El ultimo caracter de la palabra (" + _palabras[i] + ") es: " + ultimoCaracter);
        }

    }

    public void BuscarLetra() {
        System.out.println("Escribe una letra a buscar en la frase: " + _cadena);
        var letra = entrada.nextLine();
        var posicionLetra = _cadena.indexOf(letra);
        System.out.println(posicionLetra);
    }
}
