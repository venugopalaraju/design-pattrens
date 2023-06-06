package structural.adapter;

public class DoorAdapter implements Door{
    private MainDoor mainDoor;

    public DoorAdapter(MainDoor mainDoor) {
        this.mainDoor = mainDoor;
    }

    @Override
    public void closeDoor() {
        mainDoor.closeDoor();
        System.out.println("Close Mess Door");
    }

    @Override
    public void openDoor() {
        System.out.println("Open Mess Door");
        mainDoor.openDoor();
    }
}
