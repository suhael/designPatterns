package adapter;

/**
 * Created by sakhtar on 01/04/14.
 */
public class SomeTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble");
    }

    @Override
    public void fly() {
        System.out.println("cant fly");
    }
}
