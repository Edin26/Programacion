import java.io.BufferedReader;
import java.io.FileReader;

public class RecursosReadWrite {


    public static void main(String[] args) {

        String ruta = System.getProperty("user.dir") + "/EjemploVideo.txt";

        try (BufferedReader bflector = new BufferedReader(new FileReader(ruta));){

            String linea ="";
            while (linea != null){
                linea = bflector.readLine();
                if (linea!= null)
                    System.out.println(linea);
            }

        }catch (Exception e){


        }

        try (FileReader lector = new FileReader(ruta); BufferedReader bflector = new BufferedReader(lector);)
        {

        }
        catch (Exception e){

        }



    }





}
