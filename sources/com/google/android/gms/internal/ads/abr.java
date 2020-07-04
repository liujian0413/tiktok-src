package com.google.android.gms.internal.ads;

final class abr extends abz {

    /* renamed from: a */
    private final /* synthetic */ abp f39935a;

    abr(abp abp) {
        this.f39935a = abp;
    }

    /* renamed from: u_ */
    public final void mo37836u_() {
    }

    /* renamed from: a */
    public final void mo37835a() {
        C15587by byVar = new C15587by(this.f39935a.f39923c, this.f39935a.f39927g.f45677a);
        synchronized (this.f39935a.f39924d) {
            try {
                C15592cc.m50344a(this.f39935a.f39928h, byVar);
            } catch (IllegalArgumentException e) {
                acd.m45780c("Cannot config CSI reporter.", e);
            }
        }
    }
}
