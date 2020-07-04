package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.aj */
public final class C31864aj {

    /* renamed from: a */
    public static final C31864aj f83331a = new C31864aj();

    /* renamed from: b */
    private static final int f83332b = f83332b;

    /* renamed from: c */
    private static final WeakHashMap<View, Long> f83333c = new WeakHashMap<>();

    private C31864aj() {
    }

    /* renamed from: a */
    public static void m103544a() {
        f83333c.clear();
    }

    /* renamed from: a */
    public static boolean m103545a(View view, long j) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        Long l = (Long) f83333c.get(view);
        long nanoTime = System.nanoTime() / 1000000;
        if (l == null) {
            f83333c.put(view, Long.valueOf(nanoTime));
            return false;
        }
        if (nanoTime - l.longValue() <= j) {
            z = true;
        }
        if (!z) {
            f83333c.put(view, Long.valueOf(nanoTime));
        }
        return z;
    }
}
