package Ejercicio1;

public class ExceptionProducto extends Exception {

    public class ExceptionProductos extends Exception{
        @Override
        public String toString() {
            return "No se ha podico crear el producto";
        }
    }



}
