import java.util.Scanner;

public class Temperatura {

    private double _celsius ;
    public double _fahrenheit;

    public double get_fahrenheit() {
        return _fahrenheit;
    }
    public void set_fahrenheit(double _fahrenheit) {
        this._fahrenheit = _fahrenheit;
    }

    public void IngresaTemperatura(){
        var entrada = new Scanner(System.in);
        System.out.println("Ingresa la temperatura en grados fahrenheit");
        _fahrenheit = entrada.nextDouble();
    }
    public void ConvertirFahrenheitACelsius(){
        _celsius = ((_fahrenheit-32)*5)/9;
        System.out.printf("La temperatura en celsius es %f",_celsius);
    }





}
