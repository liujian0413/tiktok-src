package com.p280ss.android.ugc.aweme.commercialize.p1119c;

import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.commercialize.c.n */
public final class C24574n {

    /* renamed from: a */
    public final boolean f64820a;

    /* renamed from: b */
    public final long f64821b;

    /* renamed from: c */
    public final long f64822c;

    public final int hashCode() {
        boolean z = this.f64820a;
        if (z) {
            z = true;
        }
        return ((((z ? 1 : 0) * true) + Long.hashCode(this.f64821b)) * 31) + Long.hashCode(this.f64822c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoPlayLoopData(enable=");
        sb.append(this.f64820a);
        sb.append(", startMilliSeconds=");
        sb.append(this.f64821b);
        sb.append(", endMilliSeconds=");
        sb.append(this.f64822c);
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C24574n)) {
            return false;
        }
        C24574n nVar = (C24574n) obj;
        if (nVar.f64820a == this.f64820a && nVar.f64821b == this.f64821b && nVar.f64822c == this.f64822c) {
            return true;
        }
        return false;
    }

    public C24574n(boolean z, long j, long j2) {
        this.f64820a = z;
        this.f64821b = j;
        this.f64822c = j2;
    }

    public /* synthetic */ C24574n(boolean z, long j, long j2, int i, C7571f fVar) {
        this(false, 0, 0);
    }
}
