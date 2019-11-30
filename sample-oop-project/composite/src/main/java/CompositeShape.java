import java.util.LinkedList;
import java.util.List;

public class CompositeShape implements Shape {
    List<Shape> myShapes = new LinkedList<Shape>();

    public CompositeShape(){}

    public void addShape(Shape shape){
        myShapes.add(shape);
    }

    public void removeShape(Shape shape){
        myShapes.remove(shape);
    }

    public void fillShape(String color){
        for(Shape shape : myShapes){
            shape.fillShape(color);
        }
    }

    public void removeShapes(){
        myShapes.clear();
    }

}
