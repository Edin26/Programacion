package bloqueEjercicios1;

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

        do{
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
            //comprobar que todos los valores array son positivos
/*            for (var valor : array) {
                if (valor < 0) {

                }
            }*/
        }
        while (!completado);
    }
    public static float CalculaMedia(float matriz[]) {
        float media = 0;
        float suma = 0;

        for (var valor : matriz) {
            suma += valor;
        }
        media = (float) (suma / matriz.length);
        media = (float) (Math.round(media * 100d) / 100d);
        return media;
    }
    public static float CalculaMedia(int matriz[]) {
        float media = 0;
        float suma = 0;

        for (var valor : matriz) {
            suma += valor;
        }
        media = (float) (suma / matriz.length);
        media = (float) (Math.round(media * 100d) / 100d);
        return media;

    }



}
