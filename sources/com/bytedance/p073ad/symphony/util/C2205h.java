package com.bytedance.p073ad.symphony.util;

import android.os.Looper;
import com.bytedance.p073ad.symphony.C2114c;

/* renamed from: com.bytedance.ad.symphony.util.h */
public final class C2205h {
    /* renamed from: a */
    public static void m9518a() {
        if (C2114c.m9317b()) {
            m9519b();
        }
    }

    /* renamed from: b */
    private static boolean m9519b() {
        if (Looper.myLooper() == C2199b.m9506b()) {
            return true;
        }
        return false;
    }
}
