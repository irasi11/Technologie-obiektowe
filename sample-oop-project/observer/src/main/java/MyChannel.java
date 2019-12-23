import java.util.ArrayList;
import java.util.List;

public class MyChannel implements Channel {

    private boolean changed;
    private String message;
    private List<Subscribe> subscribersList;

    public MyChannel(){
        subscribersList = new ArrayList<Subscribe>();
    }

    public void addSubscribe(Subscribe subscriber) {
        if(subscriber == null) throw new NullPointerException("Null Pointer Exception!");
        if(!subscribersList.contains(subscriber)) {
            subscribersList.add(subscriber);
        }
    }

    public void removeSubscribe(Subscribe subscriber) {
        if(subscriber == null) throw new NullPointerException("Null Pointer Exception!");
        if(subscribersList.contains(subscriber)) {
            subscribersList.remove(subscriber);
        }
    }

    public void notifySubscribers() {
        if(!changed)
            return;
        this.changed = false;
        for(Subscribe sub : subscribersList) {
            sub.update();

        }
    }

    public Object getUpdate(Subscribe subscriber){
        return this.message;
    }

    public void postMessage(String message) {
        System.out.println("Message: " + message);
        this.message = message;
        this.changed = true;
        notifySubscribers();
    }

}
