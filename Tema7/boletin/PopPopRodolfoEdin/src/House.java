public class House {



/*
    Clase Casa:
    Sólo queda un ejercicio: la clase Casa, que será la clase principal que va a tener el método main.
    Esta clase sólo tiene un método main, en el que se declara e inicializa un array de 8 muebles, con las siguientes características:
            1 mesa, redonda, de 4 plazas, de valor 250 euros (para el comedor).
            4 sillas, de color crema, de valor 55 euros cada una (para el comedor).
            1 cama de 150 por 200, de valor 575 euros (para el dormitorio).
            1 mesa, rectangular, de 1 plaza, de valor 72 euros (para el dormitorio).
            1 silla, de color azul, de valor 25 euros (para el dormitorio).

    Usando un bucle, imprimid la lista de muebles de la casa, llamando al método correspondiente.

*/

    public static void main(String[] args) {

        Furniture furniture [] = new Furniture[8];

        Table table1 = new Table("Comedor",250.0f,"Round",4);
        Chair chair2 = new Chair("Comedor", 55,"White");

        System.out.println(chair2.toString());
    }

}
