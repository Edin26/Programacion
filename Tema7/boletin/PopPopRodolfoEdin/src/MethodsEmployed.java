public  class MethodsEmployed {

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
        Employee employeeFound = null;

        for (var e : employees) {
            if (e != null) {
                if (e.getName().equals(name)) {
                    employeeFound = e;
                    break;
                }
            }
        }
        return employeeFound;
    }
}

