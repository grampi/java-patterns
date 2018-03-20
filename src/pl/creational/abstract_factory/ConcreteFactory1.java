package pl.creational.abstract_factory;

public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public ProductA getProductA() {
        ProductA prA1 = new ConcreteProductA1();
        return prA1;
    }

    @Override
    public ProductB getProductB() {
        ProductB prB1 = new ConcreteProductB1();
        return prB1;
    }

}
