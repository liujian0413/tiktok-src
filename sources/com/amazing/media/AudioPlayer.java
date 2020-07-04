package com.amazing.media;

import android.media.MediaPlayer;
import java.io.IOException;

public class AudioPlayer {
    private MediaPlayer mMediaPlayer = new MediaPlayer();
    private String mPath;

    public boolean isPlaying() {
        return this.mMediaPlayer.isPlaying();
    }

    public void pause() {
        this.mMediaPlayer.pause();
    }

    public void play() {
        this.mMediaPlayer.start();
    }

    public void resume() {
        this.mMediaPlayer.start();
    }

    public void stop() {
        this.mMediaPlayer.stop();
    }

    public void destroy() {
        if (this.mMediaPlayer != null) {
            this.mMediaPlayer.stop();
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
        }
    }

    public boolean prepare() {
        try {
            this.mMediaPlayer.setDataSource(this.mPath);
            this.mMediaPlayer.setAudioStreamType(3);
            this.mMediaPlayer.prepare();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void setLoop(boolean z) {
        this.mMediaPlayer.setLooping(z);
    }

    public AudioPlayer(String str) {
        this.mPath = str;
    }
}
