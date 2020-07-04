package com.p280ss.avframework.livestreamv2.audioeffect;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;

/* renamed from: com.ss.avframework.livestreamv2.audioeffect.AudioEffectFilter */
public class AudioEffectFilter {
    private long handle;

    /* renamed from: com.ss.avframework.livestreamv2.audioeffect.AudioEffectFilter$_lancet */
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

    private static native long newInstance(int i, int i2, int i3);

    private static native long newInstance2(int i, int i2, String str);

    private native int runImpl(long j, float[][] fArr, float[][] fArr2, int i);

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
        init(AudioEffectFilter.class.getCanonicalName().replaceAll("\\.", "/"));
    }

    public AudioEffectFilter(int i, int i2, int i3) {
        this.handle = newInstance(i, i2, i3);
    }

    public int runImpl(float[][] fArr, float[][] fArr2, int i) {
        return runImpl(this.handle, fArr, fArr2, i);
    }

    public AudioEffectFilter(int i, int i2, AudioEffectParams audioEffectParams) {
        this.handle = newInstance2(i, i2, audioEffectParams.getParamsAsString());
    }
}
