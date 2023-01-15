public class Ordenador extends Producto {



    private int ram;
    private  int almacenamiento;

    public Ordenador(){

        super();

    }


    public Ordenador(String codigo, String marca, String modelo, double precio, int ram, int almacenamiento) {
        super(codigo, marca, modelo, precio);
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
   public void AplicarDescuento(int cantidad) {
       if (getPrecio() < 1000) {
           setPrecio(getPrecio() - cantidad);
       } else {
           float descuento = cantidad * 0.1f;
           super.setPrecio(getPrecio() - descuento);
       }

   }

    @Override
    public String toString() {

        String mensaje = super.toString();
        mensaje += this.almacenamiento + " "+ this.ram;
        return  mensaje;

    }

}
