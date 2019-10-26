package products;

import factory.Factory;

public class GraphicCard implements Factory {


    public String createProduct() {
        return "graphicCard";
    }
}
