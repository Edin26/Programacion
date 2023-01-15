public class Circle extends Figure {

    double radio;


    public Circle(String name, double radio) {
        super(name);
        this.radio = radio;
        CalculatesPerimeter();
    }

    public void CalculatesPerimeter(){

        perimeter = 2*3.1416*radio;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radio=" + radio +
                ", name='" + name + '\'' +
                ", perimeter=" + perimeter +
                '}';
    }
}
