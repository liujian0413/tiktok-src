package com.p280ss.avframework.livestreamv2.core;

import com.p280ss.avframework.livestreamv2.IInputAudioStream;
import com.p280ss.avframework.livestreamv2.IInputVideoStream;
import com.p280ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p280ss.avframework.livestreamv2.interact.audio.AudioClientFactory;
import com.p280ss.avframework.livestreamv2.interact.controller.AnchorController;
import com.p280ss.avframework.livestreamv2.interact.video.VideoClientFactory;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.avframework.livestreamv2.core.Anchor */
public class Anchor extends Client {
    private AnchorController mAnchorController;

    /* renamed from: com.ss.avframework.livestreamv2.core.Anchor$Region */
    public static class Region extends com.p280ss.avframework.livestreamv2.interact.model.Region {
        private float mVolumeCoeff = 1.0f;

        public float getVolumeCoeff() {
            return this.mVolumeCoeff;
        }

        public Region volumeCoeff(float f) {
            this.mVolumeCoeff = f;
            return this;
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.Anchor$StreamMixer */
    public interface StreamMixer {
        List<Region> mixStream(int i, int i2, int i3, List<Integer> list);
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.Anchor$StreamMixerInternal */
    class StreamMixerInternal implements com.p280ss.avframework.livestreamv2.interact.controller.AnchorController.StreamMixer {
        private StreamMixer mExternalMixer;

        public StreamMixerInternal(StreamMixer streamMixer) {
            this.mExternalMixer = streamMixer;
        }

        public List<com.p280ss.avframework.livestreamv2.interact.model.Region> mixStream(int i, int i2, int i3, List<Integer> list) {
            if (this.mExternalMixer != null) {
                List mixStream = this.mExternalMixer.mixStream(i, i2, i3, list);
                Anchor.this.mixStream(mixStream);
                if (mixStream != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(mixStream);
                    return arrayList;
                }
            }
            return null;
        }
    }

    public boolean isGuest() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void mixStream(List<Region> list) {
    }

    public void dispose() {
        if (this.mAnchorController != null) {
            this.mAnchorController = null;
        }
        super.dispose();
    }

    public void invalidateSei() {
        if (this.mAnchorController != null) {
            this.mAnchorController.invalidateSei();
        }
    }

    /* access modifiers changed from: protected */
    public void pause() {
        if (this.mAnchorController != null) {
            this.mAnchorController.pause();
        }
    }

    /* access modifiers changed from: protected */
    public void resume() {
        if (this.mAnchorController != null) {
            this.mAnchorController.resume();
        }
    }

    public void start() {
        if (this.mAnchorController != null) {
            this.mAnchorController.start();
        }
        super.start();
    }

    public void stop() {
        if (this.mAnchorController != null) {
            this.mAnchorController.end();
        }
        super.stop();
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (this.mAnchorController != null) {
            this.mAnchorController.end();
            this.mAnchorController = null;
        }
        super.stop();
        super.dispose();
        super.finalize();
    }

    public void muteAllRemoteAudioStreams(boolean z) {
        if (this.mAnchorController != null) {
            this.mAnchorController.muteAllRemoteAudioStreams(z);
        }
    }

    public void switchAudio(boolean z) {
        if (this.mAnchorController != null) {
            this.mAnchorController.switchAudio(z);
        }
    }

    public void muteRemoteAudioStream(int i, boolean z) {
        if (this.mAnchorController != null) {
            this.mAnchorController.muteRemoteAudioStream(i, z);
        }
    }

    public Anchor(InteractConfig interactConfig, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, IInputAudioStream iInputAudioStream, IInputVideoStream iInputVideoStream) {
        super(interactConfig, videoClientFactory, audioClientFactory, iInputAudioStream, iInputVideoStream);
        this.mAnchorController = new AnchorController(interactConfig, videoClientFactory, audioClientFactory, new StreamMixerInternal(interactConfig.getStreamMixer()));
        this.mAnchorController.addDataCallback(this);
        this.mAnchorController.addQualityCallback(this);
        this.mAnchorController.addStateCallback(this);
        this.mAnchorController.addUserCallback(this);
    }
}
