import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class Ejecicio1 {

    public static void main(String[] args) {

    //matriz de 10 enteros
    int arrayEnteros [] = new int[10];
    int copiaArray [] ;

    //Posicion 0 del array, numero aleatorio
        Random numeroRandom = new Random();
        arrayEnteros[0] = numeroRandom.nextInt(10);

    // Posicion 1 del array le sumo 20 a posicion 0;
        arrayEnteros[1] = arrayEnteros[0] + 20;

    // Posicion 2 del array formula
        arrayEnteros[2] = (int) Math.sqrt( ( Math.pow(arrayEnteros[0],3) + Math.pow(arrayEnteros[1],2)));

    // Posicion 3 la media de posicion 0,1,2
        arrayEnteros[3] = (int)(arrayEnteros[0]+arrayEnteros[1]+arrayEnteros[2])/3;

    // Posicion 4 solicitar valor a usuario
        arrayEnteros[4] = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un valor entero :"));

    // valor array posicion 5-10
        arrayEnteros[5] = numeroRandom.nextInt(10);
        arrayEnteros[6] = numeroRandom.nextInt(10);
        arrayEnteros[7] = numeroRandom.nextInt(10);
        arrayEnteros[8] = numeroRandom.nextInt(10);
        arrayEnteros[9] = numeroRandom.nextInt(10);

        //Copiar array en nuevo array
        copiaArray = Arrays.copyOf(arrayEnteros,arrayEnteros.length);

        //ordenar copia array de menor a mayor
        Arrays.sort(copiaArray);

        //Buscar valor autogenerado en 2 array
        int valorABuscar = arrayEnteros[0];
        var posicionArray = Arrays.binarySearch(arrayEnteros,valorABuscar);
        var posicionCopiaArray = Arrays.binarySearch(copiaArray,valorABuscar);
        System.out.println("La posicion del valor autogenerado en el array es : " + posicionArray );
        System.out.println("La posicion del valor autogenerado en la copia array es : " + posicionCopiaArray );

        //Comparar si ambos arrays son iguales
        boolean resultadoComparacion = arrayEnteros.equals(copiaArray);
        System.out.println("Son iguales ambos arrays ? "+resultadoComparacion);

        //Motrar por consola los arrays
        System.out.println(Arrays.toString(arrayEnteros));
        System.out.println(Arrays.toString(copiaArray));

    }
}
