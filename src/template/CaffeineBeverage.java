package template;

/**
 * Created by sakhtar on 01/04/14.
 */
public abstract class CaffeineBeverage {

    public final void prepareDrink(){
        addWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void addWater(){
        System.out.println("add boiling water");
    }

    public void pourInCup(){
        System.out.println("pouring in to cup");
    }

    public boolean customerWantsCondiments(){
        return false;
    }

}
