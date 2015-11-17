package abstractFactory.stores;

import abstractFactory.pizzas.Pizza;

/**
 * Created by sakhtar on 20/03/14.
 */
public abstract class PizzaStore {


    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
