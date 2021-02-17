package learning.abstract_factory;

public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public Product_A createProductA() {
        return new Product_A1();
    }

    @Override
    public Product_B createProductB() {
        return new Product_B1();
    }
}
