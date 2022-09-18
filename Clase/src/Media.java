import java.util.Scanner;

public class Media {

    private double[] _arrayVariables = new double[5];
    private double _media;

    public void IngresarValorVariables(){
        var entrada = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("ingresa el valor de variable"+i);
            _arrayVariables[i] = entrada.nextDouble();
        }
    }
    public double SumaVariables(){
        double suma =0;
        for(int i=0;i<5;i++){
            suma += _arrayVariables[i];
        }
        return suma;
    }
    public void CalculaMedia(){
        var sumaVariables= SumaVariables();
        _media = sumaVariables/5;
        System.out.println("La media es: " + _media);
    }

}
