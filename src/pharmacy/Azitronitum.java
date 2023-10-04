package pharmacy;

public class Azitronitum extends Component{
    public Azitronitum(String name, String weight, int power) {
        super(name, weight, power);
    }

    public Azitronitum(String weight) {
        this("Азитронит", weight, 15);
    }
}
