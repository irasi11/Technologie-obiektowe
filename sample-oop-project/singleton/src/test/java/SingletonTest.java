import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {
    @Test
    void test1() {
        Singleton singleton1 = Singleton.createInstance();
        Singleton singleton2 = Singleton.createInstance();
        assertEquals(singleton1, singleton2);

    }
}