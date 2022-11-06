package bloqueEjercicios1;

public class MTDNumeros {

    public static boolean NumeroPerfecto(int numero) {
        double suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        if (suma == numero) {
            return true;
        } else {
            return false;
        }
    }

    public static int MinimoComunMultiplo(int num1,int num2,int num3){

        int mcm = 0;
        for (int i = 1 ; i < 100;i++){
            if(  i % num1  == 0 && i % num2  == 0  && i % num3  == 0  ){
             mcm = i;
             break;
            }
        }

        return mcm;
    }

}
