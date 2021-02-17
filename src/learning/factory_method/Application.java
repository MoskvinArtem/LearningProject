package learning.factory_method;

public class Application {

    private Product product;

    public Application (ProductFactory factory) {
        product = factory.factoryMethod();
    }
}
