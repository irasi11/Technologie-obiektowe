package factory;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactoryTest {
    @Test
    void test1() {
        Factory factory = new CreateFactory().createFactory("processor");
        assertEquals("processor", factory.createProduct());
    }

    @Test
    void test2() {
        Factory factory = new CreateFactory().createFactory("graphicCard");
        assertEquals("graphicCard", factory.createProduct());
    }

    @Test
    void test3() {
        Factory factory = new CreateFactory().createFactory("motherboard");
        assertEquals("motherBoard", factory.createProduct());
    }

}