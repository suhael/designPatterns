package decorator;

/**
 * Created by sakhtar on 19/03/14.
 */
public class Coffee extends Beverage {

    public Coffee(){
        description = "Coffee";
    }


    public double cost() {
        return 2.59;
    }
}
