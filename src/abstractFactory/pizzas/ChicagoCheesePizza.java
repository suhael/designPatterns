package abstractFactory.pizzas;

import abstractFactory.ingredients.PizzaIngredientsFactory;

/**
 * Created by sakhtar on 20/03/14.
 */
public class ChicagoCheesePizza extends Pizza {
    private PizzaIngredientsFactory ingredientsFactory;

    public ChicagoCheesePizza(PizzaIngredientsFactory ingredientsFactory){
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    public void prepare() {
        this.sauce = ingredientsFactory.createSauce();
    }

    public void cut(){
        System.out.println("cutting square slices");
    }
}
