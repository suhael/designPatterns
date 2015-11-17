package adapter;

/**
 * Created by sakhtar on 01/04/14.
 */
public class Main {
    public static void main(String[] args) {

        Duck duck = new SomeDuck();
        duck.quack();
        duck.fly();

        Turkey turkey = new SomeTurkey();
        turkey.gobble();
        turkey.fly();

        Duck turkeyDuck = new TurkeyAdapter(turkey);
        turkeyDuck.quack();
        turkeyDuck.fly();
    }

}
