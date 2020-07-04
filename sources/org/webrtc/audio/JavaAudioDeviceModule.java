package org.webrtc.audio;

import android.content.Context;
import android.media.AudioManager;
import org.webrtc.JniCommon;
import org.webrtc.Logging;

public class JavaAudioDeviceModule implements AudioDeviceModule {
    private final WebRtcAudioRecord audioInput;
    private final AudioManager audioManager;
    private final WebRtcAudioTrack audioOutput;
    private final Context context;
    private long nativeAudioDeviceModule;
    private final Object nativeLock;
    private final int sampleRate;
    private final boolean useStereoInput;
    private final boolean useStereoOutput;

    public interface AudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }

        public AudioSamples(int i, int i2, int i3, byte[] bArr) {
            this.audioFormat = i;
            this.channelCount = i2;
            this.sampleRate = i3;
            this.data = bArr;
        }
    }

    public interface AudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    public static class Builder {
        private final AudioManager audioManager;
        private AudioRecordErrorCallback audioRecordErrorCallback;
        private int audioSource;
        private AudioTrackErrorCallback audioTrackErrorCallback;
        private final Context context;
        private int sampleRate;
        private SamplesReadyCallback samplesReadyCallback;
        private boolean useHardwareAcousticEchoCanceler;
        private boolean useHardwareNoiseSuppressor;
        private boolean useStereoInput;
        private boolean useStereoOutput;

        public AudioDeviceModule createAudioDeviceModule() {
            Logging.m150047d("JavaAudioDeviceModule", "createAudioDeviceModule");
            if (this.useHardwareNoiseSuppressor) {
                Logging.m150047d("JavaAudioDeviceModule", "HW NS will be used.");
            } else {
                if (JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()) {
                    Logging.m150047d("JavaAudioDeviceModule", "Overriding default behavior; now using WebRTC NS!");
                }
                Logging.m150047d("JavaAudioDeviceModule", "HW NS will not be used.");
            }
            if (this.useHardwareAcousticEchoCanceler) {
                Logging.m150047d("JavaAudioDeviceModule", "HW AEC will be used.");
            } else {
                if (JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()) {
                    Logging.m150047d("JavaAudioDeviceModule", "Overriding default behavior; now using WebRTC AEC!");
                }
                Logging.m150047d("JavaAudioDeviceModule", "HW AEC will not be used.");
            }
            WebRtcAudioRecord webRtcAudioRecord = new WebRtcAudioRecord(this.context, this.audioManager, this.audioSource, this.audioRecordErrorCallback, this.samplesReadyCallback, this.useHardwareAcousticEchoCanceler, this.useHardwareNoiseSuppressor);
            WebRtcAudioRecord webRtcAudioRecord2 = webRtcAudioRecord;
            JavaAudioDeviceModule javaAudioDeviceModule = new JavaAudioDeviceModule(this.context, this.audioManager, webRtcAudioRecord2, new WebRtcAudioTrack(this.context, this.audioManager, this.audioTrackErrorCallback), this.sampleRate, this.useStereoInput, this.useStereoOutput);
            return javaAudioDeviceModule;
        }

        public Builder setAudioRecordErrorCallback(AudioRecordErrorCallback audioRecordErrorCallback2) {
            this.audioRecordErrorCallback = audioRecordErrorCallback2;
            return this;
        }

        public Builder setAudioSource(int i) {
            this.audioSource = i;
            return this;
        }

        public Builder setAudioTrackErrorCallback(AudioTrackErrorCallback audioTrackErrorCallback2) {
            this.audioTrackErrorCallback = audioTrackErrorCallback2;
            return this;
        }

        public Builder setSamplesReadyCallback(SamplesReadyCallback samplesReadyCallback2) {
            this.samplesReadyCallback = samplesReadyCallback2;
            return this;
        }

        public Builder setUseStereoInput(boolean z) {
            this.useStereoInput = z;
            return this;
        }

        public Builder setUseStereoOutput(boolean z) {
            this.useStereoOutput = z;
            return this;
        }

        public Builder setSampleRate(int i) {
            StringBuilder sb = new StringBuilder("Sample rate overridden to: ");
            sb.append(i);
            Logging.m150047d("JavaAudioDeviceModule", sb.toString());
            this.sampleRate = i;
            return this;
        }

        public Builder setUseHardwareAcousticEchoCanceler(boolean z) {
            if (z && !JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()) {
                Logging.m150048e("JavaAudioDeviceModule", "HW AEC not supported");
                z = false;
            }
            this.useHardwareAcousticEchoCanceler = z;
            return this;
        }

        public Builder setUseHardwareNoiseSuppressor(boolean z) {
            if (z && !JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()) {
                Logging.m150048e("JavaAudioDeviceModule", "HW NS not supported");
                z = false;
            }
            this.useHardwareNoiseSuppressor = z;
            return this;
        }

        private Builder(Context context2) {
            this.audioSource = 7;
            this.useHardwareAcousticEchoCanceler = JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported();
            this.useHardwareNoiseSuppressor = JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported();
            this.context = context2;
            this.audioManager = (AudioManager) context2.getSystemService("audio");
            this.sampleRate = WebRtcAudioManager.getSampleRate(this.audioManager);
        }
    }

    public interface SamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    private static native long nativeCreateAudioDeviceModule(Context context2, AudioManager audioManager2, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i, boolean z, boolean z2);

    public static boolean isBuiltInAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.isAcousticEchoCancelerSupported();
    }

    public static boolean isBuiltInNoiseSuppressorSupported() {
        return WebRtcAudioEffects.isNoiseSuppressorSupported();
    }

    public void release() {
        synchronized (this.nativeLock) {
            if (this.nativeAudioDeviceModule != 0) {
                JniCommon.nativeReleaseRef(this.nativeAudioDeviceModule);
                this.nativeAudioDeviceModule = 0;
            }
        }
    }

    public long getNativeAudioDeviceModulePointer() {
        long j;
        synchronized (this.nativeLock) {
            if (this.nativeAudioDeviceModule == 0) {
                this.nativeAudioDeviceModule = nativeCreateAudioDeviceModule(this.context, this.audioManager, this.audioInput, this.audioOutput, this.sampleRate, this.useStereoInput, this.useStereoOutput);
            }
            j = this.nativeAudioDeviceModule;
        }
        return j;
    }

    public static Builder builder(Context context2) {
        return new Builder(context2);
    }

    public void setMicrophoneMute(boolean z) {
        StringBuilder sb = new StringBuilder("setMicrophoneMute: ");
        sb.append(z);
        Logging.m150047d("JavaAudioDeviceModule", sb.toString());
        this.audioInput.setMicrophoneMute(z);
    }

    public void setSpeakerMute(boolean z) {
        StringBuilder sb = new StringBuilder("setSpeakerMute: ");
        sb.append(z);
        Logging.m150047d("JavaAudioDeviceModule", sb.toString());
        this.audioOutput.setSpeakerMute(z);
    }

    private JavaAudioDeviceModule(Context context2, AudioManager audioManager2, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i, boolean z, boolean z2) {
        this.nativeLock = new Object();
        this.context = context2;
        this.audioManager = audioManager2;
        this.audioInput = webRtcAudioRecord;
        this.audioOutput = webRtcAudioTrack;
        this.sampleRate = i;
        this.useStereoInput = z;
        this.useStereoOutput = z2;
    }
}
