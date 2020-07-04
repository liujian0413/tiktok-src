package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r */
public abstract class C16695r extends C16694q {

    /* renamed from: b */
    private boolean f46635b;

    protected C16695r(C16697t tVar) {
        super(tVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo42476a();

    /* renamed from: r */
    public final boolean mo43213r() {
        return this.f46635b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo43214s() {
        if (!mo43213r()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: t */
    public final void mo43215t() {
        mo42476a();
        this.f46635b = true;
    }
}
