package adapter;

/**
 * Created by sakhtar on 01/04/14.
 */
public class SomeDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
