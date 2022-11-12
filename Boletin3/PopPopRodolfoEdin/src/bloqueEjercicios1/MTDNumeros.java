package bloqueEjercicios1;

import java.text.DecimalFormat;

public class MTDNumeros {

    public static boolean NumeroPerfecto(int numero) {
        double suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        if (suma == numero) {
            return true;
        } else {
            return false;
        }
    }

    public static int MinimoComunMultiplo(int num1, int num2, int num3) {
        boolean encontrado = false;
        int mcm = 0;
        //Asignarle el maximo de los 3 numeros
        mcm = Math.max(Math.max(num1, num2), num3);

        do {
            if (mcm % num1 == 0 && mcm % num2 == 0 && mcm % num3 == 0) {
                encontrado = true;
                break;
            }
            mcm++;

        } while (!encontrado);
        return mcm;
    }

    public static float CalculaResistenciaEquivalente(float r1, float r2, int... unidades) {
        float resistenciaEquivalente = 0;
        int unidad = 0;
        //comprobar si el parametro opcional no esta vacio
        if (unidades.length > 0) {
            unidad = unidades[0];
        }
        //Calculo resistencia equivalente
        resistenciaEquivalente = (r1 * r2) / (r1 + r2);

        //si se le pasa parametro opcional
        if (unidad != 0) {
            switch (unidad) {
                case 1:
                    //Si unidades vale 1 : En microOhmnios (10'6 ohmnios)
                    resistenciaEquivalente = resistenciaEquivalente * 1000000;
                    break;
                case 2:
                    //Si unidades vale 2: En Kiloohmnios (10-3 ohmnios)
                    resistenciaEquivalente = (float) (resistenciaEquivalente * 0.001);
                    break;
            }
        }
        return resistenciaEquivalente;
    }

    public static void AlmacenarMediaPositivos(int[] array) {
        double mediaPositivos = 0;
        boolean completado = false;

        do {
            completado = true;
            int contadorPositivos = 0;
            double suma = 0;
            //Calcula la media de positivos
            for (var valor : array) {
                if (valor > 0) {
                    suma += valor;
                    contadorPositivos++;
                }
            }
            mediaPositivos = suma / contadorPositivos;
            //Buscar negativos
            for (int j = 0; j < array.length; j++) {
                if (array[j] < 0) {
                    array[j] = (int) Math.ceil(mediaPositivos);
                    completado = false;
                    break;
                }
            }
        }
        while (!completado);
    }

    public static float CalculaMedia(float array[]) {
        float media = 0;
        float suma = 0;

        for (var valor : array) {
            suma += valor;
        }

        DecimalFormat formato = new DecimalFormat("#.00");

        media = (float) (suma / array.length);

        media = (float) (Math.round(media * 100d) / 100d);

        return media;
    }

    public static float CalculaMedia(int array[]) {
        float media = 0;
        float suma = 0;

        for (var valor : array) {
            suma += valor;
        }
        media = (float) (suma / array.length);
        media = (float) (Math.round(media * 100d) / 100d);
        return media;

    }

    public static int[] RedondearValores(float array[], boolean redondear) {
        int arrarEnteros[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            //almacenar valores en array enteros
            if (redondear) {
                // valores de la original redondeados al entero más cercano por debajo
                arrarEnteros[i] = (int) Math.floor(array[i]);
            } else {
                //redondeados al entero más cercano por arriba
                arrarEnteros[i] = (int) Math.ceil(array[i]);
            }
        }
        return arrarEnteros;
    }

    public static void ModificarPosicionesArray(double array[][]) {
        // valor = (i* j)3 /2*(i + j)
        // Siendo i el índice de fila y j el índice de columna. Si i y j son cero no se modifica el valor original.

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (j > 0 || i > 0) {
                    var primerOperando = Math.pow((i * j), 3);
                    var segundoOperando = 2 * (i + j);
                    array[i][j] = (double) (Math.round((double) (primerOperando / segundoOperando) * 10d) / 10d);
                }
            }
        }
    }
    public static void CalculaMediaDeFilas(int [] [] array){
        int contadorFila=0;
        int filaAlta=0;
        float mediaFilaMasAlta=0;
        for (var fila: array) {
                //calcula la media de la fila
                var mediaFila = MTDNumeros.CalculaMedia(fila);
                //mostrar por consolta la media de la fila
                System.out.println("La media de la fila : "+ contadorFila + " es "+mediaFila);
                //alamacenar la fila con media mas alta
                if (mediaFila > mediaFilaMasAlta){
                    mediaFilaMasAlta = mediaFila;
                    filaAlta = contadorFila;
                }
                contadorFila++;
        }
        System.out.println("La fila con la media mas alta es :"+filaAlta);
    }
    public static boolean BuscarFilasRepetidas( float [][] array ){

        boolean filaRepetidaEncontrada = false;

        for (var filaAComprobar: array ) {

            for (var filas:array) {
                if(filaAComprobar.equals(filas)){
                    filaRepetidaEncontrada = true;
                }
            }
        }

        return filaRepetidaEncontrada;
    }

    public static void PrintarArray2D (int array [][]){
        for (var fila: array) {
            for (var columna: fila) {
                System.out.print(columna+", ");
            }
            System.out.println();
        }
    }
    public static void PrintarArray2D (double array [][]){
        for (var fila: array) {
            for (var columna: fila) {
                System.out.print(columna+", ");
            }
            System.out.println();
        }
    }
}
