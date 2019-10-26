package abstract_factory.factories;

public class FactoryProvider {
    public static AbstractFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("rounded"))
            return new RoundedShapeFactory();
        else if (factory.equalsIgnoreCase("normal"))
            return new ShapeFactory();
        else return null;
    }
}
