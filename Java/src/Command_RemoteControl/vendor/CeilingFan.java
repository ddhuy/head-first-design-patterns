package Command_RemoteControl.vendor;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private String name;
    private int speed;

    public CeilingFan(String name) {
        this.name = name;
        this.speed = OFF;
    }

    public void on() {
        System.out.println(name + " Ceiling Fan ON");
    }

    public void off() {
        System.out.println(name + " Ceiling Fan OFF");
    }

    public void high() {
        speed = HIGH;
        System.out.println(name + " Ceiling Fan Speed HIGH");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(name + " Ceiling Fan Speed MEDIUM");
    }

    public void low() {
        speed = LOW;
        System.out.println(name + " Ceiling Fan Speed LOW");
    }

    public int getSpeed() {
        return speed;
    }
}
