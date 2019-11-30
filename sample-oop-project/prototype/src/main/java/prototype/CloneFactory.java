package prototype;

public class CloneFactory {
    public Shape getClone(Shape shape){
        return shape.makeCopy();
    }
}
