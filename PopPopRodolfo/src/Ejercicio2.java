import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        String codigoPais = null;
        String cuentaBancaria = null;
        int digitoControl = 0;
        int codigoCaja = 0;
        int sucursal = 0;

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduzca el numero de IBAN :");

        cuentaBancaria = lector.next();

        //Codigo del pais
        codigoPais = cuentaBancaria.substring(0,2);

        System.out.println("Codigo del pais : "+codigoPais);

        //Digito de control
        digitoControl =  cuentaBancaria.substring(2,4);







    }
}
