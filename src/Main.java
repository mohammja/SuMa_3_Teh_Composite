public class Main {

    public static void main(String[] args) {

        //This was the first composite pattern
        Motherboard motherBoard = new Motherboard(1000);
        Hardware processor = new Processor(600);
        Hardware networkCard = new NetworkCard(50);
        Hardware graphicsCard = new GraphicsCard(800);
        Hardware memory = new Memory(300);

        motherBoard.addComponents(processor);
        motherBoard.addComponents(graphicsCard);
        motherBoard.addComponents(memory);
        motherBoard.addComponents(networkCard);

        Case myCase = new Case(120);

        DesktopComputer myComputer = new DesktopComputer(motherBoard, myCase);
        System.out.println("Total price for this PC: " + myComputer.getPrice() + " €");

//
//        //This is the composite pattern using abstract factory
//        HardwareFactory factoryA = new FactoryA();
//        HardwareFactory factoryB = new FactoryB();
//
//        Hardware firstCase = factoryA.createCase();
//
//        Motherboard firstMB = factoryA.createMotherboard();
//        firstMB.addComponents(factoryA.createMemory());
//        firstMB.addComponents(factoryA.createGraphicsCard());
//        firstMB.addComponents(factoryA.createProcessor());
//        firstMB.addComponents(factoryA.createNetworkCard());
//
//        DesktopComputer firstPC = new DesktopComputer(firstMB, (Case) firstCase);
//        System.out.println("Total price if you buy from the factory A: " + firstPC.getPrice() + " €");
//
//        Hardware secondCase = factoryB.createCase();
//
//        Motherboard secondMB = factoryB.createMotherboard();
//        secondMB.addComponents(factoryB.createMemory());
//        secondMB.addComponents(factoryB.createGraphicsCard());
//        secondMB.addComponents(factoryB.createProcessor());
//        secondMB.addComponents(factoryB.createNetworkCard());
//
//        DesktopComputer secondPC = new DesktopComputer(secondMB, (Case) secondCase);
//        System.out.println("Total price if you buy from the factory B: " + secondPC.getPrice() + " €");
    }
}