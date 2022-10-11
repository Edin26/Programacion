import java.util.Scanner;

public class Salario {

    public double costeHora;
    public int horasTrabajadas,horasExtras;
    public double salarioNeto;
    public double salarioBruto;
    public double impuesto;

    public void Ejecutar(){

        IngresarDatos();
        CalculaSalarioBruto();
        CalculaSalarioNeto();
    }
    public void IngresarDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el coste por hora de trabajo : ");
        costeHora = entrada.nextDouble();
        System.out.println("Ingresa el total de horas trabajadas : ");
        horasTrabajadas = entrada.nextInt();
        entrada.close();
        horasExtras = horasTrabajadas > 38 ? horasTrabajadas-38: 0;
    }
    public  void CalculaSalarioNeto(){
        var impuesto = CalculaImpuesto(salarioBruto);
        if (salarioBruto <= 300){
            salarioNeto = salarioBruto + impuesto;
        }
        else {
            salarioNeto = salarioBruto + impuesto;
        }
        System.out.println("Salario Neto : " + salarioNeto);
    }
    public void CalculaSalarioBruto() {

        if ( horasTrabajadas <= 38 ){
        salarioBruto = horasTrabajadas * costeHora;
     }
        else {
            salarioBruto = 38 * costeHora + horasExtras*1.5*costeHora;
        }
        System.out.println("Salario Bruto : " + salarioBruto);
    }

    public double CalculaImpuesto(double salarioBruto){
        double impuestoCalculado;

         if (salarioBruto <= 300){
             impuestoCalculado = 0;
         } else
             impuestoCalculado = salarioBruto * 0.10;

        return impuestoCalculado;
     }

    }


