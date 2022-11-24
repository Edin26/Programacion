package Ejercicio3;

public class Municipio {


    private String nombreMunicipio;
    public String codigoMunicipio;
    public String codigoProvincia;

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public String getCodigoProvincia() {
        return codigoProvincia;
    }

    public String getDigitoDeControl() {
        return digitoDeControl;
    }

    public String digitoDeControl;

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    public void setCodigoMunicipio(String codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public void setCodigoProvincia(String codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }

    @Override
    public String toString() {
        return "Municipio{" +
                "nombreMunicipio='" + nombreMunicipio + '\'' +
                ", codigoMunicipio='" + codigoMunicipio + '\'' +
                ", codigoProvincia='" + codigoProvincia + '\'' +
                ", digitoDeControl='" + digitoDeControl + '\'' +
                '}';
    }

    public Municipio(String nombreMunicipio, int codigoMunicipio, int codigoProvincia) {

        this.nombreMunicipio = nombreMunicipio;
        this.codigoMunicipio = ValidarCodigoMunicipio(codigoMunicipio);
        this.codigoProvincia = ValidarCodigoProvincia(codigoProvincia);
        System.out.println();

    }

    public String ValidarCodigoMunicipio(int codigoMunicipio) {
        String codigo = "";
        if (codigoMunicipio > 0 && codigoMunicipio <= 999) {
            var numeroDigitos = Integer.toString(codigoMunicipio).length();
            switch (numeroDigitos) {
                case 3 -> {
                    codigo = Integer.toString(codigoMunicipio);
                    return codigo;
                }
                case 2 -> codigo = String.format("0");
                case 1 -> codigo = String.format("00");
            }
            codigo += codigoMunicipio;
            return codigo;
        }
        codigo = String.format("000");
        return codigo;

    }

    public String ValidarCodigoProvincia(int codigoProvincia) {
        String codigo = "";
        if (codigoProvincia > 0 && codigoProvincia <=57) {
            var numeroDigitos = Integer.toString(codigoProvincia).length();
            switch (numeroDigitos) {
                case 2 -> {
                    codigo = Integer.toString(codigoProvincia);
                    return codigo;
                }
                case 1 -> codigo = String.format("0");
            }
            codigo += codigoProvincia;
            return codigo;
        }
        codigo = String.format("00");
        return codigo;
    }

    //private String CalculaDigitoDeControl()


}
