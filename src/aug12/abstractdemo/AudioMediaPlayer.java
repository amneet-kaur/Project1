package aug12.abstractdemo;

public class AudioMediaPlayer extends MediaPlayer {
    @Override
    public void play() {
        System.out.println("Audio Playing");
    }

    @Override
    public void pause() {
        System.out.println("Audio Paused");
    }

    @Override
    public void stop() {
        System.out.println("Audio Stopped");
    }
}
