public class SwitchOn implements Command {
    Light light;

    public SwitchOn(Light light){
        this.light = light;
    }

    public void execute() {
        light.lightOn();
    }
}
