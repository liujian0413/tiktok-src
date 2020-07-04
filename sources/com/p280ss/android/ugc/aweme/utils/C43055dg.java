package com.p280ss.android.ugc.aweme.utils;

import android.os.Looper;
import com.C1642a;

/* renamed from: com.ss.android.ugc.aweme.utils.dg */
public final class C43055dg {
    /* renamed from: a */
    public static void m136598a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalArgumentException("must be called on async thread");
        }
    }

    /* renamed from: a */
    public static void m136599a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(C1642a.m8034a(str, objArr));
        }
    }
}
