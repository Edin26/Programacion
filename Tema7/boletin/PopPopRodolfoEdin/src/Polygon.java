public class Polygon extends Figure {


    private int numeroDeLados;
    private double longitudDeLados;


    public Polygon(String name, int numeroDeLados, double longitudDeLados) {
        super(name);
        this.numeroDeLados = numeroDeLados;
        this.longitudDeLados = longitudDeLados;
        CalculatesPerimeter();
    }

    public int getNumeroDeLados() {
        return numeroDeLados;
    }

    public void setNumeroDeLados(int numeroDeLados) {
        this.numeroDeLados = numeroDeLados;
    }

    public double getLongitudDeLados() {
        return longitudDeLados;
    }

    public void setLongitudDeLados(double longitudDeLados) {
        this.longitudDeLados = longitudDeLados;
    }

    public void CalculatesPerimeter(){

        perimeter = numeroDeLados * longitudDeLados;

    }


    @Override
    public String toString() {
        return "Polygon{" +
                "numeroDeLados=" + numeroDeLados +
                ", longitudDeLados=" + longitudDeLados +
                ", name='" + name + '\'' +
                ", perimeter=" + perimeter +
                '}';
    }
}
