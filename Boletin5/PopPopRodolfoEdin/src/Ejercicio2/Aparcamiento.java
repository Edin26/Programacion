package Ejercicio2;

import Ejercicio1.ExceptionProducto;
import Ejercicio1.IAlquilable;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Aparcamiento implements IAlquilable {

    private String codigo;
    private int numeroPlaza;
    private boolean alquilada;
    private LocalTime horaPrestamo;
    private LocalTime horaDevolucion;

    public Aparcamiento() {
    }
    public Aparcamiento(String codigo, int numeroPlaza, boolean alquilada, LocalTime horaPrestamo, LocalTime horaDevolucion) throws ExceptionProducto {
        setCodigo(codigo);
        this.numeroPlaza = numeroPlaza;
        this.alquilada = alquilada;
        this.horaPrestamo = horaPrestamo;
        this.horaDevolucion = horaDevolucion;
    }

    public boolean ValidaCodigo(String codigo){
        return codigo.matches("^[A-Z]{2}[0-9]{2}$");
    }

    @Override
    public boolean alquilar() {
        if (getAlquilada()){
            return false;
        }
        else {
            setAlquilada(true);
         //   fechaPrestamo = LocalDate.now();
           // fechaDevolucion = LocalDate.now().plusDays(10);
            LocalTime d = LocalTime.now();
            String s = d.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT));
           // horaPrestamo = LocalTime.parse(s);

            horaPrestamo = LocalTime.now();

            horaDevolucion = LocalTime.now().plusHours(5);

            return true;
        }
    }

    @Override
    public void devolver() {
        setAlquilada(false);
        horaPrestamo = LocalTime.parse("00:00");
        horaDevolucion = LocalTime.parse("00:00");
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) throws ExceptionProducto {
        if (ValidaCodigo(codigo)){
            this.codigo = codigo;
        }else {
            throw new ExceptionProducto();
        }
    }

    public int getNumeroPlaza() {
        return numeroPlaza;
    }

    public void setNumeroPlaza(int numeroPlaza) {
        this.numeroPlaza = numeroPlaza;
    }

    public boolean getAlquilada() {
        return alquilada;
    }

    public void setAlquilada(boolean alquilada) {
        this.alquilada = alquilada;
    }

    public LocalTime getHoraPrestamo() {
        return horaPrestamo;
    }

    public void setHoraPrestamo(LocalTime horaPrestamo) {
        this.horaPrestamo = horaPrestamo;
    }

    public LocalTime getHoraDevolucion() {
        return horaDevolucion;
    }

    public void setHoraDevolucion(LocalTime horaDevolucion) {
        this.horaDevolucion = horaDevolucion;
    }

    public String toStringFichero() {
        String alquilado = "0";
        if (getAlquilada()) {
            alquilado = "1";
        }
        //Aparcamiento(String codigo, int numeroPlaza, boolean alquilada, LocalTime horaPrestamo, LocalTime horaDevolucion)
        String formato = getCodigo() + "," + getNumeroPlaza() +"," + alquilado + "," + getHoraPrestamo() +"," + getHoraDevolucion();

        return formato;
    }
    @Override
    public String toString() {
        return "Aparcamiento{" +
                "codigo='" + codigo + '\'' +
                ", numeroPlaza=" + numeroPlaza +
                ", alquilada=" + alquilada +
                ", horaPrestamo=" + horaPrestamo +
                ", horaDevolucion=" + horaDevolucion +
                '}';
    }
}
