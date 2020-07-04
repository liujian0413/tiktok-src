package com.p280ss.video.rtc.engine.loader;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;
import com.p280ss.video.rtc.engine.utils.LogUtil;

/* renamed from: com.ss.video.rtc.engine.loader.RtcNativeLibraryLoaderImpl */
public class RtcNativeLibraryLoaderImpl implements RtcNativeLibraryLoader {

    /* renamed from: com.ss.video.rtc.engine.loader.RtcNativeLibraryLoaderImpl$_lancet */
    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    public boolean load(String str) {
        StringBuilder sb = new StringBuilder("Loading library: ");
        sb.append(str);
        LogUtil.m145281i("RtcNativeLibraryLoaderImpl", sb.toString());
        try {
            _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(str);
            return true;
        } catch (UnsatisfiedLinkError e) {
            StringBuilder sb2 = new StringBuilder("Failed to load native library: ");
            sb2.append(str);
            LogUtil.m145280e("RtcNativeLibraryLoaderImpl", sb2.toString(), e);
            return false;
        }
    }
}
