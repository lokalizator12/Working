package People;

public class Cooker extends Man implements Coocking {
    public Cooker(String name) {
        super(name);
    }

    public void cook() {
        System.out.println("Я, " + getName() + ", готовлю вот что-то, а что?");
    }
}
