import java.util.Scanner;

public class Menor4Numeros {

    int numeros [] = new int [4];
    int numeroMenor ;

    Scanner entrada = new Scanner(System.in);

    public void Ejecutar(){
        IngresarNumeros();
        CalculaNumeroMenor();
    }

    public void IngresarNumeros() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el valor de a : ");

        for (int i = 0; i<numeros.length;i++){
            System.out.println("Introduzca un numero : ");
            numeros[i] = entrada.nextInt();
        }

    }
    public void CalculaNumeroMenor() {

        numeroMenor= numeros[0];

        for (int i = 0; i<numeros.length;i++){
            if(numeroMenor > numeros[i]){
                numeroMenor =  numeros[i];
            }
        }
        System.out.println("El numero menor de los numeros ingresados es : "+ numeroMenor);

    }



}
