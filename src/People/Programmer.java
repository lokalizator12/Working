package People;

public class Programmer extends Man implements CanProgramming {
    public Programmer(String name) {
        super(name);
    }

    public void programming() {
        System.out.println("Я, " + getName() + ", вот сижу пишу код, а что?");
    }
}
