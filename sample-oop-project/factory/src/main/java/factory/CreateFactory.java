package factory;

import factory.Factory;
import products.GraphicCard;
import products.MotherBoard;
import products.Processor;

public class CreateFactory {
    public Factory createFactory(String product){
        if(product.equalsIgnoreCase("processor"))
            return new Processor();
        else if (product.equalsIgnoreCase("graphicCard"))
            return new GraphicCard();
        else if (product.equalsIgnoreCase("motherboard"))
            return new MotherBoard();
        else return null;
    }


}
