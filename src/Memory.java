public class Memory implements Hardware{
    private final double price;

    public Memory(double price){
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
