package com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.viewmodel;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.a */
public final class C31583a {

    /* renamed from: a */
    public final int f82660a;

    /* renamed from: b */
    public final int f82661b;

    /* renamed from: c */
    public final int f82662c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C31583a) {
                C31583a aVar = (C31583a) obj;
                if (this.f82660a == aVar.f82660a) {
                    if (this.f82661b == aVar.f82661b) {
                        if (this.f82662c == aVar.f82662c) {
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
        return (((this.f82660a * 31) + this.f82661b) * 31) + this.f82662c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DragState(state=");
        sb.append(this.f82660a);
        sb.append(", fullWidth=");
        sb.append(this.f82661b);
        sb.append(", fullHeight=");
        sb.append(this.f82662c);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo82317a() {
        if (this.f82660a == 0) {
            return true;
        }
        return false;
    }

    public C31583a(int i, int i2, int i3) {
        this.f82660a = i;
        this.f82661b = i2;
        this.f82662c = i3;
    }
}
