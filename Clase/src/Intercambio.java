import java.util.Scanner;

public class Intercambio {

    private int _x;
    private  int _y;
    private int _almacenarValorTemperal;

    public void IngresaValores(){
        var entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de x");
        _x = entrada.nextInt();
        System.out.println("Ingrese el valor de y");
        _y = entrada.nextInt();
    }
    public void IntercambiarValores(){

        _almacenarValorTemperal = _x;

        //intercambio valor x
        _x = _y;
        _y = _almacenarValorTemperal;

        System.out.printf("valor de x es %d , el valor de y es %d", _x, _y);

    }



}
