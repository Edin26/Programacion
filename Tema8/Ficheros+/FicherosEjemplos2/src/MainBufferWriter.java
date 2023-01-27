import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MainBufferWriter {

    public static void main(String[] args) {

        ArrayList<String> discos = new ArrayList<String>();

        discos.add("QW34,Abbey Road,250,The Beatles,0,0,0");
        discos.add("MN80,Pet Sounds,390,The Beach Boys,0,0,0");
        discos.add("ZX45,London Calling,310,The Clash,0,0,0");
        discos.add("AP01,Thriller,459,Michael Jackson,0,0,0");

        try {

            BufferedWriter bufferEscritor = new BufferedWriter(new FileWriter("C:\\Users\\edinp\\Desktop\\Ficheros+\\FicherosEjemplos2\\ejemplo1.txt"));
            String mensaje = "Linea de buffer writer2";

           // bufferEscritor.newLine();
           // bufferEscritor.write(mensaje);
            for (var disco :discos ) {
                bufferEscritor.write(disco);
                bufferEscritor.newLine();
            }
            bufferEscritor.close();

            BufferedReader bufferLector = new BufferedReader(new FileReader("C:\\Users\\edinp\\Desktop\\Ficheros+\\FicherosEjemplos2\\ejemplo1.txt"));
            ArrayList<String> discosLeidos = new ArrayList<String>();
            String linea = "";
            while (linea!=null){
                linea = bufferLector.readLine();
                if (linea!=null)
                discosLeidos.add(linea);
            }
            bufferLector.close();

            System.out.println("*********************************\n Leidos : \n");
            for (var discoleido :discosLeidos ) {
                System.out.println(discoleido);
            }

            var datosDisco = discosLeidos.get(0).split(",");

            System.out.println(Arrays.toString(datosDisco));

        } catch (Exception e) {
            System.out.println("Error");
        }

        try (FileReader lector2 = new FileReader("C:\\Users\\edinp\\Desktop\\Ficheros+\\FicherosEjemplos2\\ejemplo1.txt");){

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
