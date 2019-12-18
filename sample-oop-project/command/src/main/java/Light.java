public class Light {
    boolean on;

    public Light(){
        on = false;
    }
    public void lightOn(){
        on = true;
    }

    public void lightOff(){
        on = false;
    }

    public boolean getStatus(){
        return on;
    }
}
