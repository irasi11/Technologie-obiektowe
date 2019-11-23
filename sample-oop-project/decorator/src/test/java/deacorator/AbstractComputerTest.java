package deacorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractComputerTest {
    @Test
    void test1() {

        AbstractComputer computer = new Computer();
        String des = computer.getDescription();
        assertEquals(des, computer.getDescription());
        computer = new Motherboard(computer);
        computer = new Processor(computer);
        double price = 1145.43;
        assertEquals(price, computer.price());



    }
}