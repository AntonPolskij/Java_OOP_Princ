package Animals;

public class Crow extends Animal implements Flyable{
    public Crow(String name) {
        super(name);
    }

    @Override
    public double getSpeed() {
        return 50.0;
    }
}
