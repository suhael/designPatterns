package command;

/**
 * Created by sakhtar on 31/03/14.
 */
public class MacroCommand implements Command {

    Command[] commands;

    public MacroCommand(Command[] commands){
        this.commands = commands;
    }

    public void execute(){
        for(int i = 0; i < commands.length; i++){
            commands[i].execute();
        }
    }

    public void undo(){
        for(int i = 0; i < commands.length; i++){
            commands[i].undo();
        }
    }
}
