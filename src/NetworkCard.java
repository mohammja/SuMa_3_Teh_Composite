public class NetworkCard implements Hardware{
    private final double price;

    public NetworkCard(double price){
        this.price = price;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
