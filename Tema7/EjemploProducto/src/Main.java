import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Ordenador o = new Ordenador("EQA","22","RF1",55,213,4321);
        Ordenador o2 = new Ordenador("ATS","333","ZTS",34,21,4321);

        Televisor t = new Televisor("SFR","333","GTR",66,3333);



        Producto p = new Ordenador();

        Descuentable ps[] = new Producto[9];

        ps[0] = o;
        ps[1] = t;
        ps[2] = o2;
        //ps[3] = new viajeInserso();


        for (int i = 0; i<ps.length; i++){
            if (ps[i]==null){
                break;
            }
            else {
                ps[i].AplicarDescuento(200);
            }
        }

        for (int i = 0 ; i< ps.length; i++){
            if(ps[i]!=null){
                ps[i].AplicarDescuento(200);
            }
        }

        Producto ps2[] = new Producto[5];
        ps2[0] = o;
        ps2[1] = t;
        ps2[2] = o2;
        ps2[3] = new Ordenador("LKQ","Mac","PRO",446,2,888);

        ps2[4] = new Producto() {
            @Override
            public void AplicarDescuento(int cantidad) {
                setPrecio(getPrecio()-2*cantidad);
            }
        };
        ps2[4].AplicarDescuento(1000);

        //Arrays.sort(ps2);

        for (Producto productos : ps2) {

            if (productos != null){
                System.out.println(productos.getCodigo());
            }
            else {
                break;
            }
        }
        for (Producto p4 : ps2) {

            System.out.println(p4.getPrecio());
        }






    }
}