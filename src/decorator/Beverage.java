package decorator;

/**
 * Created by sakhtar on 19/03/14.
 */
public abstract class Beverage {


    String description = "Unknown beverage";


    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
