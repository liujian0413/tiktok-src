package com.p280ss.avframework.livestreamv2.audioeffect;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;

/* renamed from: com.ss.avframework.livestreamv2.audioeffect.AudioReverberator */
public class AudioReverberator {
    private long handle;
    private final int mChannels;
    private long stereoWiden;

    /* renamed from: com.ss.avframework.livestreamv2.audioeffect.AudioReverberator$_lancet */
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

    private native long deleteStereoWiden(long j);

    private static native void init(String str);

    private static native long newInstance(int i, int i2, String str);

    private static native long newStereoWiden(int i, int i2);

    private native int process(long j, long j2, float[] fArr, float[] fArr2, int i, int i2);

    static {
        _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("audioeffect");
        init(AudioReverberator.class.getCanonicalName().replaceAll("\\.", "/"));
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (this.handle != 0 || this.stereoWiden != 0) {
            release();
        }
    }

    public synchronized void release() {
        this.handle = 0;
        deleteInstance(this.handle);
        this.stereoWiden = 0;
        deleteStereoWiden(this.stereoWiden);
    }

    public AudioReverberator(int i, int i2, Reverb2Params reverb2Params) {
        this.mChannels = i2;
        this.handle = newInstance(i, i2, reverb2Params.getParamsAsString());
    }

    public int process(float[] fArr, float[] fArr2, int i) {
        return process(this.handle, this.stereoWiden, fArr, fArr2, i, this.mChannels);
    }

    public AudioReverberator(int i, int i2, Reverb2Params reverb2Params, int i3) {
        this.mChannels = i2;
        this.handle = newInstance(i, i2, reverb2Params.getParamsAsString());
        this.stereoWiden = newStereoWiden(i2, i3);
    }
}
