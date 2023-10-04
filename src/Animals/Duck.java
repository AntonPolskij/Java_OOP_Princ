package Animals;

public class Duck extends Animal implements Flyable{
    public Duck(String name) {
        super(name);
    }

    @Override
    public double getSpeed() {
        return 70.0;
    }
}
