package com.p280ss.mediakit.ssllib;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;

/* renamed from: com.ss.mediakit.ssllib.SSLWrapper */
public class SSLWrapper {

    /* renamed from: com.ss.mediakit.ssllib.SSLWrapper$_lancet */
    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    public static int loadSSL() {
        try {
            _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("ttopenssl");
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }
}
