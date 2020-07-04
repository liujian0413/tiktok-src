package com.airbnb.lottie;

import java.util.Arrays;

/* renamed from: com.airbnb.lottie.l */
public final class C1783l<V> {

    /* renamed from: a */
    public final V f6424a;

    /* renamed from: b */
    public final Throwable f6425b;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6424a, this.f6425b});
    }

    public C1783l(V v) {
        this.f6424a = v;
    }

    public C1783l(Throwable th) {
        this.f6425b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1783l)) {
            return false;
        }
        C1783l lVar = (C1783l) obj;
        if (this.f6424a != null && this.f6424a.equals(lVar.f6424a)) {
            return true;
        }
        if (this.f6425b == null || lVar.f6425b == null) {
            return false;
        }
        return this.f6425b.toString().equals(this.f6425b.toString());
    }
}
