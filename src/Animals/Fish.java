package Animals;

public class Fish extends Animal implements Swimmable{

    public Fish(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.TYPE + " " + this.getName() + " не умеет летать");
    }

    @Override
    public double getSpeed() {
        return 20.0;
    }
}
