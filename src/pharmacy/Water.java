package pharmacy;

public class Water extends Component{
    public Water(String name, String weight, int power) {
        super(name, weight, power);
    }

    public Water(String weight) {
        this("Вода", weight, 5);
    }
}
