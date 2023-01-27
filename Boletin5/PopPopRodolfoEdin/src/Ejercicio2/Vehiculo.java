package Ejercicio2;

import Ejercicio1.IAlquilable;

import java.time.LocalDate;
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
        return false;
    }

    @Override
    public void devolver() {

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

    public boolean isAlquilado() {
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
