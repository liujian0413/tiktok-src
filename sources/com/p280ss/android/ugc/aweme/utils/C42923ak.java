package com.p280ss.android.ugc.aweme.utils;

import android.os.Build;
import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.utils.ak */
public final class C42923ak {

    /* renamed from: a */
    public static final C42923ak f111452a = new C42923ak();

    private C42923ak() {
    }

    /* renamed from: a */
    public static final boolean m136268a() {
        if (TextUtils.equals(Build.MODEL, "Redmi 6A") || TextUtils.equals(Build.MODEL, "Redmi 6")) {
            return true;
        }
        return false;
    }
}
