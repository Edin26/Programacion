import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        String frase = null;
        int numeroPalabras = 0;

        //Usamos la clase scanner para que el usuario pueda escribir por consola
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriba una frase : ");
        //Almacenar la frase del usuario
        frase = lector.nextLine();

        //Numero de palabras introducidas en frase del usuario
        String arrayPalabras [] = frase.split(" ");
        numeroPalabras = arrayPalabras.length;
        System.out.println("El numero de palabras introducidas es : " + numeroPalabras );

        //Numero de palabras sin espacios
        int numeroCaracteresSinEspacio = frase.replace(" ","").length();
        System.out.println("Numero de caracteres no espaciados : "+numeroCaracteresSinEspacio);

        //guardo el primer caracter de la frase
        char primerCaracter = frase.charAt(0);

        //devolver true si el primer caracter es digito
        boolean esDigito = Character.isDigit(primerCaracter);
        System.out.println("Es digito el primer caracter de la frase ? " + esDigito );

        //posicion del primer espacio
        int posicionPrimerEspacio = frase.indexOf(" ");
        System.out.printf("La posicion del primer espacio es %d:",posicionPrimerEspacio);


    }

}
