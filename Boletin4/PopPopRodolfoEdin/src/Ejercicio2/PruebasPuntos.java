package Ejercicio2;

import java.util.Random;

public class PruebasPuntos {


    public static void main(String[] args) {

        Punto matrixPuntos[][] = new Punto[5][5];

        for (int i = 0; i < matrixPuntos.length; i++) {
            for (int j = 0; j < matrixPuntos.length; j++) {

                Random rnd = new Random();

                int x = rnd.nextInt(-5, 5);
                int y = rnd.nextInt(-5, 5);
                matrixPuntos[i][j] = new Punto(x, y);

            }
        }

        //cuadrante 1 el correspondiente a los puntos x>=0 e y >=0
        int puntosCuadrante1 =0;
        int puntosCuadrante2 =0;
        int puntosCuadrante3 =0;
        int puntosCuadrante4 =0;
        for (var fila: matrixPuntos) {
            for (var punto: fila) {
                if (punto.getX()>=0 && punto.getY()>=0){
                    puntosCuadrante1++;
                }
                if (punto.getX()<=0 && punto.getY()>=0){
                    puntosCuadrante2++;
                }
                if (punto.getX()>0 && punto.getY()<0){
                    puntosCuadrante3++;
                }
                if (punto.getX()<0 && punto.getY()<0){
                    puntosCuadrante4++;
                }

            }
        }


        for (int i =0 ; i< matrixPuntos.length ; i++){
            for (int j =0 ; j< matrixPuntos.length ; j++){

                System.out.print(" " + matrixPuntos[i][j].toString());
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Puntos en el cuadrante 1 : "+ puntosCuadrante1);
        System.out.println("Puntos en el cuadrante 1 : "+ puntosCuadrante2);
    }


}
