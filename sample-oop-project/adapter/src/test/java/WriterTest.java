import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WriterTest {
    @Test
    void test1() {
        String mess = "myMessage";
        int size = 1;
        Writer writer = new DataWiter();

        assertEquals(mess+size,  writer.save(mess));
    }
}