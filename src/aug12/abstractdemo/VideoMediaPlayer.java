package aug12.abstractdemo;

import aug12.abstractdemo.MediaPlayer;

public class VideoMediaPlayer extends MediaPlayer {
    @Override
    public void play() {
        System.out.println("Video Playing");
    }

    @Override
    public void pause() {
        System.out.println("Video Paused");
    }

    @Override
    public void stop() {
        System.out.println("Video Stopped");
    }
}
