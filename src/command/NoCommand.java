package command;

/**
 * Created by sakhtar on 28/03/14.
 */
public class NoCommand implements Command {
    public void execute() {
        System.out.println("do nothing!!");
    }

    public void undo() {
        System.out.println("do nothing");
    }
}
