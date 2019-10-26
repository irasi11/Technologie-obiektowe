package abstract_factory.shapes;

import abstract_factory.Shape;

public class Rectangle implements Shape {

    public void draw() {
        System.out.println("Drawing Rectangle!");
    }
    public String getShape() {
        return "rectangle";
    }
}
