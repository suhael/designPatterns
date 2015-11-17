package factory;

/**
 * Created by sakhtar on 20/03/14.
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        if(type.equalsIgnoreCase("veggie")){
            return new VeggiePizza();
        }
        if(type.equalsIgnoreCase("cheese")){
            return new CheesePizza();
        }
        return null;
    }
}
