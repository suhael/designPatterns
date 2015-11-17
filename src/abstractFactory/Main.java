package abstractFactory;

import abstractFactory.stores.ChicagoPizzaStore;
import abstractFactory.stores.NyPizzaStore;

/**
 * Created by sakhtar on 20/03/14.
 */
public class Main {

    public static void main(String[] args) {
        NyPizzaStore nyPizzaStore = new NyPizzaStore();
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        nyPizzaStore.orderPizza("cheese");
        chicagoPizzaStore.orderPizza("cheese");
    }
}
