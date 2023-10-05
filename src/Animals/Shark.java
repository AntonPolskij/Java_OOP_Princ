package Animals;

public class Shark extends Animal implements Swimmable{
    public Shark(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.TYPE + " " + this.getName() + " не умеет летать");
    }

    @Override
    public double getSpeed() {
        return 50.0;
    }
}
