package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.ec */
abstract class C16911ec extends C16910eb {

    /* renamed from: b */
    private boolean f47276b;

    C16911ec(C16912ed edVar) {
        super(edVar);
        this.f47275a.mo43847a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo43637d();

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final boolean mo43842i() {
        return this.f47276b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo43843j() {
        if (!mo43842i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: t */
    public final void mo43844t() {
        if (!this.f47276b) {
            mo43637d();
            this.f47275a.mo43874o();
            this.f47276b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
