import java.util.Objects;

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

    public void compare(Hogwarts other) {
        if (this.power > other.power) {
            System.out.println(this.name + " обладает бОльшей мощностью магии, чем " + other.name);
        } else {
            System.out.println(other.name + " обладает бОльшей мощностью магии, чем " + this.name);
        }
        if (this.transgress > other.transgress) {
            System.out.println(this.name + " обладает бОльшим расстоянием трансгрессии, чем " + other.name);
        } else {
            System.out.println(other.name + " обладает бОльшим расстоянием трансгрессии, чем " + this.name);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return power == hogwarts.power && transgress == hogwarts.transgress && Objects.equals(name, hogwarts.name) && Objects.equals(faculty, hogwarts.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, faculty, power, transgress);
    }
}
