package template;

/**
 * Created by sakhtar on 01/04/14.
 */
public class Main {
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();

        tea.prepareDrink();
        coffee.prepareDrink();
    }
}
