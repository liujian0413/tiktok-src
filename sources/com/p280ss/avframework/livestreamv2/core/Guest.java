package com.p280ss.avframework.livestreamv2.core;

import com.p280ss.avframework.livestreamv2.IInputAudioStream;
import com.p280ss.avframework.livestreamv2.IInputVideoStream;
import com.p280ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p280ss.avframework.livestreamv2.interact.audio.AudioClientFactory;
import com.p280ss.avframework.livestreamv2.interact.controller.GuestController;
import com.p280ss.avframework.livestreamv2.interact.video.VideoClientFactory;

/* renamed from: com.ss.avframework.livestreamv2.core.Guest */
public class Guest extends Client {
    private GuestController mGuestController;

    public boolean isGuest() {
        return true;
    }

    public synchronized void dispose() {
        if (this.mGuestController != null) {
            this.mGuestController = null;
        }
        super.dispose();
    }

    /* access modifiers changed from: protected */
    public void pause() {
        if (this.mGuestController != null) {
            this.mGuestController.pause();
        }
    }

    /* access modifiers changed from: protected */
    public void resume() {
        if (this.mGuestController != null) {
            this.mGuestController.resume();
        }
    }

    public void start() {
        if (this.mGuestController != null) {
            this.mGuestController.start();
        }
        super.start();
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (this.mGuestController != null) {
            this.mGuestController.end();
            this.mGuestController = null;
        }
        super.stop();
        super.dispose();
        super.finalize();
    }

    public synchronized void stop() {
        if (this.mGuestController != null) {
            this.mGuestController.end();
        }
        super.stop();
    }

    public void muteAllRemoteAudioStreams(boolean z) {
        if (this.mGuestController != null) {
            this.mGuestController.muteAllRemoteAudioStreams(z);
        }
    }

    public void switchAudio(boolean z) {
        if (this.mGuestController != null) {
            this.mGuestController.switchAudio(z);
        }
    }

    public void muteRemoteAudioStream(int i, boolean z) {
        if (this.mGuestController != null) {
            this.mGuestController.muteRemoteAudioStream(i, z);
        }
    }

    public Guest(InteractConfig interactConfig, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, IInputAudioStream iInputAudioStream, IInputVideoStream iInputVideoStream) {
        super(interactConfig, videoClientFactory, audioClientFactory, iInputAudioStream, iInputVideoStream);
        this.mGuestController = new GuestController(interactConfig, videoClientFactory, audioClientFactory);
        this.mGuestController.addDataCallback(this);
        this.mGuestController.addQualityCallback(this);
        this.mGuestController.addStateCallback(this);
        this.mGuestController.addUserCallback(this);
    }
}
