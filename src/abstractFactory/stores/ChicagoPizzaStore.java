package abstractFactory.stores;


import abstractFactory.ingredients.ChicagoPizzaIngredientsFactory;
import abstractFactory.ingredients.PizzaIngredientsFactory;
import abstractFactory.pizzas.ChicagoCheesePizza;
import abstractFactory.pizzas.Pizza;

/**
 * Created by sakhtar on 20/03/14.
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {

        PizzaIngredientsFactory ingredientsFactory = new ChicagoPizzaIngredientsFactory();

        if(type.equalsIgnoreCase("cheese")){
            Pizza pizza = new ChicagoCheesePizza(ingredientsFactory);
            pizza.name = "Chicago Cheese Pizza";
            return pizza;
        }
        return null;
    }
}
