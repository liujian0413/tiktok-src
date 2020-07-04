package com.google.android.gms.internal.ads;

final class biz {

    /* renamed from: a */
    public final int f42250a;

    /* renamed from: b */
    public final long[] f42251b;

    /* renamed from: c */
    public final int[] f42252c;

    /* renamed from: d */
    public final long[] f42253d;

    /* renamed from: e */
    public final int[] f42254e;

    biz(long[] jArr, int[] iArr, long[] jArr2, int[] iArr2) {
        boolean z = false;
        bke.m49058a(iArr.length == jArr2.length);
        bke.m49058a(jArr.length == jArr2.length);
        if (iArr2.length == jArr2.length) {
            z = true;
        }
        bke.m49058a(z);
        this.f42251b = jArr;
        this.f42252c = iArr;
        this.f42253d = jArr2;
        this.f42254e = iArr2;
        this.f42250a = jArr.length;
    }
}
