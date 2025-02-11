package top.wmd001.structural.facade;

public class MultimediaFacade {
    private AudioSystem audioSystem;
    private VideoSystem videoSystem;
    private Projector projector;

    public MultimediaFacade() {
        this.audioSystem = new AudioSystem();
        this.videoSystem = new VideoSystem();
        this.projector = new Projector();
    }

    // 提供简化接口：启动多媒体系统
    public void startMovie(String video) {
        System.out.println("Starting the movie...");
        audioSystem.turnOn();
        audioSystem.setVolume(10);
        videoSystem.turnOn();
        videoSystem.playVideo(video);
        projector.turnOn();
        projector.setInput("HDMI");
    }

    // 提供简化接口：关闭多媒体系统
    public void endMovie() {
        System.out.println("Ending the movie...");
        audioSystem.turnOff();
        videoSystem.turnOff();
        projector.turnOff();
    }
}
