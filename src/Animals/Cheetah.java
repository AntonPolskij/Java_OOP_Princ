package Animals;

public class Cheetah extends Animal implements Runnable{

    public Cheetah(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.TYPE + " " + this.getName() + " не умеет летать");
    }

    @Override
    public double getSpeed() {
        return 130.0;
    }
}
