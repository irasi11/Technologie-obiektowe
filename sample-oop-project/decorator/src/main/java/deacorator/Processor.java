package deacorator;

public class Processor extends AbstractComputerDecorator {
    public Processor(AbstractComputer computer) {
        super(computer);
    }

    public String getDescription() {
        return computer.getDescription() + ", processor Intel Core i7";
    }

    public double price() {
        return computer.price() + 756.33;
    }
}
