package structural.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        MainDoor door = new MainDoor();
        DoorAdapter doorAdapter = new DoorAdapter(door);
        doorAdapter.openDoor();
        doorAdapter.closeDoor();
    }
}
