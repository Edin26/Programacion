import java.util.Scanner;

public class Producto {

    private int _descuento = 15;
    private double _precioProducto;
    private double _precioProductoConDescuento;


    public void IngresaPrecioProducto(){

        var entrada = new Scanner(System.in);
        System.out.println("Ingresa el precio del producto ");
        _precioProducto = entrada.nextDouble();
        System.out.println("Precio producto antes del descuento: "+_precioProducto);
    }

    public void DescuentoProducto(){

        double descuentoPrecio = (_precioProducto * _descuento )/ 100;

        _precioProductoConDescuento = _precioProducto - descuentoPrecio;

        System.out.printf("El precio con descuento aplicado es: %f",_precioProductoConDescuento);;


    }




}
