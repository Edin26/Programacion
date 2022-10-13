public class MetodosArray {

    public int [] array = {4,-1,3,0,5,1,0,2};

    public void EjecutarPosicionesCero(){
        BuscarPosicionesDondeHayCeros(array);
    }
    public void EjecutarBuscarNumeroNegativo(){
        BuscarPrimerNumeroNegativo(array);
    }
    public void EjecutarValorMasAlto(){
        ValorMasAltoEnArray(array);
    }
    public void BuscarPosicionesDondeHayCeros(int [] array){

        for (int i = 0; i<array.length; i++ ){
            if (array[i]==0){
            System.out.println("En la posicion : " + i + " se ecuentra un cero " );
            }
        }
    }
    public void BuscarPrimerNumeroNegativo(int [] array){
        for (int i = 0; i<array.length; i++ ){
            if (array[i] < 0){
                System.out.println("El numero negativo : " + array[i] + " Esta en la posicion : " + i );
                break;
            }
        }
    }
    public void ValorMasAltoEnArray(int [] array){
        int valorAlto=0;
        for (int i = 0; i<array.length; i++ ){
            if (array[i]  > valorAlto){
               valorAlto = array[i];
            }
        }
        System.out.println("El valor mas alto es : " + valorAlto );

    }
}
