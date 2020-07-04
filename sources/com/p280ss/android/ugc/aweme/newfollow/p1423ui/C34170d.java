package com.p280ss.android.ugc.aweme.newfollow.p1423ui;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.d */
public final class C34170d {

    /* renamed from: a */
    public final boolean f89082a;

    /* renamed from: b */
    public final int f89083b;

    /* renamed from: c */
    public final int f89084c;

    /* renamed from: d */
    public final boolean f89085d;

    /* renamed from: e */
    public final boolean f89086e;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C34170d) {
                C34170d dVar = (C34170d) obj;
                if (this.f89082a == dVar.f89082a) {
                    if (this.f89083b == dVar.f89083b) {
                        if (this.f89084c == dVar.f89084c) {
                            if (this.f89085d == dVar.f89085d) {
                                if (this.f89086e == dVar.f89086e) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f89082a;
        int i = 1;
        if (z) {
            z = true;
        }
        int hashCode = (((((z ? 1 : 0) * true) + Integer.hashCode(this.f89083b)) * 31) + Integer.hashCode(this.f89084c)) * 31;
        boolean z2 = this.f89085d;
        if (z2) {
            z2 = true;
        }
        int i2 = (hashCode + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.f89086e;
        if (!z3) {
            i = z3;
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollData(show=");
        sb.append(this.f89082a);
        sb.append(", dy=");
        sb.append(this.f89083b);
        sb.append(", offset=");
        sb.append(this.f89084c);
        sb.append(", inProgress=");
        sb.append(this.f89085d);
        sb.append(", isDragging=");
        sb.append(this.f89086e);
        sb.append(")");
        return sb.toString();
    }

    public C34170d(boolean z, int i, int i2, boolean z2, boolean z3) {
        this.f89082a = z;
        this.f89083b = i;
        this.f89084c = i2;
        this.f89085d = z2;
        this.f89086e = z3;
    }
}
