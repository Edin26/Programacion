import java.time.LocalDate;

public class Manager extends Employee  {

    private int phoneNumber ;


    public Manager(String DNI, LocalDate dateOfBirth, String name, LocalDate dateOfHiring, int phoneNumber) {
        super(DNI, dateOfBirth, name, dateOfHiring);
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public void CalculateSalary() {

        //salario = salarioSalario base + (años de antigüedad/3)*salarioSalario base*0,2

        LocalDate currentDate = LocalDate.now() ;
        var años =  currentDate.getYear() - dateOfHiring.getYear();
        if (años > 0){
            salary = baseSalary + (años /3.00)* baseSalary *0.2;
        }else {
            salary = baseSalary;
        }

    }
}
