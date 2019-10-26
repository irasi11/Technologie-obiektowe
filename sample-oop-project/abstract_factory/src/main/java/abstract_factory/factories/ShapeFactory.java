package abstract_factory.factories;

import abstract_factory.Shape;
import abstract_factory.shapes.Rectangle;
import abstract_factory.shapes.Triangle;

public class ShapeFactory extends AbstractFactory {
    public Shape createShape(String shape) {
        if(shape.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("triangle")){
            return new Triangle();
        }
        else
            return null;
    }
}
