package learning.factory_method;

public class ConcreteCreator_1 extends ProductFactory {
    @Override
    public Product factoryMethod() {
        return new Product_1();
    }
}
