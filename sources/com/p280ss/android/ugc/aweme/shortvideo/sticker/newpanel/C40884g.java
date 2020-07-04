package com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.g */
public final class C40884g {

    /* renamed from: a */
    public final int f106325a;

    /* renamed from: b */
    public final int f106326b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C40884g) {
                C40884g gVar = (C40884g) obj;
                if (this.f106325a == gVar.f106325a) {
                    if (this.f106326b == gVar.f106326b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f106325a * 31) + this.f106326b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollerOperation(type=");
        sb.append(this.f106325a);
        sb.append(", targetPosition=");
        sb.append(this.f106326b);
        sb.append(")");
        return sb.toString();
    }

    public C40884g(int i, int i2) {
        this.f106325a = i;
        this.f106326b = i2;
    }
}
