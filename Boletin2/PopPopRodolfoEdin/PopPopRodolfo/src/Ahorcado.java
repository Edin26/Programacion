import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) {

        int categoriaElegida = 0;
        boolean categoriaOK = false;
        int intentos;
        int posicionPalabra = 0;
        String palabraAleatoria = null;

        Random rnd = new Random();
        Scanner entrada = new Scanner(System.in);
        //region Categoria
        String categoria[] = {"", "Frutas", "Animales", "Paises", "Objetos"};
        String frutas[] = {"MELON", "PAPAYA", "SANDIA", "MANZANA", "PERA", "NARANJA", "UVA", "CEREZA"};
        String animales[] = {"PERRO", "GATO", "GALLINA", "CABALLO", "MONO", "VACA", "TORTUGA", "CONEJO"};
        String paises[] = {"ESPAÑA", "PERU", "GUATEMALA", "ARGENTINA", "BRAZIL", "ALEMANIA", "MEXICO", "ITALIA"};
        String objetos[] = {"MOCHILA", "RELOJ", "TELEFONO", "MUEBLE", "SILLA", "MESA", "PUERTA", "VENTANA"};
        //endregion

        boolean Activo = true;

        do {
            intentos = 6;
            //posicion para seleccionar palabra aleatoria
            posicionPalabra = rnd.nextInt(0, 8);
            System.out.println("==========| AHORCADO |==========");
            //region seleccionar Categoria
            //Mostrar categorias
            System.out.println("CATEGORIAS :");
            for (int i = 1; i < categoria.length; i++) {
                System.out.println(i + "." + categoria[i]);
            }

            System.out.println("Selecciona la categoria : ");
            categoriaElegida = entrada.nextInt();

            if (categoriaElegida > 0 && categoriaElegida <= 4) {
                categoriaOK = true;
            }
            if (categoriaOK) {
                switch (categoriaElegida) {
                    case 1:
                        palabraAleatoria = frutas[posicionPalabra];
                        break;
                    case 2:
                        palabraAleatoria = animales[posicionPalabra];
                        break;
                    case 3:
                        palabraAleatoria = paises[posicionPalabra];
                        break;
                    case 4:

                        palabraAleatoria = objetos[posicionPalabra];
                        break;
                    default:
                        break;
                }
            }
            //endregion

            //longitud de la palabra aleatoria seleccionada
            int longitudPalabraSeleccionada = palabraAleatoria.length();
            //Array tipo char de palabra seleccionada aleatoria
            Character palabraCorrecta[] = new Character[longitudPalabraSeleccionada];
            //Array tipo char de palabra que se esta introduciendo por el usuario
            Character palabraAdivinar[] = new Character[longitudPalabraSeleccionada];

            //Almacenar el caracter '_' n el array de palabra a adivinar
            for (int i = 0; i < palabraAdivinar.length; i++) {
                palabraAdivinar[i] = '_';
            }
            //Mostrar el array de palabra adivinar
            for (var palabra : palabraAdivinar) {
                System.out.print(palabra + "  ");
            }
            //Almaceno en array de tipo char la palabra aleatoria que vamos a adivinar
            for (int i = 0; i < palabraAleatoria.length(); i++) {
                palabraCorrecta[i] = palabraAleatoria.charAt(i);
            }

            boolean juegoActivo = true;
            boolean palabraEncontrada = false;
            boolean NopalabraEncontrada = false;

            //region ADIVINANDO LA PALABRA
            while (juegoActivo) {
                System.out.println("Escribe una letra :                         Intentos : " + intentos);
                var letraUsuario = entrada.next().toUpperCase();
                var letra = letraUsuario.charAt(0) ;
                intentos--;
                System.out.println(letraUsuario.trim());
                //comparar la letra que introduce el usuario con las letras correctas en el array de tipo char
                for (int i = 0; i < palabraCorrecta.length; i++) {
                    if (letra == palabraCorrecta[i] && palabraAdivinar[i] == '_') {
                        palabraAdivinar[i] = letra;
                        intentos++;
                    }
                }
                //Mostrar por pantalla el array de char de palabra adivinar para que el usuario sepa la palabra que esta formando
                for (var palabra : palabraAdivinar) {
                    System.out.print(palabra + "  ");
                }
                //convertir array de char de palabra que esta formando el usuario a String
                String palabraUsuario = "";
                for (var p : palabraAdivinar) {
                    palabraUsuario += p;
                }
                //Comparar si la palabra formada por el usuario concide con la palabra correcta
                if (palabraAleatoria.equals(palabraUsuario)) {
                    palabraEncontrada = true;
                }

                //Sin intentos para continuar
                if (intentos <= 0) {
                    System.out.println();
                    System.out.println("==========|GAME OVER |==========");
                    System.out.println("La palabra era : " + palabraAleatoria);
                    System.out.println("____________");
                    System.out.println("|     |     ");
                    System.out.println("|     0     ");
                    System.out.println("|   / | \\  ");
                    System.out.println("|    / \\   ");
                    NopalabraEncontrada = true;
                }
                //fin del juego  pregunto si quiere volver a jugar o termino el programa
                if (palabraEncontrada) {
                    System.out.println();
                    System.out.println("!FELICIDADES¡ HAS ENCONTRADO LA PALABRA : " + palabraAleatoria);
                }
                if (palabraEncontrada || NopalabraEncontrada) {
                    System.out.println("¿Desea volver a jugar s/n ?");
                    //region salir menu
                    String salirMenu = "";
                    salirMenu = entrada.next().toUpperCase();

                    if (salirMenu.equals("S")) {
                        juegoActivo = false;
                    }
                    if (salirMenu.equals("N")) {
                        System.out.println("Cerrando el juego ...");
                        juegoActivo = false;
                        Activo = false;
                    }
                }
            }
            //endregion
        } while (Activo);
    }
}
