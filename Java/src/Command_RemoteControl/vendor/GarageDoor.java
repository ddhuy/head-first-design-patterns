package Command_RemoteControl.vendor;

public class GarageDoor {
    private String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println("GarageDoor UP");
    }

    public void down() {
        System.out.println("GarageDoor DOWN");
    }

    public void stop() {
        System.out.println("GarageDoor STOP");
    }

    public void resume() {
        System.out.println("GarageDoor RESUME");
    }

    public void lightOn() {
        System.out.println("GarageDoor Light ON");
    }

    public void lightOff() {
        System.out.println("GarageDoor Light OFF");
    }
}
