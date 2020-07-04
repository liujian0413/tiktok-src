package com.p280ss.android.ugc.aweme.shortvideo.util;

import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.o */
public final class C41563o {
    /* renamed from: a */
    public static boolean m132356a() {
        return m132357b().contains("x86");
    }

    /* renamed from: c */
    private static String m132358c() {
        if (VERSION.SDK_INT < 21 || Build.SUPPORTED_ABIS.length <= 0 || TextUtils.isEmpty(Build.SUPPORTED_ABIS[0])) {
            return Build.CPU_ABI;
        }
        return Build.SUPPORTED_ABIS[0];
    }

    /* renamed from: b */
    private static String m132357b() {
        try {
            String c = m132358c();
            if (TextUtils.isEmpty(c)) {
                return "unknown";
            }
            String lowerCase = c.toLowerCase();
            if (lowerCase.startsWith("x86")) {
                return "x86";
            }
            if (lowerCase.startsWith("arm64")) {
                return "arm64";
            }
            if (lowerCase.startsWith("armeabi")) {
                return "armeabi";
            }
            return "unknown";
        } catch (Exception unused) {
        }
    }
}
