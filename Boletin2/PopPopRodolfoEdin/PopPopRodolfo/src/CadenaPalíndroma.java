import java.util.Scanner;

public class PalabraPalindroma{

    public static void main(String[] args) {

        String fraseAComprobar = null;
        String fraseTemp = "";
        boolean esPalindroma = false;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la frase : ");
        fraseAComprobar = entrada.nextLine().trim().toUpperCase();

        //Quitar los espacios si la frase los tuviera
        var fraseSinEspacios = fraseAComprobar.replace(" ","");
        //longitud frase sin espacios
        var longitud = fraseSinEspacios.length();
        //Invertir la palabra y almacenar
        for (int i = longitud ; i >0; i --){
            fraseTemp += fraseSinEspacios.charAt(i-1);
        }
        //comprobacion palabra palindroma
        if(fraseSinEspacios.equals(fraseTemp)){
            System.out.println("La palabra es palindroma");
        }
        else {
            System.out.println("La palabra no es palindroma");
        }
    }
}
