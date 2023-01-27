public class mainPatient {

    public static void main(String[] args) {




        Patient list []= new Patient[10];
        list[0] = new Patient("111","primero",1);
        list[1] = new Patient("222","segundo",1);
        list[2] = new Patient("333","tercero",1);
        list[3] =  new SospechosoCoronavirus("123","123",2);
        list[4] =  new SospechosoCoronavirus("456","456",2);
        list[5] =  new SospechosoCoronavirus("789","789",2);
        list[6] =  new SospechosoCoronavirus("321","321",2);

        for (var paciente  : list ) {
            if (paciente != null){
               if (paciente instanceof SospechosoCoronavirus){
                   ((SospechosoCoronavirus) paciente).realizarTest();
               }
            }
        }
        System.out.println("************Lista de pacientes************");
        for (var pacientes : list) {
            if (pacientes != null){
                System.out.println(pacientes);
            }
        }

        for (var infectados : list  ) {
            if (infectados != null){
                if (infectados instanceof SospechosoCoronavirus){
                    if (((SospechosoCoronavirus)infectados).isInfected()) {
                        infectados.setIllness("CoronaVirus");
                        System.out.println(infectados);
                    }
                }
            }
        }
        for (var curado : list){
            if (curado != null) {
                if (curado instanceof SospechosoCoronavirus ) {
                    if (((SospechosoCoronavirus) curado).isInfected()) {
                        if (curado.getAge() < 50) {
                            ((SospechosoCoronavirus) curado).curar();
                            System.out.println(curado.getAge() + " A sido curado de covicho ");
                        }

                    }
                }
            }
        }






    }







}
