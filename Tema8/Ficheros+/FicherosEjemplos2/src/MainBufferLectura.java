import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MainBufferLectura {

    public static void main(String[] args) {
        ArrayList<String > lista = new ArrayList<String>();

        try {
            FileReader lector = new FileReader("C:\\Users\\edinp\\Desktop\\Ficheros+\\FicherosEjemplos2\\ejemplo1.txt");
            BufferedReader buffer  = new BufferedReader(lector);
            String linea = "";
            while ( linea != null){

                linea = buffer.readLine();

                System.out.println(linea);

                lista.add(linea);

            }
            buffer.close();
            lector.close();
            System.out.println("");
            for (var dato : lista) {
                System.out.println(dato);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



}
