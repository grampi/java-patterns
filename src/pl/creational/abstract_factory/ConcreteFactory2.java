package pl.creational.abstract_factory;

public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public ProductA getProductA() {
        ProductA prA2 = new ConcreteProductA2();
        return prA2;
    }

    @Override
    public ProductB getProductB() {
        ProductB prB2 = new ConcreteProductB2();
        return prB2;
    }

}
