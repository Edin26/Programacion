public class viajeInserso extends Viaje implements Descuentable {

    public  void AplicarDescuento(int cantidad){

        super.setPrecio(super.getPrecio()-cantidad);

    }


}
