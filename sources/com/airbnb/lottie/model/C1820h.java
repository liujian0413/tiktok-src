package com.airbnb.lottie.model;

import android.support.p022v4.util.C0902i;

/* renamed from: com.airbnb.lottie.model.h */
public final class C1820h<T> {

    /* renamed from: a */
    T f6557a;

    /* renamed from: b */
    T f6558b;

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (this.f6557a == null) {
            i = 0;
        } else {
            i = this.f6557a.hashCode();
        }
        if (this.f6558b != null) {
            i2 = this.f6558b.hashCode();
        }
        return i ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(String.valueOf(this.f6557a));
        sb.append(" ");
        sb.append(String.valueOf(this.f6558b));
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0902i)) {
            return false;
        }
        C0902i iVar = (C0902i) obj;
        if (!m8534b(iVar.f3154a, this.f6557a) || !m8534b(iVar.f3155b, this.f6558b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo7318a(T t, T t2) {
        this.f6557a = t;
        this.f6558b = t2;
    }

    /* renamed from: b */
    private static boolean m8534b(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
