public class FactoryB implements HardwareFactory{
    public Memory createMemory(){
        return new Memory(300);
    }
    public Processor createProcessor(){
        return new Processor(600);
    }

    @Override
    public NetworkCard createNetworkCard() {
        return new NetworkCard(50);
    }

    @Override
    public GraphicsCard createGraphicsCard() {
        return new GraphicsCard(400);
    }

    @Override
    public Motherboard createMotherboard() {
        return new Motherboard(100);
    }

    @Override
    public Case createCase() {
        return new Case(60);
    }
}
