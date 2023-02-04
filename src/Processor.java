public class Processor implements Hardware{
    private final double price;

    public Processor(double price){
        this.price = price;
    }
    @Override
    public double getPrice(){
        return this.price;
    }
}
