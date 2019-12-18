public class RemoteControl {
    Command command;

    public RemoteControl(Command command){
        this.command = command;
    }


    void buttonFunction(Command command){
        this.command = command;
    }

    void pressButton(){
        command.execute();
    }
}
