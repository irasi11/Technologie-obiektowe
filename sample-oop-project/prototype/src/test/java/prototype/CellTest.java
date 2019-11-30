package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CellTest {
    @Test
    void test1() {
        CloneFactory cloneObj= new CloneFactory();
        Shape circle = new Circle("blue");
        Shape cloneShape = cloneObj.getClone(circle);

        assertNotEquals(cloneShape, circle);
    }
}