import java.time.LocalDate;

public class Operators extends Employee {


    String polizaAccidentes;
    String polizaCivil;

    public Operators(String DNI, LocalDate dateOfBirth, String name, LocalDate dateOfHiring, String polizaAccidentes, String polizaCivil) {
        super(DNI, dateOfBirth, name, dateOfHiring);
        this.polizaAccidentes = polizaAccidentes;
        this.polizaCivil = polizaCivil;
    }

    public String getPolizaAccidentes() {
        return polizaAccidentes;
    }

    public void setPolizaAccidentes(String polizaAccidentes) {
        this.polizaAccidentes = polizaAccidentes;
    }

    public String getPolizaCivil() {
        return polizaCivil;
    }

    public void setPolizaCivil(String polizaCivil) {
        this.polizaCivil = polizaCivil;
    }

    public void CalculateSalary() {

        LocalDate currentDate = LocalDate.now() ;
        var años =  currentDate.getYear() - dateOfHiring.getYear();
        if (años > 0){
            salary = baseSalary + (años /3.00)* baseSalary *0.05;
        }else {
            salary = baseSalary;
        }

    }
}
