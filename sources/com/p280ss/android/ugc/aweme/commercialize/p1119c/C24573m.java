package com.p280ss.android.ugc.aweme.commercialize.p1119c;

/* renamed from: com.ss.android.ugc.aweme.commercialize.c.m */
public final class C24573m {

    /* renamed from: a */
    public int f64817a;

    /* renamed from: b */
    public final long f64818b;

    /* renamed from: c */
    public final long f64819c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24573m) {
                C24573m mVar = (C24573m) obj;
                if (this.f64817a == mVar.f64817a) {
                    if (this.f64818b == mVar.f64818b) {
                        if (this.f64819c == mVar.f64819c) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((Integer.hashCode(this.f64817a) * 31) + Long.hashCode(this.f64818b)) * 31) + Long.hashCode(this.f64819c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserProfileFakeCoverActionEvent(actionType=");
        sb.append(this.f64817a);
        sb.append(", downTime=");
        sb.append(this.f64818b);
        sb.append(", actionTime=");
        sb.append(this.f64819c);
        sb.append(")");
        return sb.toString();
    }

    public C24573m(int i, long j, long j2) {
        this.f64817a = i;
        this.f64818b = j;
        this.f64819c = j2;
    }
}
