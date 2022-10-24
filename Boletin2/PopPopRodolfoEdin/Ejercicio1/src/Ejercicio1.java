import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {



    public static void main(String[] args) {

        int [] numerosEnteros = new int[100];
        int numeroUsuario = 0;
        boolean menuActivo;

        // array de 100 números enteros con valores aleatorios entre 0 y 100
        Random rnd = new Random();
        Scanner entrada = new Scanner(System.in);



        for(int i = 0; i < numerosEnteros.length; i++ ){
            numerosEnteros[i] = rnd.nextInt(100);
        }

        //Mostrar valores superiores a uno introducido por el usuario
        System.out.println("Introduce un valor :  ");
        numeroUsuario = entrada.nextInt();
        boolean numerosSuperiores = false;
        System.out.println("Numeros superiores a : "+numeroUsuario);
        for(int i = 0; i<numerosEnteros.length; i++ ){
            if ( numeroUsuario < numerosEnteros[i] ){
                System.out.print(numerosEnteros[i]+", ");
                numerosSuperiores =true;
            }
        }
        if (numerosSuperiores == false){
            System.out.println("No se han encontrado numeros superiores a : "+numeroUsuario);
        }

        System.out.println();

        //Calcular la media de los 50 primeros valores almacenados.
        int sumaNumeros = 0;
        double media= 0.0;
        for (int i=0; i<50 ;i++ ){
            sumaNumeros += numerosEnteros[i];
        }
        media = (double) sumaNumeros/50;
        System.out.println("La media de los 50 primeros nuemros es : "+media);

        //Mostrar por pantalla los 10 primeros valores que sean superiores a 20 junto con las posiciones que ocupan.
        int contadorNumerosMayoresA20 =0;
        System.out.println("Numeros mayores a 20 : ");
        for(int i = 0; i< numerosEnteros.length ; i++){
            if( numerosEnteros[i] > 20 && contadorNumerosMayoresA20 <=10){
                contadorNumerosMayoresA20 += 1;
                System.out.println("Numero : "+ numerosEnteros[i] + " Posicion en array : "+i);
            }
            if(contadorNumerosMayoresA20 > 10){
                break;
            }

        }

        //Mostrar por pantalla el primer valor inferior al introducido por el usuario.
        for( int i = 0; i < numerosEnteros.length; i++ ){
            if( numeroUsuario < numerosEnteros[i] ){
                System.out.println("El primer valor inferior a : "+numeroUsuario + " Es : "+ numerosEnteros[i] );
                break;
            }
        }
        //numeros primos
        //Detectar números primos

        int numero  = 7;

        boolean primo = true;

        for(int i = 2;i<numero;i++) {
            if(numero%i==0) {
                primo = false;
                break;

            }
        }

        if(primo) {
            System.out.print("Número primo");
        }
        else {
            System.out.println("Número no primo");
        }




    }


}
