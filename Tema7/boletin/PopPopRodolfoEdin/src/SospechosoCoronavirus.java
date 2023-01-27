import java.util.Random;

public class SospechosoCoronavirus extends Patient {


    private boolean infected;
    private boolean testPerformed;


    public SospechosoCoronavirus(String dni, String name, int age) {
        super(dni, name, age);
        setInfected(false);
        this.testPerformed = false;
    }


    public void realizarTest() {
        testPerformed = true;
        Random rnd = new Random();
        var result = (int)Math.round(Math.random());
        if (result==1){
            infected = true;
        }
    }
    public  void curar(){
        infected =false;
    }


    public boolean isInfected() {
        return infected;
    }

    public void setInfected(boolean infected) {
        this.infected = infected;
    }

    public boolean isRealizadoTest() {
        return testPerformed;
    }

    public void setRealizadoTest(boolean realizadoTest) {
        this.testPerformed = realizadoTest;
    }

    public String toString() {
        return "SospechosoCoronavirus [infectado=" + infected + ", realizadoTest=" + testPerformed + ", toString()="
                + super.toString() + "]";
    }
}
