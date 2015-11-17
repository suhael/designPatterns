package factory;

/**
 * Created by sakhtar on 20/03/14.
 */
public class Main {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());

        store.orderPizza("cheese");
        store.orderPizza("veggie");

    }
}
