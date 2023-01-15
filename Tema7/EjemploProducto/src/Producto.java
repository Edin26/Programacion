public abstract class Producto implements Descuentable , Comparable<Producto> {

    private String codigo;
    private String marca;
    private String modelo;
    private double precio;


    private static String tienda;

    public Producto (){

    }

    public Producto(String codigo, String marca, String modelo, double precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {

        if (codigo.length() == 5){
            this.codigo = codigo;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static String getTienda() {
        return tienda;
    }

    public static void setTienda(String tienda) {
        Producto.tienda = tienda;
    }

    @Override
    public int compareTo(Producto o) {
        return this.codigo.compareTo(o.getCodigo());
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }






}
