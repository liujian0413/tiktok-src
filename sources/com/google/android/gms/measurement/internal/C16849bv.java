package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.bv */
abstract class C16849bv extends C16848bu {

    /* renamed from: a */
    private boolean f47096a;

    C16849bv(C16825ay ayVar) {
        super(ayVar);
        this.f47095q.mo43655a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo43602d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo43603e() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final boolean mo43717w() {
        return this.f47096a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo43718x() {
        if (!mo43717w()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: y */
    public final void mo43719y() {
        if (this.f47096a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo43602d()) {
            this.f47095q.mo43675w();
            this.f47096a = true;
        }
    }

    /* renamed from: z */
    public final void mo43720z() {
        if (!this.f47096a) {
            mo43603e();
            this.f47095q.mo43675w();
            this.f47096a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
