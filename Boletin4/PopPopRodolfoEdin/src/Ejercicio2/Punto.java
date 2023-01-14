package Ejercicio2;

import java.util.Random;

public class Punto {
    private int x;
    private int y;
    private int matrixPuntos[][];

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public void setY(int y) {
        this.y = y;
    }

    public Punto() {

    }
    public Punto(int x, int y) {
        setX(x);
        setY(y);
    }

    public String BuscaPuntoRepetido(Punto matrizPuntos[][], Punto punto) {
        String caracter = " ";

        return caracter;
    }
}


