import java.util.Scanner;

public class NumeroMaxMinTresNumeros {

    public int _numero1;
    public int _numero2;
    public int _numero3;

    public void IngresarValores(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor del primer numero");
        _numero1 = entrada.nextInt();
        System.out.println("Ingrese el valor del segundo numero");
        _numero2 = entrada.nextInt();
        System.out.println("Ingrese el valor del tercer numero");
        _numero3 = entrada.nextInt();

    }
    public void CalculaMaxMin(){

        System.out.println("El maximo es: " + Math.max(Math.max(_numero1,_numero2),_numero3));
        System.out.println("El minimo es: " + Math.min(Math.min(_numero1,_numero2),_numero3));

    }


}
