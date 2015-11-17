package command;

/**
 * Created by sakhtar on 31/03/14.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo(){
        light.on();
    }
}
