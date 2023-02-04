import java.util.ArrayList;
import java.util.List;

public class Motherboard implements Hardware{
    private final double price;
    private List<Hardware> components;

    public Motherboard(double price){
        this.price = price;
        this.components = new ArrayList<Hardware>();
    }

    public void addComponents(Hardware component){
        components.add(component);
    }

    @Override
    public double getPrice() {
        double total = this.price;
        for (Hardware component : components){
            total += component.getPrice();
        }
        return total;
    }
}
