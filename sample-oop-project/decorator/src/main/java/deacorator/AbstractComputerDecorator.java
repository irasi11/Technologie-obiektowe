package deacorator;

public abstract class AbstractComputerDecorator extends AbstractComputer{

    protected AbstractComputer computer;

    public AbstractComputerDecorator(AbstractComputer computer) {
        this.computer = computer;
    }

    @Override
    public abstract String getDescription();
}
