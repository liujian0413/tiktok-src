package com.p280ss.ttm.player;

import android.os.Build.VERSION;
import android.os.Environment;
import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;
import java.io.File;

/* renamed from: com.ss.ttm.player.MediaCodecUtils */
public class MediaCodecUtils {
    private static boolean sHasLoadCodecLib;

    /* renamed from: com.ss.ttm.player.MediaCodecUtils$_lancet */
    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_load(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.load(str);
            C7110b.m22204a(uptimeMillis, str);
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    public static native long createAJMediaCodecer(int i, int i2);

    public static final boolean supportAJMediaCodec() {
        if (VERSION.SDK_INT > 16) {
            return true;
        }
        return false;
    }

    public static final boolean supportANMediaCodec() {
        if (VERSION.SDK_INT > 21) {
            return true;
        }
        return false;
    }

    public static final boolean loadMediaCodecLibrary() {
        if (sHasLoadCodecLib) {
            return true;
        }
        if (!supportANMediaCodec()) {
            return false;
        }
        try {
            if (TTPlayerConfiger.getValue(3, true)) {
                StringBuilder sb = new StringBuilder();
                sb.append(Environment.getExternalStorageDirectory());
                sb.append("/ttplayer/libttmplayer_mc.so");
                File file = new File(sb.toString());
                if (file.exists()) {
                    _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_load(file.getAbsolutePath());
                    return true;
                }
            }
            _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("ttmplayer_mc");
            sHasLoadCodecLib = true;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final long createMediaCodecer(int i, int i2) {
        if (supportAJMediaCodec()) {
            try {
                return createAJMediaCodecer(i, i2);
            } catch (Exception unused) {
            }
        }
        return 0;
    }
}
