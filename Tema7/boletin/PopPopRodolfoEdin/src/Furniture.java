public class Furniture {

    String name;
    float price;

    //Soy a(a) [el nombre del mueble] y valgo [el precio del mueble] euros.


    public Furniture(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    //Soy a(a) [el nombre del mueble] y valgo [el precio del mueble] euros.
    @Override
    public String toString() {
        return "Furniture{" +
                "soy='" + name + '\'' +
                ", y valgo =" + price +
                " euros";
    }
}
