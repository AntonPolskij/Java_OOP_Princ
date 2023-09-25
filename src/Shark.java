public class Shark extends Animal{
    public Shark(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.TYPE + " " + this.getName() + " не умеет летать");
    }
}
