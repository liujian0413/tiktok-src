package com.p280ss.avframework.engine;

import android.util.AndroidRuntimeException;
import com.p280ss.avframework.buffer.WrapperNativeAudioBuffer;
import com.p280ss.avframework.statics.StaticsReport;
import com.p280ss.avframework.utils.JNINamespace;
import java.nio.Buffer;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.engine.AudioSource */
public abstract class AudioSource extends MediaSource {
    protected AudioDeviceModule mADM;
    private PowerObserver mObserver;

    /* renamed from: com.ss.avframework.engine.AudioSource$PowerObserver */
    public interface PowerObserver {
        void onCalculatePcmPowerEvent(int i);
    }

    public AudioDeviceModule getAudioDeviceModule() {
        return this.mADM;
    }

    public boolean getStaticsReport(StaticsReport staticsReport) {
        return false;
    }

    /* access modifiers changed from: protected */
    public native void nativeAdaptedOutputFormat(int i, int i2, int i3);

    public native void nativeOnData(Buffer buffer, int i, int i2, int i3, long j);

    /* access modifiers changed from: protected */
    public native void nativeSetAudioQuantizeGapPeriod(long j);

    /* access modifiers changed from: protected */
    public native void nativeSetVolume(double d);

    public synchronized void release() {
        this.mADM = null;
        super.release();
    }

    public void setAudioDeviceModule(AudioDeviceModule audioDeviceModule) {
        this.mADM = audioDeviceModule;
    }

    public void setCalculatePcmPowerEventObserver(PowerObserver powerObserver) {
        this.mObserver = powerObserver;
    }

    private void onEvent(int i) {
        if (this.mObserver != null) {
            this.mObserver.onCalculatePcmPowerEvent(i);
        }
    }

    /* access modifiers changed from: protected */
    public void nativeOnData(WrapperNativeAudioBuffer wrapperNativeAudioBuffer, int i, int i2, int i3, long j) {
        throw new AndroidRuntimeException("Not should be here.");
    }
}
