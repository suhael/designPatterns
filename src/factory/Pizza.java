package factory;

/**
 * Created by sakhtar on 20/03/14.
 */
public abstract class Pizza {

    public void prepare() {
        System.out.println("Preparing pizza");
    }

    public void bake() {
        System.out.println("baking pizza");
    }

    public void cut() {
        System.out.println("cutting pizza");
    }

    public void box() {
        System.out.println("boxing pizza");
    }

}
