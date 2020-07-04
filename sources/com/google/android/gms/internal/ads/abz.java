package com.google.android.gms.internal.ads;

@C6505uv
public abstract class abz implements adi<agj> {

    /* renamed from: a */
    private final Runnable f39966a = new aca(this);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile Thread f39967b;

    /* renamed from: c */
    private boolean f39968c = false;

    public abz() {
    }

    /* renamed from: a */
    public abstract void mo37835a();

    /* renamed from: u_ */
    public abstract void mo37836u_();

    public abz(boolean z) {
    }

    /* renamed from: g */
    public final agj mo39129g() {
        if (!this.f39968c) {
            return acj.m45508a(this.f39966a);
        }
        return acj.f39999b.mo39292a(this.f39966a);
    }

    /* renamed from: b */
    public final void mo39127b() {
        mo37836u_();
        if (this.f39967b != null) {
            this.f39967b.interrupt();
        }
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo39128c() {
        if (!this.f39968c) {
            return acj.m45508a(this.f39966a);
        }
        return acj.f39999b.mo39292a(this.f39966a);
    }
}
