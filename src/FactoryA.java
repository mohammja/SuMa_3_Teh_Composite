public class FactoryA implements HardwareFactory {
    public Memory createMemory(){
        return new Memory(600);
    }
    public Processor createProcessor(){
        return new Processor(780);
    }

    @Override
    public NetworkCard createNetworkCard() {
        return new NetworkCard(100);
    }

    @Override
    public GraphicsCard createGraphicsCard() {
        return new GraphicsCard(600);
    }

    @Override
    public Motherboard createMotherboard() {
        return new Motherboard(200);
    }

    @Override
    public Case createCase() {
        return new Case(170);
    }

}
