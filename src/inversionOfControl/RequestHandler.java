package inversionOfControl;

/**
 * Created by sakhtar on 19/02/2015.
 */
public interface RequestHandler {
    Response process(Request request) throws Exception;
}
