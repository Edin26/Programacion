import java.util.Scanner;

public class EcuacionSegundoGrado {

    //variables
    int a, b, c;
    double x1, x2;
    boolean tieneSolucion = false;

    public void EjecutarEcuacion() {
        IngresarDatos();
        CalculaEcuacion();
    }

    public void IngresarDatos() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el valor de a : ");
        a = entrada.nextInt();
        System.out.println("Introduzca el valor de b : ");
        b = entrada.nextInt();
        System.out.println("Introduzca el valor de c : ");
        c = entrada.nextInt();

    }

    public void CalculaEcuacion() {

        if (a == 0 && b != 0 && c != 0) {
            x1 = x2 = -c / b;
            tieneSolucion = true;

        } else if (b == 0 && a != 0) {
            var resultadoRaiz = Math.sqrt(-c / a);
            if (resultadoRaiz > 0) {
                x1 = resultadoRaiz;
                x2 = -resultadoRaiz;
                tieneSolucion = true;
            }
        } else if (c == 0 && a != 0 && b != 0) {
            x1 = 0;
            x2 = -b / a;
            tieneSolucion = true;
        } else if (a != 0 && b != 0 && c != 0) {

            var resultadoRaiz = Math.sqrt((Math.pow(b, 2) - (4 * a * c)));
            if (resultadoRaiz > 0) {
                x1 = (-b + resultadoRaiz) / (2 * a);
                x2 = (-b - resultadoRaiz) / (2 * a);
                tieneSolucion = true;
            }
        }

        if (tieneSolucion) {
            System.out.println("El resultado de x1 : " + x1);
            System.out.println("El resultado de x2 : " + x2);
        } else {
            System.out.println("No existe solucion");
        }

    }
}
