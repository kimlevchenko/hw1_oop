public class Hogwarts {
    private String name;
    private String faculty;
    private int power;
    private int transgress;

    public Hogwarts(String name, String faculty, int power, int transgress) {
        this.name = name;
        this.faculty = faculty;
        this.power = power;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getPower() {
        return power;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }
}
