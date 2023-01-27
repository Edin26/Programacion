import java.time.LocalDate;

public abstract class Password implements Validator {

    protected String cadena;

    public Password(String cadena) {
        this.cadena = cadena;
    }

    public String getCadena() {
        return cadena;
    }

    public abstract void setPassword( String cadena);

    public abstract String getFortaleza();

    @Override
    public boolean validar(String s) {
        return false;
    }

    @Override
    public boolean validar(int x) {
        return false;
    }

    @Override
    public boolean validar(double d) {
        return false;
    }

    @Override
    public boolean validar(LocalDate fecha) {
        return false;
    }
}
