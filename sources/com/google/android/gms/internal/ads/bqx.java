package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class bqx {

    /* renamed from: a */
    public final int f43297a;

    /* renamed from: b */
    private final bqv[] f43298b;

    /* renamed from: c */
    private int f43299c;

    public bqx(bqv... bqvArr) {
        this.f43298b = bqvArr;
        this.f43297a = bqvArr.length;
    }

    /* renamed from: a */
    public final bqv mo41176a(int i) {
        return this.f43298b[i];
    }

    /* renamed from: a */
    public final bqv[] mo41177a() {
        return (bqv[]) this.f43298b.clone();
    }

    public final int hashCode() {
        if (this.f43299c == 0) {
            this.f43299c = Arrays.hashCode(this.f43298b) + 527;
        }
        return this.f43299c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f43298b, ((bqx) obj).f43298b);
    }
}
