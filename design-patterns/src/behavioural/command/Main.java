package behavioural.command;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor =new TextEditor();
        Receiver receiver=new Receiver();

        CopyCommand copyCommand = new CopyCommand(receiver);
        textEditor.setCommand(copyCommand);
        textEditor.execute();

        PasteCommand pasteCommand = new PasteCommand(receiver);
        textEditor.setCommand(pasteCommand);
        textEditor.execute();

        CutCommand cutCommand = new CutCommand(receiver);
        textEditor.setCommand(cutCommand);
        textEditor.execute();
    }
}
