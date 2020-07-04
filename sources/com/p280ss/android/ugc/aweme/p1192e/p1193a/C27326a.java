package com.p280ss.android.ugc.aweme.p1192e.p1193a;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.ugc.aweme.e.a.a */
public final class C27326a {

    /* renamed from: a */
    private static final WeakHashMap<View, Long> f72089a = new WeakHashMap<>();

    /* renamed from: a */
    public static void m89577a() {
        f72089a.clear();
    }

    /* renamed from: a */
    public static boolean m89578a(View view) {
        return m89579a(view, 1200);
    }

    /* renamed from: a */
    public static boolean m89579a(View view, long j) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        Long l = (Long) f72089a.get(view);
        long nanoTime = System.nanoTime() / 1000000;
        if (l == null) {
            f72089a.put(view, Long.valueOf(nanoTime));
            return false;
        }
        if (nanoTime - l.longValue() <= j) {
            z = true;
        }
        if (!z) {
            f72089a.put(view, Long.valueOf(nanoTime));
        }
        return z;
    }
}
