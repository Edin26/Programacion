import java.util.Scanner;

public class Vocales {

    String frase = "";

        public void Ejecutar() {
            IngresarFrase();

            for (int i =0; i< frase.length();i++) {
               var letra= frase.charAt(i);

                if (LaLetraEsVocal(letra)){
                    System.out.println("La vocal : " + letra +" Esta en la posicion : " + i );
                }
            }

        }
    public void IngresarFrase() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la frese  : ");
        frase = entrada.nextLine();
    }
        public boolean LaLetraEsVocal(char letra){

            char vocalesMinuscula [] = { 'a','e','i','o','u'};
            char vocalesMayuscula [] = { 'A','E','I','O','U'};
            boolean EsVocal = false;
            for (int i=0; i< vocalesMinuscula.length;i++ ){
                if ( letra == vocalesMinuscula[i] ){
                    EsVocal = true;
                }
            }
            if ( EsVocal == false ) {
                for (int i=0; i< vocalesMayuscula.length;i++ ){
                    if ( letra == vocalesMayuscula[i] ){
                        EsVocal = true;
                    }
                }
            }
            return EsVocal;
        }






}
