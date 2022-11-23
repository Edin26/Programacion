package Ejercicio1;

public class MainJugador {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("A233","Pocholo");
        Jugador jugador2 = new Jugador("A3","nena");
        Jugador jugador3 = new Jugador("A4","chito");

        jugador1.ActualizarPuntos(11);


        System.out.println( jugador1.toString());
        System.out.println( jugador2.toString());
        System.out.println( jugador3.toString());
    }
}
