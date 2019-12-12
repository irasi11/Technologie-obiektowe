import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IteratorTest {
    @Test
    void iteratorTest() {
        String movie1 = "It";
        String movie2 = "Anabelle";
        String movie3 = "Star Wars";
        String[] movies = {"It", "Annabelle", "Star Wars"};
        ConcreteIterator<String> collection = new ConcreteIterator<String>(movies);
        Iterator<String> iter = collection.iterator();
        int i =0;
        while(iter.hasNext()){
            assertEquals(movies[i], iter.next());
            i++;
        }
    }
}