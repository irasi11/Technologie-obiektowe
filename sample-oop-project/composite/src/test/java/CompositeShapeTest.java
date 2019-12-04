import javafx.scene.effect.InnerShadow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompositeShapeTest {


    @Test
    void fillShapeTest() {
        Shape c1 = new Circle();
        Shape t1 = new Triangle();
        Shape c2 = new Circle();
        CompositeShape composite = new CompositeShape();
        composite.addShape(c1);
        composite.addShape(c2);
        composite.addShape(t1);
        composite.fillShape("blue");
    }
}