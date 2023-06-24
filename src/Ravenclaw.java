import java.util.Objects;

public class Ravenclaw extends Hogwarts {
    private int clever;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String name, String faculty, int power, int transgress, int clever, int wisdom, int wit, int creation) {
        super(name, faculty, power, transgress);
        this.clever = clever;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getClever() {
        return clever;
    }

    public void setClever(int clever) {
        this.clever = clever;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public int sum() {
        return clever + wisdom + wit + creation;
    }

    public void compare(Ravenclaw other) {
        if (sum() > other.sum()) {
            System.out.println(getName() + " лучший Когтевранец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Когтевранец, чем " + getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return clever == ravenclaw.clever && wisdom == ravenclaw.wisdom && wit == ravenclaw.wit && creation == ravenclaw.creation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), clever, wisdom, wit, creation);
    }
}

