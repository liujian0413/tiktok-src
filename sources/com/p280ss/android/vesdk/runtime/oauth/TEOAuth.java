package com.p280ss.android.vesdk.runtime.oauth;

import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;

/* renamed from: com.ss.android.vesdk.runtime.oauth.TEOAuth */
public class TEOAuth {
    static {
        TENativeLibsLoader.m67986c();
    }

    private static native int nativeActivate(String str, String str2, String str3, String str4, String str5, String str6);

    private static native String nativeGetActivationCode();
}
