public class TV implements Device{
    private int volume;
    private int chanel;
    private boolean status;

    public TV(){
        volume = 20;
        chanel = 1;
        status = false;
    }

    public void setVolume(int volumePercent) {
        if(volume >= 100)
            volume = 100;

        if(volume <= 0)
            volume = 0;

        volume = volumePercent;
    }

    public int getVolume() {
        return volume;
    }

    public void setChanel(int chanelNumber) {
        chanel = chanelNumber;
    }

    public int getChanel() {
        return chanel;
    }

    public void turnOn() {
        status = true;
    }

    public void turnOff() {
        status = false;
    }

    public boolean getStatus() {
        return false;
    }
}
