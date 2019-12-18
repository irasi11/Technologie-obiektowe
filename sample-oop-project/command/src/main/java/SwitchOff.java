public class SwitchOff implements Command {
    Light light;

    public SwitchOff(Light light){
        this.light = light;
    }

    public void execute() {
        this.light.lightOff();
    }
}
