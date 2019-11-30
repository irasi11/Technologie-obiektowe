public interface Device {
    void setVolume(int volumePercent);
    int getVolume();

    void setChanel(int chanelNumber);
    int getChanel();

    void turnOn();
    void turnOff();

    boolean getStatus();

}
