package decorator;

/**
 * Created by sakhtar on 19/03/14.
 */
public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Tea();
        beverage = new Milk(beverage);
        beverage = new Sugar(beverage);

        System.out.println(beverage.getDescription() + " :" + beverage.cost());
    }
}
