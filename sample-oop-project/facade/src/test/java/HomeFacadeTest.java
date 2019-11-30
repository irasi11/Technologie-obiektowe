import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeFacadeTest {
    @Test
    void openHomeSystemTest() {
        HomeFacade home = new HomeFacade();
        home.openHouse();
        assertEquals(false, home.returnDoorStatus());
    }

    @Test
    void closeHomeSystemTest() {
        HomeFacade home = new HomeFacade();
        home.closeHouse();
        assertEquals(true, home.returnDoorStatus());
    }

    @Test
    void lightOnHomeSystemTest() {
        HomeFacade home = new HomeFacade();
        home.turnOnLights();
        assertEquals(true, home.returnLightStatus());
    }

    @Test
    void lightOffHomeSystemTest() {
        HomeFacade home = new HomeFacade();
        home.turnOffLights();
        assertEquals(false, home.returnLightStatus());
    }
}