import java.time.LocalDate;

public class Administrative extends Employee{


    String codigo;


    public Administrative(String DNI, LocalDate dateOfBirth, String name, LocalDate dateOfHiring, String codigo) {
        super(DNI, dateOfBirth, name, dateOfHiring);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {

        if (codigo.matches("^[0-9]{1}[A-Z]{1}+$")){
            this.codigo = codigo;
        }

    }


    public void CalculateSalary() {

        //salario = salarioSalario base + (años de antigüedad/3)*salarioSalario base*0,2

        LocalDate currentDate = LocalDate.now() ;
        var años =  currentDate.getYear() - dateOfHiring.getYear();
        if (años > 0){
            salary = baseSalary + (años /3.00)* baseSalary *0.09;
        }else {
            salary = baseSalary;
        }

    }
}
