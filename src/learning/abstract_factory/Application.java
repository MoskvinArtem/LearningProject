package learning.abstract_factory;

public class Application {

    private Product_A productA;
    private Product_B productB;

    public Application (AbstractFactory factory) {
        productA = factory.createProductA();
        productB = factory.createProductB();
    }

    public void paint () {
        productA.paint();
        productB.paint();
    }
}
