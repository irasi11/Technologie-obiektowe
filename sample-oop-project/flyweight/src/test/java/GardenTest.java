import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GardenTest {
    @Test
    void gardenTest() throws NoSuchMethodException {
        Garden myGarden = new Garden();
        String flower1 = "rose";
        String flower2 = "tulip";
        myGarden.plantFlower(0, 0, Color.yellow, flower1);
        myGarden.plantFlower(0, 1, Color.yellow, flower1);
        myGarden.plantFlower(0, 2, Color.blue, flower2);
        myGarden.plantFlower(0, 3, Color.blue, flower2);

        List<Flower> myFlowers = myGarden.getForest();

        assertEquals(flower1, myFlowers.get(0).getTreeName().getTreeName());
        assertEquals(flower1, myFlowers.get(1).getTreeName().getTreeName());
        assertEquals(flower2, myFlowers.get(2).getTreeName().getTreeName());
        assertEquals(flower2, myFlowers.get(3).getTreeName().getTreeName());
    }
}