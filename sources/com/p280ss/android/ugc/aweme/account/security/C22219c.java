package com.p280ss.android.ugc.aweme.account.security;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.account.security.c */
public final class C22219c extends BaseResponse {
    @C6593c(mo15949a = "data")

    /* renamed from: a */
    public final C22217a f59327a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f59327a, (java.lang.Object) ((com.p280ss.android.ugc.aweme.account.security.C22219c) r2).f59327a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.account.security.C22219c
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.account.security.c r2 = (com.p280ss.android.ugc.aweme.account.security.C22219c) r2
            com.ss.android.ugc.aweme.account.security.a r0 = r1.f59327a
            com.ss.android.ugc.aweme.account.security.a r2 = r2.f59327a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.security.C22219c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C22217a aVar = this.f59327a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SafeInfoNoticeMsgResponse(data=");
        sb.append(this.f59327a);
        sb.append(")");
        return sb.toString();
    }
}
