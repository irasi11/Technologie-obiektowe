package abstract_factory.rounded_shapes;

import abstract_factory.Shape;

public class RoundedTriangle implements Shape {

    public void draw() {
        System.out.println("Drawing Rounded Triangle!");
    }

    public String getShape() {
        return "roundedTriangle";
    }
}
