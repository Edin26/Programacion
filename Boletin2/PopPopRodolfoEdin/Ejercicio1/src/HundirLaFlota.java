import java.util.Random;
import java.util.Scanner;

public class HundirLaFlota {

    public static void main(String[] args) {

        int matriz[][] = new int[8][8];
        String filas[] = {"0","1", "2", "3", "4", "5", "6", "7"};
        int filaSeleccionada = 0;
        int columnaSeleccionada = 0;
        int barcosSinHundir = 10;
        final int BarcoOk = 1;
        final int BarcoHundido = 2;
        final int Agua = 3;
        boolean coordenadasValidas ;
        Random rnd = new Random();
        //Generar posiciones de los barcos
        for (int i = 0; i < 10; i++) {
            int posicionFila = rnd.nextInt(1, 8);
            int posicionColumna = rnd.nextInt(1, 8);
            matriz[posicionFila][posicionColumna] = 1;
        }
        boolean juegoActivo = true;

        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("   0  1  2  3  4  5  6  7");
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(filas[i] + "| ");
                for (int j = 0; j < matriz.length; j++) {
                    if (matriz[i][j] == 0 || matriz[i][j] == BarcoOk) {
                        System.out.print("-  ");
                    } else if (matriz[i][j] == BarcoHundido) {
                        System.out.print("B  ");
                    } else if (matriz[i][j] == Agua) {
                        System.out.print("x  ");
                    }
                }
                System.out.println("|");
            }
            System.out.println();
            System.out.println("==========| Barcos activos : "+ barcosSinHundir + " |==========");

            coordenadasValidas =true;
            System.out.println("Selecciona una fila : ");
            filaSeleccionada = entrada.nextInt();
            System.out.println("Selecciona una columna : ");
            columnaSeleccionada = entrada.nextInt();

            //Verificar que la fila o columna seleccionada entre en el rango permitido
            if (columnaSeleccionada > 7 || filaSeleccionada >7 ){
                System.out.println("Coordenadas no validas ");
                filaSeleccionada=0;
                columnaSeleccionada=0;
                coordenadasValidas = false;
            }

            if (coordenadasValidas) {
                //Columna ya seleccionada
                if (matriz[filaSeleccionada][columnaSeleccionada] == Agua) {
                    //si no hay barco cambio el valor del array en la posicion del barco para poder diferenciar
                    System.out.println("==========| Coordenadas ya seleccionadas |==========");
                }
                //Comprobar si hay barco en posicion seleccionada
                else if (matriz[filaSeleccionada][columnaSeleccionada] == BarcoOk) {
                    //si hay barco cambio el valor del array en la posicion del barco para poder diferenciar de barco ya hundido
                    matriz[filaSeleccionada][columnaSeleccionada] = BarcoHundido;
                    System.out.println("==========| Has hundido un barco |==========");
                    barcosSinHundir--;
                    //marcar posiciones ya seleccionadas
                } else if (matriz[filaSeleccionada][columnaSeleccionada] == 0) {
                    //si no hay barco cambio el valor del array en la posicion del barco para poder diferenciar
                    System.out.println("==========| Has encontrado agua |==========");
                    matriz[filaSeleccionada][columnaSeleccionada] = Agua;
                    System.out.println();
                }
            }
        } while (juegoActivo);

    }
}
