package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.layout;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.f */
public final class C28985f {

    /* renamed from: a */
    public final int f76353a;

    /* renamed from: b */
    public final int f76354b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28985f) {
                C28985f fVar = (C28985f) obj;
                if (this.f76353a == fVar.f76353a) {
                    if (this.f76354b == fVar.f76354b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.f76353a) * 31) + Integer.hashCode(this.f76354b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OptionDescVO(imageResId=");
        sb.append(this.f76353a);
        sb.append(", textResId=");
        sb.append(this.f76354b);
        sb.append(")");
        return sb.toString();
    }

    public C28985f(int i, int i2) {
        this.f76353a = i;
        this.f76354b = i2;
    }
}
