import java.util.ArrayList;

public class Door {
    private int height;
    private int width;
    private int area;
    private String handle;
    private boolean closed = true;
    private boolean locked = true;
    private String color;
    private String material;
    private ArrayList<Key> keys;


    Door(int height, int width) {
        this.height = height;
        this.width = width;
        this.keys = new ArrayList<Key>();
        this.handle = "Standard";
        this.area = height * width;
        this.color = "White";
        this.material = "Wood";
    }

    public void createNewKey (String owner) {
        Key newKey = new Key(owner);
        keys.add(newKey);
    }

    public void openDoor () {
        System.out.println("The door is now open.");
        this.closed = false;
    }

    public void closeDoor () {
        System.out.println("The door is now closed.");
        this.closed = true;
    }

    public void lockDoor () {
        System.out.println("The door is now locked.");
        this.locked = true;
    }

    public void unlockDoor () {
        System.out.println("The door is now unlocked.");
        this.locked = false;
    }

    public void useDoorbell () {
        System.out.println("Ring ring...");
    }

    public int getArea () {
        return area;
    }

    public int getHeight () {
        return height;
    }

    public int getWidth () {
        return width;
    }

    @Override
    public String toString() {
        return "Door{" +
                "height=" + height +
                ", width=" + width +
                ", area=" + area +
                ", handle='" + handle + '\'' +
                ", closed=" + closed +
                ", locked=" + locked +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", amount of keys='" + keys.size() + '\'' +
                '}';
    }
}
