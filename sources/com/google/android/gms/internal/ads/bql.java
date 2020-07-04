package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class bql {

    /* renamed from: a */
    public static final bql f43266a = new bql(new bqj[0]);

    /* renamed from: b */
    public final int f43267b;

    /* renamed from: c */
    private final bqj[] f43268c;

    /* renamed from: d */
    private int f43269d;

    public bql(bqj... bqjArr) {
        this.f43268c = bqjArr;
        this.f43267b = bqjArr.length;
    }

    /* renamed from: a */
    public final bqj mo41160a(int i) {
        return this.f43268c[i];
    }

    /* renamed from: a */
    public final int mo41159a(bqj bqj) {
        for (int i = 0; i < this.f43267b; i++) {
            if (this.f43268c[i] == bqj) {
                return i;
            }
        }
        return -1;
    }

    public final int hashCode() {
        if (this.f43269d == 0) {
            this.f43269d = Arrays.hashCode(this.f43268c);
        }
        return this.f43269d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bql bql = (bql) obj;
        return this.f43267b == bql.f43267b && Arrays.equals(this.f43268c, bql.f43268c);
    }
}
