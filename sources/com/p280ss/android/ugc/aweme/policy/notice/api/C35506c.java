package com.p280ss.android.ugc.aweme.policy.notice.api;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.policy.notice.api.c */
public final class C35506c extends BaseResponse {
    @C6593c(mo15949a = "policy_notices")

    /* renamed from: a */
    public final List<C35504a> f93168a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f93168a, (java.lang.Object) ((com.p280ss.android.ugc.aweme.policy.notice.api.C35506c) r2).f93168a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.policy.notice.api.C35506c
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.policy.notice.api.c r2 = (com.p280ss.android.ugc.aweme.policy.notice.api.C35506c) r2
            java.util.List<com.ss.android.ugc.aweme.policy.notice.api.a> r0 = r1.f93168a
            java.util.List<com.ss.android.ugc.aweme.policy.notice.api.a> r2 = r2.f93168a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.policy.notice.api.C35506c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<C35504a> list = this.f93168a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PolicyNoticeResponse(policyNotices=");
        sb.append(this.f93168a);
        sb.append(")");
        return sb.toString();
    }
}
