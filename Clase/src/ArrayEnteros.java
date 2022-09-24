import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayEnteros {


    public int _numeros [] = new int [5];
    public int _copia [];

    public void ValoresArray(){

        Random random = new Random();

        for ( int i = 0; i < _numeros.length;i++){
            var rnd = random.nextInt(100);
            _numeros[i] = rnd;
        }
        System.out.println("El primer numero es: "+_numeros[0] );
        System.out.println("El ultimo numero es: "+_numeros[4]);

        _copia = Arrays.copyOf(_numeros,_numeros.length);
        Arrays.sort(_copia);
        System.out.println();

    }

    public void MuestraArrayEnConsola(){

        for (int numero : _numeros ) {
            System.out.print(numero + ", ");
        }
        System.out.println();
        for (int numero : _copia ) {
            System.out.print(numero + ", ");
        }
    }

    public void BuscarPosicionValor(){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un valor a buscar ");
        var valorABuscar = entrada.nextInt();
        var posicion = Arrays.binarySearch(_copia,valorABuscar);

        System.out.println("La posicion es: "+ posicion);

    }




}
