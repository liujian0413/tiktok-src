package com.bytedance.android.live.broadcast.stream.p141a;

import android.view.Surface;

/* renamed from: com.bytedance.android.live.broadcast.stream.a.h */
final /* synthetic */ class C2962h implements Runnable {

    /* renamed from: a */
    private final C2959g f9211a;

    /* renamed from: b */
    private final Surface f9212b;

    C2962h(C2959g gVar, Surface surface) {
        this.f9211a = gVar;
        this.f9212b = surface;
    }

    public final void run() {
        this.f9211a.mo9725a(this.f9212b);
    }
}
