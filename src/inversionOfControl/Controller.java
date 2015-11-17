package inversionOfControl;

/**
 * Created by sakhtar on 19/02/2015.
 */
public interface Controller {
    Response processRequest(Request request);
    void addHandler(Request request, RequestHandler requestHandler);
}
