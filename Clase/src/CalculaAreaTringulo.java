import java.util.Scanner;


public class CalculaAreaTringulo {

    public double _base ;
    public double _altura ;
    private double _area = 0;

    public double getBase() {
        return _base;
    }
    public void setBase(double base) {
        this._base = base;
    }
    public double getAltura() {return _altura;}
    public void setAltura(double altura) {
        this._altura = altura;
    }
    
    public void IngresaBaseAltura(){
        var entrada = new Scanner(System.in);
        System.out.println("Ingresa la base del triangulo");
        _base = entrada.nextDouble();
        System.out.println("Ingresa la altura del triangulo");
        _altura = entrada.nextDouble();
    }

    public void CalcularArea() {
        _area = (_base * _altura) / 2;
        System.out.println("El area del triangulo es :" + _area);
    }


}
