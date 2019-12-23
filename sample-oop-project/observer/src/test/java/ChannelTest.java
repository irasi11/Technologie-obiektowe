import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChannelTest {
       @Test
    void youtubeTest() {
           MyChannel myChannel = new MyChannel();

           List<SpecificSubscriber> subs = new ArrayList<SpecificSubscriber>();
           subs.add(new SpecificSubscriber("Sub1"));
           subs.add(new SpecificSubscriber("Sub2"));
           subs.add(new SpecificSubscriber("Sub3"));

           for(SpecificSubscriber i : subs){
                  myChannel.addSubscribe(i);
           }

           for(SpecificSubscriber i: subs){
                  i.setChannel(myChannel);
           }

           myChannel.postMessage("new video has been added");
    }
}