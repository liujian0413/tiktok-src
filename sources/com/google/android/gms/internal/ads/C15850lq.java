package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.lq */
final /* synthetic */ class C15850lq implements Runnable {

    /* renamed from: a */
    private final C15848lo f44613a;

    /* renamed from: b */
    private final C15742hq f44614b;

    /* renamed from: c */
    private final Map f44615c;

    C15850lq(C15848lo loVar, C15742hq hqVar, Map map) {
        this.f44613a = loVar;
        this.f44614b = hqVar;
        this.f44615c = map;
    }

    public final void run() {
        this.f44613a.mo41732a(this.f44614b, this.f44615c);
    }
}
