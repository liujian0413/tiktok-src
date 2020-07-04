package org.webrtc.audio;

import android.content.Context;
import android.media.AudioManager;
import org.webrtc.Logging;

public class JavaExternalAudioDeviceModule implements AudioDeviceModule {
    private final AudioDeviceObserver audioDeviceObserver;
    private final WebRtcAudioDeviceObserver audioDeviceObserverInternal;
    private final AudioManager audioManager;
    private final Context context;
    private long nativeAudioDeviceModule;
    private final Object nativeLock;
    private final int playoutChannelNum;
    private final int recordChannelNum;
    private final int sampleRate;

    public static class Builder {
        private AudioDeviceObserver audioDeviceObserver;
        private final AudioManager audioManager;
        private final Context context;
        private int playoutChannelNum;
        private int recordChannelNum;
        private int sampleRate;

        public AudioDeviceModule createExternalAudioDeviceModule() {
            Logging.m150047d("JavaExternalAudioDeviceModule", "createExternalAudioDeviceModule");
            JavaExternalAudioDeviceModule javaExternalAudioDeviceModule = new JavaExternalAudioDeviceModule(this.context, this.audioManager, this.sampleRate, this.recordChannelNum, this.playoutChannelNum, this.audioDeviceObserver);
            return javaExternalAudioDeviceModule;
        }

        public Builder setAudioDeviceObserver(AudioDeviceObserver audioDeviceObserver2) {
            this.audioDeviceObserver = audioDeviceObserver2;
            return this;
        }

        private Builder(Context context2) {
            this.context = context2;
            this.audioManager = (AudioManager) context2.getSystemService("audio");
            this.sampleRate = WebRtcAudioManager.getSampleRate(this.audioManager);
        }

        public Builder setPlayoutChannelNum(int i) {
            StringBuilder sb = new StringBuilder("Playout channel number overridden to: ");
            sb.append(i);
            Logging.m150047d("JavaExternalAudioDeviceModule", sb.toString());
            this.playoutChannelNum = i;
            return this;
        }

        public Builder setRecordChannelNum(int i) {
            StringBuilder sb = new StringBuilder("record channel number overridden to: ");
            sb.append(i);
            Logging.m150047d("JavaExternalAudioDeviceModule", sb.toString());
            this.recordChannelNum = i;
            return this;
        }

        public Builder setSampleRate(int i) {
            StringBuilder sb = new StringBuilder("Sample rate overridden to: ");
            sb.append(i);
            Logging.m150047d("JavaExternalAudioDeviceModule", sb.toString());
            this.sampleRate = i;
            return this;
        }
    }

    private static native long nativeCreateExternalAudioDeviceModule(int i, int i2, int i3, WebRtcAudioDeviceObserver webRtcAudioDeviceObserver);

    private static native boolean nativePullExternalAudioFrame(long j, byte[] bArr, int i);

    private static native boolean nativePushExternalAudioFrame(long j, byte[] bArr, int i);

    public long getNativeAudioDeviceModulePointer() {
        long j;
        synchronized (this.nativeLock) {
            if (this.nativeAudioDeviceModule == 0) {
                this.nativeAudioDeviceModule = nativeCreateExternalAudioDeviceModule(this.sampleRate, this.recordChannelNum, this.playoutChannelNum, this.audioDeviceObserverInternal);
            }
            j = this.nativeAudioDeviceModule;
        }
        return j;
    }

    public void release() {
        synchronized (this.nativeLock) {
            if (this.nativeAudioDeviceModule != 0) {
                this.nativeAudioDeviceModule = 0;
            }
        }
    }

    public static Builder builder(Context context2) {
        return new Builder(context2);
    }

    public void setMicrophoneMute(boolean z) {
        StringBuilder sb = new StringBuilder("setMicrophoneMute: ");
        sb.append(z);
        Logging.m150047d("JavaExternalAudioDeviceModule", sb.toString());
    }

    public void setSpeakerMute(boolean z) {
        StringBuilder sb = new StringBuilder("setSpeakerMute: ");
        sb.append(z);
        Logging.m150047d("JavaExternalAudioDeviceModule", sb.toString());
    }

    public boolean pullExternalAudioFrame(byte[] bArr, int i) {
        if (this.nativeAudioDeviceModule != 0) {
            return nativePullExternalAudioFrame(this.nativeAudioDeviceModule, bArr, i);
        }
        Logging.m150047d("JavaExternalAudioDeviceModule", "pullExternalAudioFrame error, because external adm has benn released.");
        return false;
    }

    public boolean pushExternalAudioFrame(byte[] bArr, int i) {
        if (this.nativeAudioDeviceModule != 0) {
            return nativePushExternalAudioFrame(this.nativeAudioDeviceModule, bArr, i);
        }
        Logging.m150047d("JavaExternalAudioDeviceModule", "pushExternalAudioFrame error, because external adm has benn released.");
        return false;
    }

    private JavaExternalAudioDeviceModule(Context context2, AudioManager audioManager2, int i, int i2, int i3, AudioDeviceObserver audioDeviceObserver2) {
        this.nativeLock = new Object();
        this.context = context2;
        this.audioManager = audioManager2;
        this.sampleRate = i;
        this.recordChannelNum = i2;
        this.playoutChannelNum = i3;
        this.audioDeviceObserver = audioDeviceObserver2;
        this.audioDeviceObserverInternal = new WebRtcAudioDeviceObserver(this.audioDeviceObserver);
    }
}
