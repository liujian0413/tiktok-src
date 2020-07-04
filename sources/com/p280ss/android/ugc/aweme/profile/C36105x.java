package com.p280ss.android.ugc.aweme.profile;

/* renamed from: com.ss.android.ugc.aweme.profile.x */
public final class C36105x {

    /* renamed from: a */
    public final boolean f94394a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C36105x) {
                if (this.f94394a == ((C36105x) obj).f94394a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f94394a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SafeInfoNoticeEvent(hasPrior=");
        sb.append(this.f94394a);
        sb.append(")");
        return sb.toString();
    }

    public C36105x(boolean z) {
        this.f94394a = z;
    }
}
