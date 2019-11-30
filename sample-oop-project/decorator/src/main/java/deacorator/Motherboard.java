package deacorator;

public class Motherboard extends AbstractComputerDecorator {
    public Motherboard (AbstractComputer computer){
        super(computer);
    }

    public String getDescription() {
        return this.getDescription() +  ", motherboard Asus";
    }

    public double price() {
        return computer.price() + 243.55;
    }
}
