package com.facebook.react.packagerconnection;

import android.os.Looper;
import android.os.SystemClock;
import com.facebook.jni.HybridData;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;

public class SamplingProfilerPackagerMethod extends RequestOnlyHandler {
    private SamplingProfilerJniMethod mJniMethod;

    static final class SamplingProfilerJniMethod {
        private final HybridData mHybridData;

        private static native HybridData initHybrid(long j);

        public final native void poke(Responder responder);

        public SamplingProfilerJniMethod(long j) {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            this.mHybridData = initHybrid(j);
        }
    }

    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    static {
        _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("packagerconnectionjnifb");
    }

    public SamplingProfilerPackagerMethod(long j) {
        this.mJniMethod = new SamplingProfilerJniMethod(j);
    }

    public void onRequest(Object obj, Responder responder) {
        this.mJniMethod.poke(responder);
    }
}
