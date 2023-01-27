import java.time.LocalDate;

public class PasswordPlus extends Password {


    public PasswordPlus(String cadena) {
        super(cadena);
    }

    @Override
    public void setPassword(String cadena) {
        if (validar(cadena)){
            super.cadena = cadena;
        }

    }

    //Si el String tiene más de 10 caracteres y al menos una mayúscula indica que es fuerte.
    //En caso contrario indica que es débil

    @Override
    public String getFortaleza() {
       if (super.cadena.length() >10 && super.cadena.matches(".*[A-Z].*")){
           return "fuerte";
       }
       else {
           return "debil";
       }
    }

    @Override
    public boolean validar(String s) {
       if (s.length() >= 6 && s.matches(".*[0-9].*")){
           return true;
        }
       return false;
    }

    @Override
    public boolean validar(int x) {
        return super.validar(x);
    }

    @Override
    public boolean validar(LocalDate fecha) {
        return super.validar(fecha);
    }

    @Override
    public boolean validar(double d) {
        return super.validar(d);
    }


    }
