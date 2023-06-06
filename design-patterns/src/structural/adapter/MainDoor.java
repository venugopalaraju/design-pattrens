package structural.adapter;
//Adaptee
public class MainDoor implements Door{
    @Override
    public void closeDoor() {
        System.out.println("Close Main Door");
    }

    @Override
    public void openDoor() {
        System.out.println("Open Main Door");
    }
}
