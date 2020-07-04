package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.do */
abstract class C16896do extends C16873cs {

    /* renamed from: a */
    private boolean f47247a;

    C16896do(C16825ay ayVar) {
        super(ayVar);
        this.f47095q.mo43656a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract boolean mo43740t();

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo43824u() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public final boolean mo43820A() {
        return this.f47247a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo43821B() {
        if (!mo43820A()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: C */
    public final void mo43822C() {
        if (this.f47247a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo43740t()) {
            this.f47095q.mo43675w();
            this.f47247a = true;
        }
    }

    /* renamed from: D */
    public final void mo43823D() {
        if (!this.f47247a) {
            mo43824u();
            this.f47095q.mo43675w();
            this.f47247a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
