package top.wmd001.structural.facade;

public class AudioSystem {
    public void turnOn() {
        System.out.println("Audio system is turned on.");
    }

    public void turnOff() {
        System.out.println("Audio system is turned off.");
    }

    public void setVolume(int volume) {
        System.out.println("Audio system volume set to " + volume + ".");
    }
}
