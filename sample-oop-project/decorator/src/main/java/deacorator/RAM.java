package deacorator;

public class RAM extends AbstractComputerDecorator{

    public RAM (AbstractComputer computer) {
        super(computer);
    }

    public String getDescription() {
        return computer.getDescription() + ", 16 GB RAM";
    }

    public double price() {
        return computer.price() + 324.54;
    }
}
