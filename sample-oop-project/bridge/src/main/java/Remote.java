public abstract class Remote {
    protected Device device;

    public Remote(){};

    public Remote(Device device){
        this.device = device;
    }

    public abstract void volumeUp();
    public abstract void volumeDown();
    public abstract void chanelUp();
    public abstract void chanelDown();
    public abstract void turnOnOff();
}
