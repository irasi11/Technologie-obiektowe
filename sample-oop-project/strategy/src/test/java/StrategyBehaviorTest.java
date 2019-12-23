import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrategyBehaviorTest {
    @Test
    void test1() {
        StrategyBehavior strategy = new StrategyBehavior(new RectangleField());
        assertEquals(20, strategy.executeStrategy(4, 5), 0);
    }

    @Test
    void test2() {
        StrategyBehavior strategy = new StrategyBehavior(new RectanglePerimeter());
        assertEquals(18, strategy.executeStrategy(4, 5), 0);
    }


}