package abstract_factory.rounded_shapes;

import abstract_factory.Shape;

public class RoundedRectagle implements Shape {

    public void draw() {
        System.out.println("Drawing Rounded Rectangle!");
    }

    public String getShape() {
        return "roundedRectangle";
    }
}
