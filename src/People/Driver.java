package People;

public class Driver extends Man implements Drive {
    public Driver(String name) {
        super(name);
    }

    public void drive() {
        System.out.println("Я, " + getName() + ", вот кручу баранку, а что?");
    }
}
