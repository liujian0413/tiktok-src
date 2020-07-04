package com.p280ss.android.ugc.aweme.follow;

import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.follow.a */
public final class C29436a {
    @C6593c(mo15949a = "index")

    /* renamed from: a */
    public final int f77632a;
    @C6593c(mo15949a = "msg")

    /* renamed from: b */
    public final String f77633b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29436a) {
                C29436a aVar = (C29436a) obj;
                if (!(this.f77632a == aVar.f77632a) || !C7573i.m23585a((Object) this.f77633b, (Object) aVar.f77633b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f77632a * 31;
        String str = this.f77633b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LastViewData(index=");
        sb.append(this.f77632a);
        sb.append(", lastViewHint=");
        sb.append(this.f77633b);
        sb.append(")");
        return sb.toString();
    }
}
