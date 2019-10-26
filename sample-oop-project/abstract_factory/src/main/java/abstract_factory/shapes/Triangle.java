package abstract_factory.shapes;

import abstract_factory.Shape;

public class Triangle implements Shape {

    public void draw() {
        System.out.println("Drawing Triangle!");
    }
    public String getShape() {
        return "triangle";
    }
}
