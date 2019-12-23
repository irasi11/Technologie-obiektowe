public class SpecificSubscriber implements Subscribe {
    private String name;
    private Channel myChannel;

    public SpecificSubscriber(String name){
        this.name = name;
    }

    public void update() {
        String msg = (String) myChannel.getUpdate(this);
        if(msg == null) {
            System.out.println(name + "// No new message!");
        } else {
            System.out.println(name + "// New message: " + msg);
        }
    }

    public void setChannel(Channel channel) {
        this.myChannel = channel;
    }
}
