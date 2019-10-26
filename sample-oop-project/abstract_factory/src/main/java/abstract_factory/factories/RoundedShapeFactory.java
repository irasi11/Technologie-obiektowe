package abstract_factory.factories;

import abstract_factory.Shape;
import abstract_factory.rounded_shapes.RoundedRectagle;
import abstract_factory.rounded_shapes.RoundedTriangle;

public class RoundedShapeFactory extends AbstractFactory {

    public Shape createShape(String shape) {
        if(shape.equalsIgnoreCase("Rectangle"))
            return new RoundedRectagle();
        else if(shape.equalsIgnoreCase("Triangle"))
            return new RoundedTriangle();
        else return null;
    }
}
