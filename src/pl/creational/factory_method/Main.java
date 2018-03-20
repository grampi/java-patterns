package pl.creational.factory_method;

/**
 * Factory method definiuje interfejs (lub klasę abstrakcyjną) dla produktu i fabryki,
 * konkretny produkt jest tworzony w konkretnej fabryce (fabryka ukrywa przed klientem szczegóły tworzenia produktu)
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product prod;
        Factory fac;

        //decide which implementation of factory to use...
        fac = new FactoryMethodA();
        prod = fac.getProduct();
        prod.printDescription();
    }

}
