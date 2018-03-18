package pl.factory_method;

public class FactoryMethodB implements Factory {

    Product productB;

    public FactoryMethodB() {
        this.productB = new ProductB();
    }

    @Override
    public Product getProduct() {
        return productB;
    }
}
