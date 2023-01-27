import java.time.LocalDate;

public class PasswordFree extends Password
{


    public PasswordFree(String cadena) {
        super(cadena);
    }

    @Override
    public void setPassword(String cadena) {
        if (validar(cadena)){
            super.cadena = cadena;
        }

    }

    @Override
    public String getFortaleza() {
        if (super.cadena.length()  >4 ){
            return "Fuerte";
        }
        else return "debil";
    }
    //Si el String tiene más de 4 caracteres indica que es Fuerte
    //En caso contrario indica que es débil


    @Override
    public boolean validar(String s) {
        if (s.length() != 0){
            return true;
        }
        else {return  false;}
    }

    @Override
    public boolean validar(int x) {
        return super.validar(x);
    }

    @Override
    public boolean validar(LocalDate fecha) {
        return super.validar(fecha);
    }

}
