package decorator;

/**
 * Created by sakhtar on 19/03/14.
 */
public class Tea extends Beverage {
    public Tea(){
        description = "Tea";
    }

    public double cost() {
        return 1.99;
    }
}
