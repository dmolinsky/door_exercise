public class Main {
    public static void main(String[] args) {
        Door door = new Door(200, 90);

        door.createNewKey("Anders");
        door.createNewKey("Eva");

        door.useDoorbell();
        door.openDoor();

        System.out.println(door.toString());
    }
}