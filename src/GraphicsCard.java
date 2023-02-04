public class GraphicsCard implements Hardware{
    private final double price;

    public GraphicsCard (double price){
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
