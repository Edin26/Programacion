public class Table extends Furniture {


    private String tableShape;
    private int tableseats;

    public Table(String name, float price, String tableShape, int tableseats) {
        super(name, price);
        this.tableShape = tableShape;
        this.tableseats = tableseats;
    }

    public String getTableShape() {
        return tableShape;
    }

    public void setTableShape(String tableShape) {
        this.tableShape = tableShape;
    }

    public int getTableseats() {
        return tableseats;
    }

    public void setTableseats(int tableseats) {
        this.tableseats = tableseats;
    }
 //Además soy [forma de la mesa] y tengo [plazas] plazas.

    @Override
    public String toString() {
        return "Table{" +
                "Soy='" + tableShape + '\'' +
                ", Plazas =" + tableseats +
                '}';
    }
}
