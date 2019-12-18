import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandTest {
    Light light = new Light();

    @Test
    void lightOnTest() {
        RemoteControl remoteControl = new RemoteControl(new SwitchOn(light));
        remoteControl.pressButton();
        assertEquals(true, light.getStatus());
    }

    @Test
    void lightOffTest() {
        RemoteControl remoteControl = new RemoteControl(new SwitchOff(light));
        remoteControl.pressButton();
        assertEquals(false, light.getStatus());
    }
}