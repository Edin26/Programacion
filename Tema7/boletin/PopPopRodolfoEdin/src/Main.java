import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        Employee t1 = new Employee("01847270K", LocalDate.parse("1998-06-26"),"Edin",  LocalDate.parse("2021-05-03"));
        Employee t2 = new Employee("01847270K", LocalDate.parse("1998-06-26"),"May",  LocalDate.parse("2023-05-03"));

        Employee employees[] = new Employee[10];

        var save1 = MethodsEmployed.SaveEmployee(employees,t1);
        var save2 = MethodsEmployed.SaveEmployee(employees,t2);


        var found = MethodsEmployed.EmployeeSearch(employees,"");

        if (found != null){
            System.out.println(found.toString());
        }
        MethodsEmployed.ShowEmployees(employees);

        System.out.println();

        //t1.setDateOfHiring( LocalDate.parse("2022-04-05"));
        //t1.CalculateSalary();
        MethodsEmployed.ShowEmployees(employees);





    }



}
