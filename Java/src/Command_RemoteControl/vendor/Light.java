package Command_RemoteControl.vendor;

public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " Light ON");
    }

    public void off() {
        System.out.println(name + " Light OFF");
    }
}
