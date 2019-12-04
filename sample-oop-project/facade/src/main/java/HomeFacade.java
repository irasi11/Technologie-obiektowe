import doors.BackDoor;
import doors.Door;
import doors.FrontDoor;
import light.Hallway;
import light.Light;
import light.LivingRoom;

public class HomeFacade {
    Door frontDoor = new FrontDoor();
    Door backDoor = new BackDoor();
    Light hallwayLight = new Hallway();
    Light livingRoomLight = new LivingRoom();

    public void closeHouse(){
        frontDoor.close();
        backDoor.close();
    }

    public void openHouse(){
        frontDoor.close();
        backDoor.open();
    }

    public void turnOnLights(){
        hallwayLight.turnOn();
        livingRoomLight.turnOn();
    }

    public void turnOffLights(){
        hallwayLight.turnOff();
        livingRoomLight.turnOff();
    }

    public boolean returnDoorStatus(){
        if(!frontDoor.getStatus())
            return false;
        if(!backDoor.getStatus())
            return false;
        return true;
    }

    public boolean returnLightStatus(){
        if(!livingRoomLight.getStatus())
            return false;
        if(!hallwayLight.getStatus())
            return false;
        return true;
    }
}
