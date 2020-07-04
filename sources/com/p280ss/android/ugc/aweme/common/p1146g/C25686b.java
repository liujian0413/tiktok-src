package com.p280ss.android.ugc.aweme.common.p1146g;

import android.os.Build;
import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.common.g.b */
public final class C25686b {
    /* renamed from: a */
    public static boolean m84432a() {
        if (TextUtils.equals(Build.MANUFACTURER.toLowerCase(), "genymotion") || TextUtils.equals(Build.MODEL.toLowerCase(), "virtual machine") || Build.DEVICE.contains("generic_")) {
            return false;
        }
        return true;
    }
}
