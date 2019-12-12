import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Garden {
    private List<Flower> myFlowers = new ArrayList<Flower>();
    public void plantFlower(int x, int y, Color color, String name ){
        FlowerType tree = FlyweightFlowerFactory.createTree(color, name);
        Flower newFlower = new Flower(x, y, tree);
        myFlowers.add(newFlower);
    }


    public List getForest(){
        return myFlowers;
    }

}
