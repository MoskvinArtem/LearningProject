package learning.abstract_factory;

public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public Product_A createProductA() {
        return new Product_A2();
    }

    @Override
    public Product_B createProductB() {
        return new Product_B2();
    }
}