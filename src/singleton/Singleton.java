package singleton;

/**
 * Created by sakhtar on 20/03/14.
 */
public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton(){};

    public static Singleton getInstance(){
        return instance;
    }
}
