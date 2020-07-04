package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ge */
final class C16550ge {

    /* renamed from: a */
    public final zztv f46343a;

    /* renamed from: b */
    private final byte[] f46344b;

    private C16550ge(int i) {
        this.f46344b = new byte[i];
        this.f46343a = zztv.m54913a(this.f46344b);
    }

    /* renamed from: a */
    public final zzte mo42765a() {
        if (this.f46343a.mo43268b() == 0) {
            return new C16552gg(this.f46344b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* synthetic */ C16550ge(int i, C16542fx fxVar) {
        this(i);
    }
}
