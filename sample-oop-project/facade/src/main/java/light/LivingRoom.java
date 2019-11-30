package light;

public class LivingRoom implements Light {

    private boolean status;

    public LivingRoom() {
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
