package learning.factory_method;

public class ConcreteCreator_2 extends ProductFactory {
    @Override
    public Product factoryMethod() {
        return new Product_2();
    }
}
