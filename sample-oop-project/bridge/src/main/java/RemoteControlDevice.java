public class RemoteControlDevice extends Remote {
    int volume;
    int chanel;

    public RemoteControlDevice(Device device){
        super(device);
        getChanel();
        getVolume();
    }

    public RemoteControlDevice(){
        getChanel();
        getVolume();
    }

    void getVolume(){
        volume = device.getVolume();
    }

    void getChanel(){
        chanel = device.getChanel();
    }

    public void volumeUp() {
        getVolume();
        device.setVolume(volume+1);
    }

    public void volumeDown() {
        getVolume();
        device.setVolume(volume-1);
    }

    public void chanelUp() {
        getChanel();
        device.setChanel(chanel+1);
    }

    public void chanelDown() {
        getChanel();
        device.setChanel(chanel-1);
    }

    public void turnOnOff() {
        if(device.getStatus())
            device.turnOff();
        else
            device.turnOn();

    }
}
