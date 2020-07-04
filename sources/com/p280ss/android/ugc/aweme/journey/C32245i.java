package com.p280ss.android.ugc.aweme.journey;

import com.google.gson.p276a.C6593c;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.journey.i */
public final class C32245i {
    @C6593c(mo15949a = "interest_list")

    /* renamed from: a */
    public final List<C32246j> f84275a;

    /* renamed from: b */
    public final boolean f84276b = true;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32245i) {
                C32245i iVar = (C32245i) obj;
                if (C7573i.m23585a((Object) this.f84275a, (Object) iVar.f84275a)) {
                    if (this.f84276b == iVar.f84276b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List<C32246j> list = this.f84275a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.f84276b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewUserInterestPageStruct(interest_list=");
        sb.append(this.f84275a);
        sb.append(", isDefault=");
        sb.append(this.f84276b);
        sb.append(")");
        return sb.toString();
    }

    public C32245i(List<C32246j> list, boolean z) {
        this.f84275a = list;
    }
}
