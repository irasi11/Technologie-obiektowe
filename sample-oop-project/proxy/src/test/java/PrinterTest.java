import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {
    @Test
    void printerTest() {
        String textToPrint = "my text to print";
        Printer myPrinter = new ProxyPrinter();
        assertEquals(textToPrint, myPrinter.print(textToPrint));
    }
}