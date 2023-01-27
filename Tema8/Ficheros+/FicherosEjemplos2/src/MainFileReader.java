import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainFileReader {

    public static void main(String[] args) {


        ArrayList<String> lista = new ArrayList<String>();

        try {

            FileReader lector = new FileReader("C:\\Users\\edinp\\Desktop\\Ficheros+\\FicherosEjemplos2\\ejemplo1.txt");

            int c = 0;
            char temp = ' ';
            String dato = "";

            while (c!= -1){
                c = lector.read();
                if (c!=-1)
               // System.out.print((char) c );
                    dato = dato + (char)c;
            }

            lector.close();

            System.out.println(dato);
        } catch (FileNotFoundException e) {
            System.out.println("no encontrado");;
        } catch (IOException e) {
            System.out.println("Error al leer");
        }


    }






}
