package template;

/**
 * Created by sakhtar on 01/04/14.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("pour through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("add sugar and milk");
    }

    public boolean customerWantsCondiments(){
        return false;
    }
}
