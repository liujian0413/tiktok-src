package com.p280ss.avframework.livestreamv2.audioeffect;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;

/* renamed from: com.ss.avframework.livestreamv2.audioeffect.PitchTempoAdjuster */
public class PitchTempoAdjuster {
    private long handle;

    /* renamed from: com.ss.avframework.livestreamv2.audioeffect.PitchTempoAdjuster$_lancet */
    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    private native void initialise(int i, int i2, int i3, float f, float f2);

    public native int available();

    public native void dispose();

    public native int getChannelCount();

    public native int getLatency();

    public native float getPitchScale();

    public native int getSamplesRequired();

    public native float getTimeRatio();

    public native void process(float[][] fArr, int i, int i2, boolean z);

    public native void reset();

    public native int retrieve(float[][] fArr, int i, int i2);

    public native void setDetectorOption(int i);

    public native void setExpectedInputDuration(long j);

    public native void setFormantOption(int i);

    public native void setMaxProcessSize(int i);

    public native void setPhaseOption(int i);

    public native void setPitchOption(int i);

    public native void setPitchScale(float f);

    public native void setTimeRatio(float f);

    public native void setTransientsOption(int i);

    public native void study(float[][] fArr, int i, int i2, boolean z);

    static {
        _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("audioeffect");
    }

    public int retrieve(float[][] fArr) {
        return retrieve(fArr, 0, fArr[0].length);
    }

    public void process(float[][] fArr, boolean z) {
        process(fArr, 0, fArr[0].length, z);
    }

    public void study(float[][] fArr, boolean z) {
        study(fArr, 0, fArr[0].length, z);
    }

    public PitchTempoAdjuster(int i, int i2, int i3, float f, float f2) {
        initialise(i, i2, i3, f, f2);
    }
}
