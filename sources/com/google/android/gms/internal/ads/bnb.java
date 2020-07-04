package com.google.android.gms.internal.ads;

public final class bnb implements bnk {

    /* renamed from: a */
    private final int f42716a;

    /* renamed from: b */
    private final int[] f42717b;

    /* renamed from: c */
    private final long[] f42718c;

    /* renamed from: d */
    private final long[] f42719d;

    /* renamed from: e */
    private final long[] f42720e;

    /* renamed from: f */
    private final long f42721f;

    public bnb(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f42717b = iArr;
        this.f42718c = jArr;
        this.f42719d = jArr2;
        this.f42720e = jArr3;
        this.f42716a = iArr.length;
        if (this.f42716a > 0) {
            this.f42721f = jArr2[this.f42716a - 1] + jArr3[this.f42716a - 1];
        } else {
            this.f42721f = 0;
        }
    }

    /* renamed from: a */
    public final boolean mo41001a() {
        return true;
    }

    /* renamed from: b */
    public final long mo41002b() {
        return this.f42721f;
    }

    /* renamed from: a */
    public final long mo41000a(long j) {
        return this.f42718c[bsf.m49935a(this.f42720e, j, true, true)];
    }
}
