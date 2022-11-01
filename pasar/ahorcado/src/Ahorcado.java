import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) {

        int categoriaElegida =0;
        boolean categoriaOK = false;
        String categoria [] = {"","Frutas","Animales","Paises","Objetos"};
        String frutas [] = {"MELON","PAPAYA","SANDIA","MANZANA","PERA","NARANJA","UVA","CEREZA"};
        String animales[] = {"PERRO","GATO","GALLINA","CABALLO","MONO","VACA","TORTUGA","CONEJO"};
        String Paises [] = {"ESPAÑA","PERU","GUATEMALA","ARGENTINA","BRAZIL","ALEMANIA","MEXICO","ITALIA"};
        String objetos [] ={"MOCHILA","RELOJ","TELEFONO","MUEBLE","SILLA","MESA","PUERTA","VENTANA"};

        Random rnd = new Random();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Juego ahorcado");
        for (int i=1; i<categoria.length;i++){
            //System.out.println(i+"."+categoria[i]);
        }
        System.out.println("Selecciona la categoria : ");
        //categoriaElegida = entrada.nextInt();

        if (categoriaElegida>0 && categoriaElegida <= 4){
            categoriaOK = true;
        }
        if (categoriaOK){
            switch (categoriaElegida)   {

                case 1:
            }
        }
        int seleccionCatergia = rnd.nextInt(0,7);
        var selecionada = frutas[seleccionCatergia];
        var longitudPalabra = selecionada.length();
        int intentos = longitudPalabra +2;
        String a = "CABEZA UVA, COMPUTADORA";
        int longitudMuñeco = 6;

        System.out.println("|__________|");
        System.out.println("     |       ");
        System.out.println("     0       ");
        System.out.println("   / | \\    ");
        System.out.println("    / \\     ");

        for (int i = 0; i<=6; i++ ){
            //System.out.println("|");
        }
        //System.out.print(" _______________");

    }


}
