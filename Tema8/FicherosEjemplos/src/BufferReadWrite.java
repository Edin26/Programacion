import java.io.*;

public class BufferReadWrite {

    public static void main(String[] args) {
    // LECTURA BUFFER
    String ruta = System.getProperty("user.dir")+ "/EjemploVideo.txt";
        FileReader lector = null;
        try {
            lector = new FileReader(ruta);
            BufferedReader bfLector = new BufferedReader(lector);

            String linea = "";

            while (linea != null){
                linea = bfLector.readLine();
                if (linea != null){
                    System.out.println(linea);
                }
            }
            lector.close();
            bfLector.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    //// Write
        try {
            FileWriter escritor = new FileWriter(ruta,true);
            BufferedWriter bfEscritor = new BufferedWriter(escritor);

            String registro = "Marcos Dominguez#44555555#marcosGgmail.com";

            bfEscritor.write(registro);
            bfEscritor.newLine();

            bfEscritor.close();
            escritor.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }






}
