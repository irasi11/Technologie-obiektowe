import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoteTest {
    @Test
    void remoteControlTvVolumeUpTest() {
        Device dev = new TV();
        Remote remoteControl = new RemoteControlDevice(dev);
        int volume = dev.getVolume();
        remoteControl.volumeUp();
        assertEquals(volume + 1, dev.getVolume());
    }

    @Test
    void remoteControlTvVolumeDownTest() {
        Device dev = new TV();
        Remote remoteControl = new RemoteControlDevice(dev);
        int volume = dev.getVolume();
        remoteControl.volumeDown();
        assertEquals(volume - 1, dev.getVolume());
    }

    @Test
    void remoteControlTvChanelUpTest() {
        Device dev = new TV();
        Remote remoteControl = new RemoteControlDevice(dev);
        int chanel = dev.getChanel();
        remoteControl.chanelUp();
        assertEquals(chanel + 1, dev.getChanel());
    }

    @Test
    void remoteControlTvChanelDownTest() {
        Device dev = new TV();
        Remote remoteControl = new RemoteControlDevice(dev);
        int chanel = dev.getChanel();
        remoteControl.chanelDown();
        assertEquals(chanel - 1, dev.getChanel());
    }
}