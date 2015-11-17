package abstractFactory.pizzas;

import abstractFactory.ingredients.PizzaIngredientsFactory;

/**
 * Created by sakhtar on 20/03/14.
 */
public class NyCheesePizza extends Pizza {

    private PizzaIngredientsFactory ingredientsFactory;

    public NyCheesePizza(PizzaIngredientsFactory ingredientsFactory){
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    public void prepare() {
        this.sauce = ingredientsFactory.createSauce();
    }
}
