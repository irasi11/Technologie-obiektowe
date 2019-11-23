package deacorator;

public class Computer extends AbstractComputer {
    public Computer () {
        description = "Computer case";
    }

    @Override
    public double price() {
        return 145.55;
    }
}
