import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class FlyweightFlowerFactory {
    static Map<String, FlowerType> flowers = new HashMap<String, FlowerType>();

    public static FlowerType createTree(Color color, String name){
        FlowerType flower = flowers.get(name);
        if(flower == null){
            flower = new FlowerType(color, name);
            flowers.put(name, flower);
        }
        return flower;
    }

}
