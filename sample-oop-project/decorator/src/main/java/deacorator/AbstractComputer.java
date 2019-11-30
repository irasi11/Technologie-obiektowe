package deacorator;

public abstract class AbstractComputer {
    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double price();

    @Override
    public String toString() {
        return price() + " := " +getDescription();
    }


}
