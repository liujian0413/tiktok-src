package com.google.android.gms.internal.ads;

public final class bvl {

    /* renamed from: a */
    final long f43704a;

    /* renamed from: b */
    final String f43705b;

    /* renamed from: c */
    final int f43706c;

    bvl(long j, String str, int i) {
        this.f43704a = j;
        this.f43705b = str;
        this.f43706c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bvl)) {
            return false;
        }
        bvl bvl = (bvl) obj;
        if (bvl.f43704a == this.f43704a && bvl.f43706c == this.f43706c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f43704a;
    }
}
