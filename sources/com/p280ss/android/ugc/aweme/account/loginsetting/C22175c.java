package com.p280ss.android.ugc.aweme.account.loginsetting;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.account.loginsetting.c */
public final class C22175c {
    @C6593c(mo15949a = "result")

    /* renamed from: a */
    public final boolean f59231a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22175c) {
                if (this.f59231a == ((C22175c) obj).f59231a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f59231a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoolResult(result=");
        sb.append(this.f59231a);
        sb.append(")");
        return sb.toString();
    }
}
