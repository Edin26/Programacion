import java.util.Scanner;

public class PalabrasCadena {

    public String cadena = null;
    public int contadorPalabrasEmpiezanPorZ =0;


    public void Ejecutar(){

        IngresarFrase();
        contadorPalabrasEmpiezanPorZ = PalabrasEmpiezanConZ(cadena);
        if ( contadorPalabrasEmpiezanPorZ>0 ){
            System.out.println(contadorPalabrasEmpiezanPorZ + " Palabras empiezan por Z o z");
        }else
        {
            System.out.println("No hay palabras que empiezan por Z o z");
        }

    }


    public void IngresarFrase() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la frese  : ");
        cadena = entrada.nextLine();
    }

    public int PalabrasEmpiezanConZ( String cadena ){

        var palabras = cadena.split(" ");
        int contadorPalabrasPorZ=0;
        for (int i=0; i < palabras.length;i++ ){

            var inicioPalabra = palabras[i].charAt(0);

            if (inicioPalabra == 'z' || inicioPalabra == 'Z' ){
                contadorPalabrasPorZ += 1;
            }
        }
        return contadorPalabrasPorZ;
    }



}
