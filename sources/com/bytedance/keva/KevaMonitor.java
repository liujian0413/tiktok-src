package com.bytedance.keva;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;

public class KevaMonitor {

    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    /* access modifiers changed from: protected */
    public void logDebug(String str) {
    }

    /* access modifiers changed from: protected */
    public void reportThrowable(int i, String str, String str2, Object obj, Throwable th) {
    }

    /* access modifiers changed from: protected */
    public void reportWarning(int i, String str, String str2, Object obj, String str3) {
    }

    /* access modifiers changed from: protected */
    public void loadLibrary(String str) {
        _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(str);
    }
}
