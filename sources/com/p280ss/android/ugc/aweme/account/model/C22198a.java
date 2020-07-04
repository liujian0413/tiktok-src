package com.p280ss.android.ugc.aweme.account.model;

/* renamed from: com.ss.android.ugc.aweme.account.model.a */
public final class C22198a {

    /* renamed from: a */
    public final boolean f59293a = false;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22198a) {
                if (this.f59293a == ((C22198a) obj).f59293a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f59293a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountBackOpe(isFinish=");
        sb.append(this.f59293a);
        sb.append(")");
        return sb.toString();
    }

    public C22198a(boolean z) {
    }
}
