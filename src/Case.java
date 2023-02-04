import java.util.ArrayList;
import java.util.List;

public class Case implements Hardware{
    private final double price;
    private List<Hardware> components;

    public Case(double price){
        this.price = price;
        this.components = new ArrayList<Hardware>();
    }

    public void addComponent(Hardware component){
        components.add(component);
    }

    @Override
    public double getPrice() {
        double total = this.price;
        for(Hardware component: components){
            total += component.getPrice();
        }
        return total;
    }
}
