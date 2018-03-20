package pl.creational.factory_method;

public class FactoryMethodA implements Factory {

    Product productA;

    public FactoryMethodA() {
        this.productA = new ProductA();
    }

    @Override
    public Product getProduct() {
        return productA;
    }
}
