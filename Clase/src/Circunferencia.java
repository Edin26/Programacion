import java.util.Scanner;

public class Circunferencia {

    public double _radio;
    private double _longitud;
    private double _volumen;
    private double _superficie;

    public double get_radio() {
        return _radio;
    }

    public void set_radio(double _radio) {
        this._radio = _radio;
    }

    public void IngresaRadio() {
        var entrada = new Scanner(System.in);
        System.out.println("Ingresa el radio de la circunferencia");
        _radio = entrada.nextDouble();
    }
    public void CalculaLongitud() {
        _longitud = 2 * Math.PI * _radio;
        System.out.println("La longitud de la circunferencia es : " + _longitud);
    }
    public void CalculaVolumen() {

        _volumen = (4 / 3) * Math.PI * Math.pow(_radio, 3);
        System.out.println("El volumen de la circunferencia es : " + _volumen);
    }
    public void CalculaSuperficie() {

        _superficie = Math.PI * Math.pow(_radio, 2);
        System.out.println("La superficie de la circunferencia es : " + _superficie);
    }
}
