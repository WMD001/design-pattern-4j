package top.wmd001.structural.facade;

public class VideoSystem {
public void turnOn() {
    System.out.println("Video system is turned on.");
}

public void turnOff() {
    System.out.println("Video system is turned off.");
}

public void playVideo(String video) {
    System.out.println("Video system is playing: " + video + ".");
}
}