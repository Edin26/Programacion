import java.util.Scanner;

public class NumeroMaxMinDosNumeros {

    public int _numero1;
    public int _numero2;

    public void IngresarValores(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor del primer numero");
        _numero1 = entrada.nextInt();
        System.out.println("Ingrese el valor del segundo numero");
        _numero2 = entrada.nextInt();

    }
    public void CalculaMaxMin(){

        System.out.println("El maximo es: " + Math.max(_numero1,_numero2));
        System.out.println("El minimo es: " + Math.min(_numero1,_numero2));

    }


}
