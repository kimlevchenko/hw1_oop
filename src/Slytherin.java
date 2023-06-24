import java.util.Objects;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int resolve;
    private int ambition;
    private int resourcefulness;
    private int authority;

    public Slytherin(String name, String faculty, int power, int transgress, int cunning, int resolve, int ambition, int resourcefulness, int authority) {
        super(name, faculty, power, transgress);
        this.cunning = cunning;
        this.resolve = resolve;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.authority = authority;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getResolve() {
        return resolve;
    }

    public void setResolve(int resolve) {
        this.resolve = resolve;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }

    public int sum() {
        return cunning + resolve + ambition + resourcefulness + authority;
    }

    public void compare(Slytherin other) {
        if (sum() > other.sum()) {
            System.out.println(getName() + " лучший Слизеринец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Слизеринец, чем " + getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Slytherin slytherin = (Slytherin) o;
        return cunning == slytherin.cunning && resolve == slytherin.resolve && ambition == slytherin.ambition && resourcefulness == slytherin.resourcefulness && authority == slytherin.authority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cunning, resolve, ambition, resourcefulness, authority);
    }
}
