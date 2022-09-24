import java.util.Scanner;

public class Dominio {

    public String dominioCorreo = "";

    public void IngresaCorreo(){

        var entrada = new Scanner(System.in);
        System.out.println("Ingrese la direccion de correo electronico");
        dominioCorreo = entrada.next();

        var resultado = dominioCorreo.split("@");

        System.out.println("El dominio es: " + resultado[1] );



    }



}
