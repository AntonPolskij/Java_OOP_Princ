package pharmacy;

public class Penicilin extends Component{
    public Penicilin(String name, String weight, int power) {
        super(name, weight, power);
    }

    public Penicilin(String weight) {
        this("Пеницилин", weight, 6);
    }
}
