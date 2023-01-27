import java.io.*;

public class LeerEscribirFile {



    public static void main(String[] args) throws IOException {

        //LECTURA
    String ruta = System.getProperty("user.dir")+ "/EajemploVideos.txt";
        try {
            FileReader lector = new FileReader(ruta);
            int c = 0;

            while (c!=-1){
                c = lector.read();
                if (c!=-1)
                System.out.print((char) c );
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("no encontrado");
        }

        //Escribir
        String ruta2 = System.getProperty("user.dir")+ "/EjemploEscribir.txt";
        FileWriter escritor =  new FileWriter(ruta2);
        escritor.write("Funcionando aaaaaasdsdqwdqwdas ");
        escritor.close();




    }


}
