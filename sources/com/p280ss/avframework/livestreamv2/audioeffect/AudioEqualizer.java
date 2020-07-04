package com.p280ss.avframework.livestreamv2.audioeffect;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;

/* renamed from: com.ss.avframework.livestreamv2.audioeffect.AudioEqualizer */
public class AudioEqualizer {
    private long handle;
    private final int mChannels;

    /* renamed from: com.ss.avframework.livestreamv2.audioeffect.AudioEqualizer$_lancet */
    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    private native long deleteInstance(long j);

    private static native void init(String str);

    private static native long newInstance(int i, int i2, String str);

    private native int process(long j, float[] fArr, float[] fArr2, int i, int i2);

    private native void updateParams(long j, String str);

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (this.handle != 0) {
            release();
        }
    }

    public synchronized void release() {
        this.handle = 0;
        deleteInstance(this.handle);
    }

    static {
        _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("audioeffect");
        init(AudioEqualizer.class.getCanonicalName().replaceAll("\\.", "/"));
    }

    public void updateParams(EqualizerParams equalizerParams) {
        if (this.handle != 0) {
            updateParams(this.handle, equalizerParams.getParamsAsString());
        }
    }

    public AudioEqualizer(int i, int i2, EqualizerParams equalizerParams) {
        this.mChannels = i2;
        this.handle = newInstance(i, i2, equalizerParams.getParamsAsString());
    }

    public int process(float[] fArr, float[] fArr2, int i) {
        return process(this.handle, fArr, fArr2, i, this.mChannels);
    }
}
