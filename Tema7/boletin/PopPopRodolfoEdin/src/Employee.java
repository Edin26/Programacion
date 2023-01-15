import java.time.LocalDate;


public  class Employee {

    String DNI;
    LocalDate dateOfBirth;
    String name;
    LocalDate dateOfHiring;
    double salary;
    static double baseSalary = 1000;

    public Employee(String DNI, LocalDate dateOfBirth, String name, LocalDate dateOfHiring) {
        this.DNI = DNI;
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.dateOfHiring = dateOfHiring;
        CalculateSalary();
    }

    public  void CalculateSalary(){

        //salario = salarioBase + (años de antiguedad/3)*salarioBase*0,05
        LocalDate currentDate = LocalDate.now() ;
        var años =  currentDate.getYear() - dateOfHiring.getYear();
        if (años > 0){
            salary = baseSalary + (años /3.00)* baseSalary *0.05;
        }else {
            salary = baseSalary;
        }
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfHiring() {
        return dateOfHiring;
    }

    public void setDateOfHiring(LocalDate dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static double getBaseSalary() {
        return baseSalary;
    }

    public static void setBaseSalary(double baseSalary) {
        Employee.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "DNI='" + DNI + '\'' +
                ", fechaDeNacimiento=" + dateOfBirth +
                ", nombre='" + name + '\'' +
                ", fechaDeContratacion=" + dateOfHiring +
                ", salario=" + salary +
                '}';
    }
}
