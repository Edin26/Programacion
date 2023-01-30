package Ejercicio2;

import Ejercicio1.IAlquilable;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Vehiculo implements IAlquilable {

    private String matricula;
    private String marca;
    private String modelo;
    private boolean alquilado;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Vehiculo(){}
    public Vehiculo(String matricula, String marca, String modelo, boolean alquilado, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        setMatricula(matricula);
        this.marca = marca;
        this.modelo = modelo;
        this.alquilado = alquilado;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }
    public boolean ValidaMatricula(String matricula){
        return matricula.matches("^[0-9]{4}[A-Z]{3}$");
    }
    public String sumarDiasAFechaPrestamo(String fecha, int dias) {
        if(dias == 0){
            return fecha;
        }
        String[] f = fecha.split("-");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(f[0]), Integer.parseInt(f[1])-1, Integer.parseInt(f[2]));
        calendar.add(Calendar.DAY_OF_MONTH, dias);
        SimpleDateFormat fe = new SimpleDateFormat("YYYY-MM-dd");
        return fe.format(calendar.getTime());
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (ValidaMatricula(matricula)) {
            this.matricula = matricula;
        }
    }
    @Override
    public boolean alquilar() {
        if (getAlquilado()){
            return false;
        }
        else {
            setAlquilado(true);
            fechaPrestamo = LocalDate.now();
            fechaDevolucion = LocalDate.now().plusDays(10);
            return true;
        }
    }

    @Override
    public void devolver() {
        LocalDate fechaNula = LocalDate.parse("1999-11-11");
        setAlquilado(false);
        fechaPrestamo =fechaNula;
        fechaDevolucion = fechaNula;

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
    public boolean getAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String toStringFichero() {
        String alquilado = "0";
        if (getAlquilado()) {
            alquilado = "1";
        }
        //String matricula, String marca, String modelo, boolean alquilado, LocalDate fechaPrestamo, LocalDate fechaDevolucion
        String formato = getMatricula() + "," + getMarca()+"," + getModelo() +"," + alquilado + "," + getFechaPrestamo() +"," + getFechaDevolucion();

        return formato;
    }


    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", alquilado=" + alquilado +
                ", fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucion=" + fechaDevolucion +
                '}';
    }
}
