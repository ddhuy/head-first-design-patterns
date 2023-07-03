package Command_RemoteControl.vendor;

public class Stereo {
    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " Stereo ON");
    }

    public void off() {
        System.out.println(name + " Stereo OFF");
    }

    public void setCd() {
        System.out.println(name + " Stereo SET CD");
    }

    public void setDvd() {
        System.out.println(name + " Stereo SET DVD");
    }

    public void setRadio() {
        System.out.println(name + " Stereo SET RADIO");
    }

    public void setVolume(int volume) {
        System.out.println(name + " Stereo SET VOLUME: " + volume);
    }
}
