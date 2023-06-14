package behavioural.command;

public class CutCommand implements Command{
    private Receiver receiver;

    public CutCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.cut();
    }
}
