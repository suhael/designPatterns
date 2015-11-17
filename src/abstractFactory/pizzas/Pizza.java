package abstractFactory.pizzas;

import abstractFactory.ingredients.Sauce;

/**
 * Created by sakhtar on 20/03/14.
 */
public abstract class Pizza {

    public String name;
    public Sauce sauce;

    public abstract void prepare();

    public void bake() {
        System.out.println("baking pizza");
    }

    public void cut() {
        System.out.println("cutting pizza");
    }

    public void box() {
        System.out.println("boxing pizza");
    }

    public String getName() {
        return name;
    }
}
