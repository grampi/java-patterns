package pl.creational.abstract_factory;

/**
 * Wzorzec nazywany jest: super-fabryka/fabryka fabryk Inna definicja: dostarcza
 * interfejs do tworzenia całych rodzin "spokrewnionych" lub zależnyc od siebie
 * obiektów bez konieczności określania ich klas rzeczywistych
 */
public class Main {

    public static void main(String[] args) {
        // decide which concrete factory use
        AbstractFactory facA = new ConcreteFactory1();
        ProductA prodA = facA.getProductA();
        ProductB prodB = facA.getProductB();

        prodA.showDescription();
        prodB.showDescription();
    }

}
