import java.util.Scanner;

public class NumeroPrimo {

    public int numero;
    Scanner entrada = new Scanner(System.in);

    public void NumeroPrimo(){
        IngresaNumero();
        if (EsNumeroPrimo(numero))
        {
            System.out.println("El numero "+ numero +" Es primo ");
        }
        else {
            System.out.println("El numero "+ numero +" No es primo");
        }
    }


    public void IngresaNumero(){
        System.out.println("Ingresa un numero : ");
        numero = entrada.nextInt();
        entrada.close();
    }

    public boolean EsNumeroPrimo(int numero ){

        for (int i = 2; i < numero; i++)
        {
            if((numero % i) == 0)
            {
                // No es primo
                return false;
            }
        }
        return true;
    }
}
