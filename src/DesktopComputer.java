public class DesktopComputer {
    private Motherboard myMotherboard;
    private Case myCase;

    public DesktopComputer(Motherboard myMotherBoard, Case myCase){
        this.myMotherboard = myMotherBoard;
        this.myCase = myCase;
    }

    public double getPrice(){
        return this.myMotherboard.getPrice() + this.myCase.getPrice();
    }

}
