package com.facebook.drawee.components;

/* renamed from: com.facebook.drawee.components.b */
public final class C13393b {

    /* renamed from: a */
    public boolean f35433a;

    /* renamed from: b */
    public int f35434b;

    /* renamed from: c */
    private int f35435c;

    /* renamed from: b */
    public final void mo32738b() {
        this.f35435c = 0;
    }

    public C13393b() {
        mo32737a();
    }

    /* renamed from: d */
    public final void mo32740d() {
        this.f35435c++;
    }

    /* renamed from: a */
    public final void mo32737a() {
        this.f35433a = false;
        this.f35434b = 4;
        mo32738b();
    }

    /* renamed from: c */
    public final boolean mo32739c() {
        if (!this.f35433a || this.f35435c >= this.f35434b) {
            return false;
        }
        return true;
    }
}
