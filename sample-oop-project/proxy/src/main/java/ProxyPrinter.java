public class ProxyPrinter implements Printer {
    RealPrinter realPrinter;
    String textToPrint;

    public String print( String textToPrint) {
        if(realPrinter==null)
            realPrinter = new RealPrinter();
        return realPrinter.print(textToPrint);
    }
}
