public class Televisor extends Producto {



private  int pulgadas;


public  Televisor(){

    super();

}

    public Televisor(String codigo, String marca, String modelo, double precio, int pulgadas) {
        super(codigo, marca, modelo, precio);
        this.pulgadas = pulgadas;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return super.toString()+ this.pulgadas;
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
}
