import java.time.LocalDate;


public class Employee {

    String DNI;
    LocalDate fechaDeNacimiento;
    String nombre;
    LocalDate fechaDeContratacion;
    double salario;
    static double salarioBase = 1000;

    public Employee(String DNI, LocalDate fechaDeNacimiento, String nombre, LocalDate fechaDeContratacion) {
        this.DNI = DNI;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.nombre = nombre;
        this.fechaDeContratacion = fechaDeContratacion;
        CalculaSalario(fechaDeContratacion);
    }

    private void CalculaSalario( LocalDate fechaDeContratacion){
        //salario = salarioBase + (años de antiguedad/3)*salarioBase*0,05
        LocalDate fechaActual = LocalDate.now() ;
        var años =  fechaActual.getYear() - fechaDeContratacion.getYear();
        if (años > 0){
            salario = salarioBase + (años /3.00)*salarioBase*0.05;
        }else {
            salario = salarioBase;
        }
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeContratacion() {
        return fechaDeContratacion;
    }

    public void setFechaDeContratacion(LocalDate fechaDeContratacion) {
        this.fechaDeContratacion = fechaDeContratacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static double getSalarioBase() {
        return salarioBase;
    }

    public static void setSalarioBase(double salarioBase) {
        Employee.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "DNI='" + DNI + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", nombre='" + nombre + '\'' +
                ", fechaDeContratacion=" + fechaDeContratacion +
                ", salario=" + salario +
                '}';
    }
}
