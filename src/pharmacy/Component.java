package pharmacy;

public class Component {
    private String name;
    private String weight;

    public int getPower() {
        return power;
    }

    private int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }


    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Component{" + "name='" + name + '\'' + ", weight='" + weight + '\'' + ", power=" + power + '}';
    }


}
