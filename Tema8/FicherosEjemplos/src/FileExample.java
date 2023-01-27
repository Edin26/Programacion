import java.io.*;

public class FileExample {

    public static void main(String[] args) {

        File archivo = new File(System.getProperty("user.dir"));

        System.out.println("Nombre : "+ archivo.getName());
        System.out.println("Carpeta : "+ archivo.getParent());
        System.out.println("Ruta completa "+ archivo.getAbsolutePath());

        String archivos [] =  archivo.list();

        for (var dato :archivos) {

            System.out.println(dato);
            File subArchivo = new File(archivo.getAbsolutePath(),dato);
            if (subArchivo.isDirectory()){
                String subAchivos [] = subArchivo.list();
                System.out.println();
                for (String dato2: subAchivos) {
                    System.out.println(dato2);

                }
            }

        }

    }
}
