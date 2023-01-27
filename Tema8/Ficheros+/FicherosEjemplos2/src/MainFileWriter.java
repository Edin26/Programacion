import java.io.FileReader;
import java.io.FileWriter;

public class MainFileWriter {


    public static void main(String[] args) {



        String cadena = "nueva linea en el fichero";

        try {
            FileWriter escritor = new FileWriter("C:\\Users\\edinp\\Desktop\\Ficheros+\\FicherosEjemplos2\\ejemplo1.txt",true);
            escritor.write("\n");
            for (int i = 0 ; i<cadena.length(); i++){
                escritor.write(cadena.charAt(i));
            }
            escritor.write("\n");
            escritor.write("Cadena completa de texto");

            escritor.close();
        }
        catch (Exception e){
            System.out.println("Error al escribir ");
        }
    }


}
