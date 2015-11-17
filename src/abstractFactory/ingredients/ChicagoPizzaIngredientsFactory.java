package abstractFactory.ingredients;

/**
 * Created by sakhtar on 20/03/14.
 */
public class ChicagoPizzaIngredientsFactory implements PizzaIngredientsFactory {

    public Sauce createSauce(){
        System.out.println("creating herb sauce");
        return new HerbSauce();
    }
}
