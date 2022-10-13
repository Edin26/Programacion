import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        String codigoPais = null;
        String cuentaBancaria = null;
        String digitoControl1 = null;
        String digitoControl2 = null;
        String numeroDeCuenta = null;
        int codigoCaja = 0;

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduzca el numero de IBAN :");
        //Almacenar cuenta bancaria
        cuentaBancaria = lector.next();

        //Codigo del pais
        codigoPais = cuentaBancaria.substring(0, 2);
        System.out.println("Codigo del pais : " + codigoPais);

        //Digito de control1
        digitoControl1 = (cuentaBancaria.substring(2, 4));
        System.out.println("Digito de control1 : " + digitoControl1);
        //Digito de control2
        digitoControl2 = (cuentaBancaria.substring(12, 14));
        System.out.println("Digito de control2 : " + digitoControl2);

        //Codigo de la caja
        codigoCaja = Integer.parseInt(cuentaBancaria.substring(4, 8));
        System.out.println("Codigo de caja : " + codigoCaja);

        //Muestre true si los dos dígitos de control coinciden
        var resultadoCompararDigitoControl = digitoControl1.equals(digitoControl2);
        System.out.println("¿Coinciden los digitos de control ? : " + resultadoCompararDigitoControl);

        //Numero de cuenta
        numeroDeCuenta = cuentaBancaria.substring(14);
        System.out.println("Numero de cuenta : " + numeroDeCuenta);

        //Total de caracteres que consta el IBAN
        var totalCaracteresIBAN = cuentaBancaria.length();
        System.out.println("Numero total de caracteres del IBAN :" + totalCaracteresIBAN);

        //Moostrar true si empieza por ES
        var empiezaIBANPorES = cuentaBancaria.startsWith("ES");
        System.out.println("La cuenta bancaria empieza por ES ? : " + empiezaIBANPorES);

        //Mostrar digito de control en binario
        var digitoControlEnBinario = Integer.toBinaryString(Integer.parseInt(digitoControl1));
        System.out.println("Digito de control : " + digitoControlEnBinario);

    }
}
