package com.p280ss.android.ugc.aweme.activity.p983f2;

/* renamed from: com.ss.android.ugc.aweme.activity.f2.a */
public final class C22371a {

    /* renamed from: a */
    public final boolean f59697a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22371a) {
                if (this.f59697a == ((C22371a) obj).f59697a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f59697a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HighPriorityDialogEvent(showing=");
        sb.append(this.f59697a);
        sb.append(")");
        return sb.toString();
    }

    public C22371a(boolean z) {
        this.f59697a = z;
    }
}
