import java.time.LocalDate;

public class Main {

   public static boolean SaveEmployee(Employee employees[], Employee e){
    boolean savedEmployee = false;
      // if (e != null){
           for (int i =0 ; i< employees.length ; i++){
               if (employees[i] == null){
                   employees[i] = e;
                   savedEmployee = true;
                   break;
               }

           }
     //  }
       return savedEmployee;
   }
   public static void ShowEmployees(Employee employees []){
       for (var e : employees) {
           if (e != null){
               System.out.println(e.toString());
           }
       }
   }

   public static Employee EmployeeSearch( Employee employees [], String name ){

       for (var e : employees ) {

           if (e.getNombre() != null)

       }

   }



    public static void main(String[] args) {


        Employee T1 = new Employee("01847270K", LocalDate.parse("1998-06-26"),"Edin",  LocalDate.parse("2023-05-03"));

        Employee employees[] = new Employee[10];

        var save = SaveEmployee(employees,T1);


        ShowEmployees(employees);

        System.out.println();






    }



}
