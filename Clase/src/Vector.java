import java.util.Scanner;

public class Vector {

    public double a ;
    public double b;
    public double c;
    private double _modulo;

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    public void IngresarValores(){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de a");
        a = entrada.nextDouble();
        System.out.println("Ingrese el valor de b");
        b = entrada.nextDouble()
        ;System.out.println("Ingrese el valor de c");
        c = entrada.nextDouble();
    }

    public void CalculaModulo(){

        _modulo =  Math.sqrt((Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c, 2)));
        System.out.println("El modulo es: " + _modulo);

    }
}



