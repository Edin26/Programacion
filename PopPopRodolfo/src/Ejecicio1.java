import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class Ejecicio1 {

    public static void main(String[] args) {

    //matriz de 10 enteros
    int _arrayEnteros [] = new int[10];
    int _copiaArray [] ;

    //Posicion 0 del array, numero aleatorio
        Random numeroRandom = new Random();
        _arrayEnteros[0] = numeroRandom.nextInt(10);

    // Posicion 1 del array le sumo 20 a posicion 0;
        _arrayEnteros[1] = _arrayEnteros[0] + 20;

    // Posicion 2 del array formula
        _arrayEnteros[2] = (int) Math.sqrt( ( Math.pow(_arrayEnteros[0],3) + Math.pow(_arrayEnteros[1],2)));

    // Posicion 3 la media de posicion 0,1,2
        _arrayEnteros[3] = (int)(_arrayEnteros[0]+_arrayEnteros[1]+_arrayEnteros[2])/3;

    // Posicion 4 solicitar valor a usuario
        _arrayEnteros[4] = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un valor entero :"));

    // valor array posicion 5-10
        _arrayEnteros[5] = numeroRandom.nextInt(10);
        _arrayEnteros[6] = numeroRandom.nextInt(10);
        _arrayEnteros[7] = numeroRandom.nextInt(10);
        _arrayEnteros[8] = numeroRandom.nextInt(10);
        _arrayEnteros[9] = numeroRandom.nextInt(10);

        //Copiar array en nuevo array
        _copiaArray = Arrays.copyOf(_arrayEnteros,_arrayEnteros.length);

        //ordenar copia array de menor a mayor
        Arrays.sort(_copiaArray);

        //Buscar valor autogenerado en 2 array
        var valorABuscar = _arrayEnteros[0];
        var posicionArray = Arrays.binarySearch(_arrayEnteros,valorABuscar);
        var posicionCopiaArray = Arrays.binarySearch(_copiaArray,valorABuscar);
        System.out.println("La posicion del valor autogenerado en el array es : " + posicionArray );
        System.out.println("La posicion del valor autogenerado en la copia array es : " + posicionCopiaArray );

        //Comparar si ambos arrays son iguales
        var resultadoComparacion = _arrayEnteros.equals(_copiaArray);
        System.out.println("Son iguales ambos arrays ? "+resultadoComparacion);

        //Motrar por consola los arrays
        System.out.println(Arrays.toString(_arrayEnteros));
        System.out.println(Arrays.toString(_copiaArray));


    }


}
