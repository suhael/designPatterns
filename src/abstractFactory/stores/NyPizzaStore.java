package abstractFactory.stores;


import abstractFactory.ingredients.NyPizzaIngredientsFactory;
import abstractFactory.ingredients.PizzaIngredientsFactory;
import abstractFactory.pizzas.NyCheesePizza;
import abstractFactory.pizzas.Pizza;

/**
 * Created by sakhtar on 20/03/14.
 */
public class NyPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {

        PizzaIngredientsFactory ingredientsFactory = new NyPizzaIngredientsFactory();

        if(type.equalsIgnoreCase("cheese")){
            Pizza pizza = new NyCheesePizza(ingredientsFactory);
            pizza.name = "Ny Cheese Pizza";
            return pizza;
        }
        return null;
    }
}
