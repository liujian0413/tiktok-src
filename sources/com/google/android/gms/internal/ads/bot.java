package com.google.android.gms.internal.ads;

final class bot {

    /* renamed from: a */
    public final int f43057a;

    /* renamed from: b */
    public final long[] f43058b;

    /* renamed from: c */
    public final int[] f43059c;

    /* renamed from: d */
    public final int f43060d;

    /* renamed from: e */
    public final long[] f43061e;

    /* renamed from: f */
    public final int[] f43062f;

    public bot(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        boolean z = false;
        brr.m49871a(iArr.length == jArr2.length);
        brr.m49871a(jArr.length == jArr2.length);
        if (iArr2.length == jArr2.length) {
            z = true;
        }
        brr.m49871a(z);
        this.f43058b = jArr;
        this.f43059c = iArr;
        this.f43060d = i;
        this.f43061e = jArr2;
        this.f43062f = iArr2;
        this.f43057a = jArr.length;
    }

    /* renamed from: a */
    public final int mo41056a(long j) {
        for (int a = bsf.m49935a(this.f43061e, j, true, false); a >= 0; a--) {
            if ((this.f43062f[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo41057b(long j) {
        for (int b = bsf.m49944b(this.f43061e, j, true, false); b < this.f43061e.length; b++) {
            if ((this.f43062f[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }
}
