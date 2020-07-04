package com.p280ss.android.ugc.aweme.account.login.p975v2.network;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.a */
public final class C21912a extends BaseResponse {
    @C6593c(mo15949a = "is_valid")

    /* renamed from: a */
    public final boolean f58630a;
    @C6593c(mo15949a = "recommended_unique_ids")

    /* renamed from: b */
    public final List<String> f58631b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C21912a) {
                C21912a aVar = (C21912a) obj;
                if (!(this.f58630a == aVar.f58630a) || !C7573i.m23585a((Object) this.f58631b, (Object) aVar.f58631b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f58630a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        List<String> list = this.f58631b;
        return i + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckUserNameResponse(is_valid=");
        sb.append(this.f58630a);
        sb.append(", recommended_unique_ids=");
        sb.append(this.f58631b);
        sb.append(")");
        return sb.toString();
    }
}
