package learning.factory_method;

public abstract class ProductFactory {

    public abstract Product factoryMethod();

    public String someOperation() {

        Product product = factoryMethod();
        String result = "This creator has just worked with " + product.operation();
        return result;
    }
}
