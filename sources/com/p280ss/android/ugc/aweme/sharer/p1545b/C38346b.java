package com.p280ss.android.ugc.aweme.sharer.p1545b;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.ugc.aweme.sharer.b.b */
public final class C38346b {

    /* renamed from: a */
    public static final C38346b f99544a = new C38346b();

    /* renamed from: b */
    private static final WeakHashMap<View, Long> f99545b = new WeakHashMap<>();

    private C38346b() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static boolean m122507a(View view, long j) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        Long l = (Long) f99545b.get(view);
        long nanoTime = System.nanoTime() / 1000000;
        if (l == null) {
            f99545b.put(view, Long.valueOf(nanoTime));
            return false;
        }
        if (nanoTime - l.longValue() <= j) {
            z = true;
        }
        if (!z) {
            f99545b.put(view, Long.valueOf(nanoTime));
        }
        return z;
    }
}
