package light;

import light.Light;

public class Hallway implements Light {

    private boolean status;

    public Hallway() {
        this.status = false;
    }

    public void turnOn() {
        this.status = true;
    }

    public void turnOff() {
        this.status = false;
    }

    public boolean getStatus() {
        return status;
    }
}
