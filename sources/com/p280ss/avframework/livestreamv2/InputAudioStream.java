package com.p280ss.avframework.livestreamv2;

import android.os.Handler;
import com.p280ss.avframework.capture.audio.AudioCapturer.AudioCaptureObserver;
import com.p280ss.avframework.engine.AudioTrack;
import com.p280ss.avframework.engine.MediaEngineFactory;
import com.p280ss.avframework.livestreamv2.capture.AudioCapturerExternal;
import com.p280ss.avframework.mixer.AudioMixer.AudioMixerDescription;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.InputAudioStream */
class InputAudioStream implements AudioCaptureObserver, IInputAudioStream {
    private AudioCapturerExternal mAudioCapturer;
    private AudioMixerDescription mAudioMixerDescription = new AudioMixerDescription();
    private AudioTrack mAudioTrack;
    private int mChannel;
    private Handler mHandler;
    private Observer mObserver;
    private int mSample;

    /* renamed from: com.ss.avframework.livestreamv2.InputAudioStream$Observer */
    public interface Observer {
        void releaseInputStream(InputAudioStream inputAudioStream);
    }

    public AudioTrack getAudioTrack() {
        return this.mAudioTrack;
    }

    public int getChannel() {
        return this.mChannel;
    }

    public AudioMixerDescription getMixerDescription() {
        return this.mAudioMixerDescription;
    }

    public int getSample() {
        return this.mSample;
    }

    public void onAudioCaptureError(int i, Exception exc) {
    }

    public String name() {
        if (this.mAudioTrack != null) {
            return this.mAudioTrack.mo109133id();
        }
        return "";
    }

    public int start() {
        if (this.mAudioCapturer != null) {
            this.mAudioCapturer.start();
        }
        return 0;
    }

    public int stop() {
        if (this.mAudioCapturer != null) {
            this.mAudioCapturer.stop();
        }
        return 0;
    }

    public synchronized void release() {
        stop();
        if (this.mObserver != null) {
            this.mObserver.releaseInputStream(this);
        }
        if (this.mAudioCapturer != null) {
            this.mAudioCapturer.release();
            this.mAudioCapturer = null;
        }
        if (this.mAudioTrack != null) {
            this.mAudioTrack.release();
            this.mAudioTrack = null;
        }
    }

    public void setMixerDescription(AudioMixerDescription audioMixerDescription) {
        if (audioMixerDescription != null) {
            this.mAudioMixerDescription = audioMixerDescription;
        }
    }

    public InputAudioStream(MediaEngineFactory mediaEngineFactory, Observer observer, int i, int i2, Handler handler) {
        AudioCapturerExternal audioCapturerExternal = new AudioCapturerExternal(i, i2, 16, handler, this);
        this.mAudioCapturer = audioCapturerExternal;
        this.mAudioTrack = mediaEngineFactory.createAudioTrack(this.mAudioCapturer);
        this.mObserver = observer;
        this.mSample = i;
        this.mChannel = i2;
        this.mHandler = handler;
    }

    public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        if (this.mAudioCapturer != null) {
            return this.mAudioCapturer.pushAudioFrame(byteBuffer, i, i2, i3, i4, j);
        }
        return -1;
    }
}
