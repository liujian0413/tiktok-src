package com.p280ss.avframework.engine;

import android.content.Context;
import android.media.AudioManager;
import android.util.AndroidRuntimeException;
import com.p280ss.avframework.capture.audio.AudioCapturer;
import com.p280ss.avframework.mixer.AudioMixer;
import com.p280ss.avframework.utils.JNINamespace;
import com.p280ss.avframework.utils.TEBundle;
import java.nio.Buffer;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.engine.AudioDeviceModule */
public class AudioDeviceModule extends NativeObject {
    private AudioManager mAudioManager;
    private AudioMixer mAudioMixer;
    public final Observer mObserver;

    /* renamed from: com.ss.avframework.engine.AudioDeviceModule$AudioRenderSink */
    public static class AudioRenderSink extends AudioSink {
        public void onNoData() {
        }

        public int getRenderTrackId() {
            return AudioDeviceModule.nativeRenderSinkTrackId(this.mNativeObj);
        }

        public boolean isMute() {
            return AudioDeviceModule.nativeRenderSinkIsMute(this.mNativeObj);
        }

        public synchronized void release() {
            AudioDeviceModule.nativeRenderSinkRelease(this.mNativeObj);
            setNativeObj(0);
        }

        public AudioRenderSink(long j) {
            setNativeObj(j);
        }

        public void setMute(boolean z) {
            AudioDeviceModule.nativeRenderSinkSetMute(this.mNativeObj, z);
        }

        public void setVolume(float f) {
            AudioDeviceModule.nativeRenderSinkSetVolume(this.mNativeObj, f);
        }

        public void onData(Buffer buffer, int i, int i2, int i3, long j) {
            AudioDeviceModule.nativeRenderSinkData(this.mNativeObj, buffer, i, i2, i3, j);
        }
    }

    /* renamed from: com.ss.avframework.engine.AudioDeviceModule$InteralAudioMixer */
    class InteralAudioMixer extends AudioMixer {
        public boolean enable() {
            return super.enable();
        }

        public void setEnable(boolean z) {
            super.setEnable(z);
            AudioDeviceModule.this.mObserver.onADMInfo(4, enable() ? 1 : 0, 0);
        }

        public InteralAudioMixer(long j) {
            super(j);
        }
    }

    /* renamed from: com.ss.avframework.engine.AudioDeviceModule$Observer */
    public interface Observer {
        void onADMInfo(int i, int i2, long j);
    }

    private native long nativeCreate(AudioPlayer audioPlayer, AudioCapturer audioCapturer);

    private native long nativeCreateRenderSink();

    private native void nativeEnableBuiltInAEC(boolean z);

    private native void nativeEnableEchoMode(boolean z);

    private native TEBundle nativeGetParameter();

    private native long nativeGetRenderMixer();

    private native boolean nativeIsEchoMode();

    private native boolean nativeIsEnableBuiltInAEC();

    private native boolean nativeIsExternalRecording();

    private native boolean nativeIsPlayer();

    private native boolean nativeIsRecoding();

    private native void nativeRelease();

    public static native void nativeRenderSinkData(long j, Buffer buffer, int i, int i2, int i3, long j2);

    public static native boolean nativeRenderSinkIsMute(long j);

    public static native void nativeRenderSinkRelease(long j);

    public static native void nativeRenderSinkSetMute(long j, boolean z);

    public static native void nativeRenderSinkSetVolume(long j, float f);

    public static native int nativeRenderSinkTrackId(long j);

    private native void nativeSetExternalRecording(boolean z);

    private native void nativeSetParameter(TEBundle tEBundle);

    private native void nativeSetRecordingCallback(AudioSink audioSink);

    private native int nativeStartPlayer();

    private native int nativeStartRecording();

    private native int nativeStopPlayer();

    private native int nativeStopRecording();

    public int getMode() {
        return this.mAudioManager.getMode();
    }

    public TEBundle getParameter() {
        return nativeGetParameter();
    }

    public boolean isEchoMode() {
        return nativeIsEchoMode();
    }

    public boolean isEnableBuiltInAEC() {
        return nativeIsEnableBuiltInAEC();
    }

    public boolean isExternalRecording() {
        return nativeIsExternalRecording();
    }

    public boolean isPlayer() {
        return nativeIsPlayer();
    }

    public boolean isRecording() {
        return nativeIsRecoding();
    }

    public boolean isSpeakerphoneOn() {
        return this.mAudioManager.isSpeakerphoneOn();
    }

    public int startPlayer() {
        return nativeStartPlayer();
    }

    public int startRecording() {
        return nativeStartRecording();
    }

    public int stopPlayer() {
        return nativeStopPlayer();
    }

    public int stopRecording() {
        return nativeStopRecording();
    }

    public AudioRenderSink createRenderSink() {
        return new AudioRenderSink(nativeCreateRenderSink());
    }

    public synchronized AudioMixer getRenderMixer() {
        if (this.mAudioMixer == null) {
            this.mAudioMixer = new InteralAudioMixer(nativeGetRenderMixer());
        }
        return this.mAudioMixer;
    }

    public synchronized void release() {
        if (this.mAudioMixer != null) {
            this.mAudioMixer.release();
            this.mAudioMixer = null;
        }
        nativeRelease();
        setNativeObj(0);
    }

    public void setExternalRecording(boolean z) {
        nativeSetExternalRecording(z);
    }

    public void setParameter(TEBundle tEBundle) {
        nativeSetParameter(tEBundle);
    }

    public void setRecordingCallack(AudioSink audioSink) {
        nativeSetRecordingCallback(audioSink);
    }

    public void setMode(int i) {
        this.mAudioManager.setMode(i);
    }

    public void setSpeakerphoneOn(boolean z) {
        this.mAudioManager.setSpeakerphoneOn(z);
    }

    public void enableBuiltInAEC(boolean z) {
        nativeEnableBuiltInAEC(z);
        this.mObserver.onADMInfo(2, isEnableBuiltInAEC() ? 1 : 0, 0);
    }

    public void enableEchoMode(boolean z) {
        nativeEnableEchoMode(z);
        this.mObserver.onADMInfo(3, isEchoMode() ? 1 : 0, 0);
    }

    public AudioDeviceModule(Observer observer, Context context) {
        this(null, null, observer, context);
    }

    public AudioDeviceModule(AudioCapturer audioCapturer, Observer observer, Context context) {
        this(null, audioCapturer, observer, context);
    }

    public AudioDeviceModule(AudioPlayer audioPlayer, AudioCapturer audioCapturer, Observer observer, Context context) {
        AudioManager audioManager;
        setNativeObj(nativeCreate(audioPlayer, audioCapturer));
        if (audioPlayer == null) {
            if (context != null) {
                audioManager = (AudioManager) context.getSystemService("audio");
            } else {
                audioManager = null;
            }
            this.mAudioManager = audioManager;
            if (observer == null) {
                observer = new Observer() {
                    public void onADMInfo(int i, int i2, long j) {
                    }
                };
            }
            this.mObserver = observer;
            return;
        }
        throw new AndroidRuntimeException("to support at later version");
    }
}
