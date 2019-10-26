package abstract_factory;

import abstract_factory.factories.AbstractFactory;
import abstract_factory.factories.FactoryProvider;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    @org.junit.jupiter.api.Test
    void test1() {
        AbstractFactory factory1 = new FactoryProvider().getFactory("normal");
        Shape shape1 = factory1.createShape("rectangle");
        assertEquals("rectangle", shape1.getShape());

        Shape shape2 = factory1.createShape("triangle");
        assertEquals("triangle", shape2.getShape());
    }

    @org.junit.jupiter.api.Test
    void test2() {
        AbstractFactory factory1 = new FactoryProvider().getFactory("rounded");
        Shape shape1 = factory1.createShape("rectangle");
        assertEquals("roundedRectangle", shape1.getShape());

        Shape shape2 = factory1.createShape("triangle");
        assertEquals("roundedTriangle", shape2.getShape());
    }
}