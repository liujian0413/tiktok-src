package com.google.android.play.core.internal;

/* renamed from: com.google.android.play.core.internal.bh */
final class C17117bh extends C17113bd {

    /* renamed from: b */
    private final /* synthetic */ C17112bc f47830b;

    C17117bh(C17112bc bcVar) {
        this.f47830b = bcVar;
    }

    /* renamed from: a */
    public final void mo44331a() {
        if (this.f47830b.f47815a != null) {
            this.f47830b.f47817d.mo15889a("Unbind from service.", new Object[0]);
            this.f47830b.f47816c.unbindService(this.f47830b.f47825l);
            this.f47830b.f47820g = false;
            this.f47830b.f47815a = null;
            this.f47830b.f47825l = null;
        }
    }
}
