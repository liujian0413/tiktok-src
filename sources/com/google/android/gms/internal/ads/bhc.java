package com.google.android.gms.internal.ads;

public final class bhc implements C15467ab {

    /* renamed from: a */
    private int f41981a;

    /* renamed from: b */
    private int f41982b;

    /* renamed from: c */
    private final int f41983c;

    /* renamed from: d */
    private final float f41984d;

    public bhc() {
        this(2500, 1, 1.0f);
    }

    private bhc(int i, int i2, float f) {
        this.f41981a = 2500;
        this.f41983c = 1;
        this.f41984d = 1.0f;
    }

    /* renamed from: a */
    public final int mo39064a() {
        return this.f41981a;
    }

    /* renamed from: b */
    public final int mo39066b() {
        return this.f41982b;
    }

    /* renamed from: a */
    public final void mo39065a(zzae zzae) throws zzae {
        boolean z = true;
        this.f41982b++;
        this.f41981a += (int) (((float) this.f41981a) * this.f41984d);
        if (this.f41982b > this.f41983c) {
            z = false;
        }
        if (!z) {
            throw zzae;
        }
    }
}
