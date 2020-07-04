package com.google.android.gms.internal.ads;

import java.util.Arrays;

public class bqm implements bqv {

    /* renamed from: a */
    private final bqj f43270a;

    /* renamed from: b */
    private final int f43271b = 1;

    /* renamed from: c */
    private final int[] f43272c;

    /* renamed from: d */
    private final zzlg[] f43273d = new zzlg[this.f43271b];

    /* renamed from: e */
    private final long[] f43274e;

    /* renamed from: f */
    private int f43275f;

    public bqm(bqj bqj, int... iArr) {
        brr.m49873b(true);
        this.f43270a = (bqj) brr.m49869a(bqj);
        for (int i = 0; i <= 0; i++) {
            this.f43273d[0] = bqj.mo41141a(iArr[0]);
        }
        Arrays.sort(this.f43273d, new bqo());
        this.f43272c = new int[this.f43271b];
        for (int i2 = 0; i2 < this.f43271b; i2++) {
            this.f43272c[i2] = bqj.mo41140a(this.f43273d[i2]);
        }
        this.f43274e = new long[this.f43271b];
    }

    /* renamed from: a */
    public final bqj mo41163a() {
        return this.f43270a;
    }

    /* renamed from: b */
    public final int mo41165b() {
        return this.f43272c.length;
    }

    /* renamed from: a */
    public final zzlg mo41164a(int i) {
        return this.f43273d[i];
    }

    /* renamed from: b */
    public final int mo41166b(int i) {
        return this.f43272c[0];
    }

    public int hashCode() {
        if (this.f43275f == 0) {
            this.f43275f = (System.identityHashCode(this.f43270a) * 31) + Arrays.hashCode(this.f43272c);
        }
        return this.f43275f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bqm bqm = (bqm) obj;
        return this.f43270a == bqm.f43270a && Arrays.equals(this.f43272c, bqm.f43272c);
    }
}
