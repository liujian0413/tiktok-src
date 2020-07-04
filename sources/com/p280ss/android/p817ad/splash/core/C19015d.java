package com.p280ss.android.p817ad.splash.core;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ad.splash.core.d */
final class C19015d {

    /* renamed from: a */
    private static final List<WeakReference<C19041g>> f51360a = new ArrayList();

    /* renamed from: a */
    static List<WeakReference<C19041g>> m62074a() {
        return new ArrayList(f51360a);
    }

    /* renamed from: a */
    static void m62075a(C19041g gVar) {
        if (gVar != null) {
            f51360a.add(new WeakReference(gVar));
        }
    }
}
