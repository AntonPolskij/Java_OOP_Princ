package Animals;

public class Rhino extends Animal implements Runnable{
    public Rhino(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.TYPE + " " + this.getName() + " не умеет летать");
    }

    @Override
    public double getSpeed() {
        return 40.0;
    }
}
