public interface HardwareFactory {
    Memory createMemory();
    Processor createProcessor();
    NetworkCard createNetworkCard();
    GraphicsCard createGraphicsCard();
    Motherboard createMotherboard();
    Case createCase();
}
