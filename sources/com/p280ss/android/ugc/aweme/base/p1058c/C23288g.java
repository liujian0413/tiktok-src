package com.p280ss.android.ugc.aweme.base.p1058c;

/* renamed from: com.ss.android.ugc.aweme.base.c.g */
public final class C23288g {

    /* renamed from: a */
    public final int f61321a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23288g) {
                if (this.f61321a == ((C23288g) obj).f61321a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61321a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserLoginStateChangeEvent(type=");
        sb.append(this.f61321a);
        sb.append(")");
        return sb.toString();
    }

    public C23288g(int i) {
        this.f61321a = i;
    }
}
