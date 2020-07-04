package com.p280ss.android.ugc.aweme.interest;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.journey.C32245i;

/* renamed from: com.ss.android.ugc.aweme.interest.f */
public final class C32189f extends BaseResponse {
    @C6593c(mo15949a = "new_user_interest_page")

    /* renamed from: a */
    public final C32245i f84050a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f84050a, (java.lang.Object) ((com.p280ss.android.ugc.aweme.interest.C32189f) r2).f84050a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.interest.C32189f
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.interest.f r2 = (com.p280ss.android.ugc.aweme.interest.C32189f) r2
            com.ss.android.ugc.aweme.journey.i r0 = r1.f84050a
            com.ss.android.ugc.aweme.journey.i r2 = r2.f84050a
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.interest.C32189f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C32245i iVar = this.f84050a;
        if (iVar != null) {
            return iVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InterestSelectResponse(new_user_interest_page=");
        sb.append(this.f84050a);
        sb.append(")");
        return sb.toString();
    }
}
