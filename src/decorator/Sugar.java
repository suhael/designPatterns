package decorator;

/**
 * Created by sakhtar on 19/03/14.
 */
public class Sugar extends CondimentDecorator {

    Beverage beverage;

    public Sugar(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", sugar";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
