package Ejercicio2;

import Ejercicio1.IAlquilable;

import java.time.LocalTime;

public class Aparcamiento implements IAlquilable {

    private String codigo;
    private int numeroPlaza;
    private boolean alquilada;
    private LocalTime horaPrestamo;
    private LocalTime horaDevolucion;


    public Aparcamiento() {
    }

    public Aparcamiento(String codigo, int numeroPlaza, boolean alquilada, LocalTime horaPrestamo, LocalTime horaDevolucion) {
        ValidaCodigo(codigo);
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
        return false;
    }

    @Override
    public void devolver() {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (ValidaCodigo(codigo)){
            this.codigo = codigo;
        }
    }

    public int getNumeroPlaza() {
        return numeroPlaza;
    }

    public void setNumeroPlaza(int numeroPlaza) {
        this.numeroPlaza = numeroPlaza;
    }

    public boolean isAlquilada() {
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
