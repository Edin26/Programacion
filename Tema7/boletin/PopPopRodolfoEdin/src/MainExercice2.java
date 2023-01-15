public class MainExercice2 {


    public static void main(String[] args) {

    Square square1 = new Square("Soy un cuadrado",4,2);

    Circle circle1 = new Circle("Soy un circulo",2);

    Triangle triangle1 = new Triangle("Soy un triangulo ", 3, 3);

        System.out.println("soy un cuadrado  y mi perimetro es : " + square1.getPerimeter());
        System.out.println("soy un círculo   y mi perimetro es : " + circle1.getPerimeter());
        System.out.println("soy un triángulo   y mi perimetro es : " + triangle1.getPerimeter());


    }






}
