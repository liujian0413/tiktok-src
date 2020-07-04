package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

final class ais implements bgk {

    /* renamed from: a */
    private WeakReference<bgk> f40357a;

    /* renamed from: b */
    private final /* synthetic */ aip f40358b;

    private ais(aip aip) {
        this.f40358b = aip;
        this.f40357a = new WeakReference<>(null);
    }

    /* renamed from: a */
    public final void mo39505a(bgk bgk) {
        this.f40357a = new WeakReference<>(bgk);
    }

    /* renamed from: a */
    public final void mo39507a(boolean z, int i) {
        bgk bgk = (bgk) this.f40357a.get();
        if (bgk != null) {
            bgk.mo39507a(z, i);
        }
    }

    /* renamed from: a */
    public final void mo39504a() {
        bgk bgk = (bgk) this.f40357a.get();
        if (bgk != null) {
            bgk.mo39504a();
        }
    }

    /* renamed from: a */
    public final void mo39506a(zzgc zzgc) {
        this.f40358b.m46026a("PlayerError", zzgc.getMessage());
        bgk bgk = (bgk) this.f40357a.get();
        if (bgk != null) {
            bgk.mo39506a(zzgc);
        }
    }
}
