public class Figure {

    String name ;
    double perimeter;


    public Figure(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "name='" + name + '\'' +
                ", perimeter=" + perimeter +
                '}';
    }
}
