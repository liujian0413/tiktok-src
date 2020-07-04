package com.facebook.react.bridge;

import android.os.SystemClock;
import com.facebook.jni.HybridData;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;

public class CxxModuleWrapper extends CxxModuleWrapperBase {

    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    public static String getAbsolutePath(String str) {
        return str;
    }

    private static native CxxModuleWrapper makeDsoNative(String str, String str2);

    protected CxxModuleWrapper(HybridData hybridData) {
        super(hybridData);
    }

    public static CxxModuleWrapper makeDso(String str, String str2) {
        _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(str);
        return makeDsoNative(getAbsolutePath(str), str2);
    }
}
