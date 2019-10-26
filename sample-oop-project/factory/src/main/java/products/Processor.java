package products;

import factory.Factory;

public class Processor implements Factory {

    public String createProduct() {
        return "processor";
    }
}
