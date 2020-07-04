package com.p280ss.avframework.livestreamv2.interact.controller;

import com.p280ss.avframework.livestreamv2.interact.audio.AudioClientFactory;
import com.p280ss.avframework.livestreamv2.interact.model.Config;
import com.p280ss.avframework.livestreamv2.interact.model.Region;
import com.p280ss.avframework.livestreamv2.interact.video.VideoClientFactory;
import java.util.List;

/* renamed from: com.ss.avframework.livestreamv2.interact.controller.AnchorController */
public class AnchorController extends BaseController {
    private boolean autoUpdateSei;
    public StreamMixer mStreamMixer;

    /* renamed from: com.ss.avframework.livestreamv2.interact.controller.AnchorController$StreamMixer */
    public interface StreamMixer {
        List<Region> mixStream(int i, int i2, int i3, List<Integer> list);
    }

    public void invalidateSei() {
        mixStream();
    }

    private void mixStream() {
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                List list;
                if (AnchorController.this.mStreamMixer == null) {
                    list = null;
                } else {
                    list = AnchorController.this.mStreamMixer.mixStream(AnchorController.this.mEngine.getOutputWidth(), AnchorController.this.mEngine.getOutputHeight(), AnchorController.this.mEngine.getAnchor(), AnchorController.this.mEngine.getGuestList());
                }
                if (AnchorController.this.mState == State.STARTED) {
                    AnchorController.this.mEngine.mixStream(list);
                }
            }
        });
    }

    public synchronized void end() {
        super.end();
        if (this.autoUpdateSei) {
            mixStream();
        }
    }

    public void onStartSuccess() {
        super.onStartSuccess();
        if (this.autoUpdateSei) {
            mixStream();
        }
    }

    public void setAutoUpdateSei(boolean z) {
        this.autoUpdateSei = z;
    }

    public void onUserJoined(int i) {
        super.onUserJoined(i);
        if (this.autoUpdateSei) {
            mixStream();
        }
    }

    public void onUserLeaved(int i) {
        super.onUserLeaved(i);
        if (this.autoUpdateSei) {
            mixStream();
        }
    }

    public synchronized void muteRemoteAudioStream(int i, boolean z) {
        super.muteRemoteAudioStream(i, z);
        mixStream();
    }

    public AnchorController(Config config, VideoClientFactory videoClientFactory, StreamMixer streamMixer) {
        this(config, videoClientFactory, null, streamMixer);
    }

    public AnchorController(Config config, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, StreamMixer streamMixer) {
        super(config, videoClientFactory, audioClientFactory);
        this.autoUpdateSei = true;
        this.mStreamMixer = streamMixer;
    }
}
