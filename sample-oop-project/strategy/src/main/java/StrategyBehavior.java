public class StrategyBehavior {
    Strategy strategy;

    public StrategyBehavior(Strategy strategy){
        this.strategy = strategy;
    }

    public void chooseStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public double executeStrategy(double a, double b) {
        return strategy.execute(a, b);
    }
}
