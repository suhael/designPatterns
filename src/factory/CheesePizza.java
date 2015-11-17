package factory;

/**
 * Created by sakhtar on 20/03/14.
 */
public class CheesePizza extends Pizza {

    public void prepare() {
        super.prepare();
        System.out.println("adding extra cheese");
    }

}
