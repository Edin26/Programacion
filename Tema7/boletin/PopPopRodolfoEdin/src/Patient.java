public class Patient {


    private String dni;
    private String name;
    private int age;
    private String illness;

    public Patient() {
    }

    public Patient(String dni, String name, int age) {
        this.dni = dni;
        this.name = name;
        this.age = age;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    @Override
    public String toString() {
        return "Paciente [dni=" + dni + ", nombre=" + name + ", edad=" + age + ", enfermedad=" + illness + "]";
    }

}
