import java.util.Scanner;

public class Inmobiliaria {

    private final float IMPUESTOREVAL = 3.4f;
    private double _precioVenta;
    private double _conmisionImporteVenta = 0;
    private int _antiguedad =0;
    private  double _precioCatastral ;
    private  double _importe ;

    public void IngresaValores(){

        var entrada = new Scanner(System.in);
        System.out.println("Ingrese la antiguedad desde la compra del piso");
        _antiguedad = entrada.nextInt();
        System.out.println("Ingrese el valor catastral del inmueble.");
        _precioCatastral = entrada.nextInt();
        System.out.println("Ingrese el _importe del inmueble.");
        _importe = entrada.nextDouble();
    }

    public void CalculaPrecioventa(){

        _conmisionImporteVenta = _importe * 0.03f;
        _precioVenta = _importe+_conmisionImporteVenta+((IMPUESTOREVAL*_antiguedad)/100)*_precioCatastral;

        System.out.println("El precio de venta es: "+_precioVenta);
    }


}
