package doors;

import doors.Door;

public class FrontDoor implements Door {
    //status 0 - open, 1 - closed
    private boolean status;

    public FrontDoor(){
        status = false;
    }

    public void open() {
        status = false;
    }

    public void close() {
        status = true;
    }

    public boolean getStatus() {
        return status;
    }
}
