package abstractFactory.ingredients;

/**
 * Created by sakhtar on 20/03/14.
 */
public class NyPizzaIngredientsFactory implements PizzaIngredientsFactory {

    public Sauce createSauce(){
        System.out.println("creating spicy sauce");
        return new SpicySauce();
    }
}
