package command;

/**
 * Created by sakhtar on 28/03/14.
 */
public interface Command {
    public void execute();
    public void undo();
}
