import java.util.Arrays;

public class Desviacion {

    public double[] desviacion;
    public int contadorValores;
    public double media;
    public double desviacionMedia;

    //public int

    public int [] array = {4,1,3,9,5,1,0,2};
    public double [] desviaciones = new double[array.length];

    public void Ejecutar(){

        media = CalculaMedia(array);
        contadorValores = ContadorValoresMayorMedia(media,array);
        desviacion = CalcularDesviacion(media,array);
        desviacionMedia = CalculaMedia(desviacion);

        System.out.println("La media es : "+media);
        System.out.println("Hay "+ contadorValores +" valores por encima de la media ");
        System.out.println( Arrays.toString(desviacion));
        System.out.println("Desviacion media : "+desviacionMedia);

    }
    public double CalculaMedia(int [] valores){
        int suma = 0;
        double media = 0;

        for (int i = 0; i<valores.length;i++){
                suma += valores[i];
        }
        media = (double) suma / valores.length;

        return media;
    }
    public double CalculaMedia(double [] valores){
        double suma = 0;
        double media = 0;

        for (int i = 0; i<valores.length;i++){
                suma += valores[i];
        }
        media = (double) suma / valores.length;

        return media;
    }
    public int ContadorValoresMayorMedia(double media, int [] array){
        int contador=0;
        for (int i = 0; i<array.length;i++){

            if( array[i] > media ){
                contador++;
            }
        }
        return contador;
    }
    public double [] CalcularDesviacion(double media, int [] array ){
        int contador=0;
        double [] desviacion = new double[array.length];
        for (int i = 0; i<array.length;i++){
            desviacion[i] = Math.abs( media - array[i] );
        }
        return desviacion;
    }




}
