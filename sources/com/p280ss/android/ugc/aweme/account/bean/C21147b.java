package com.p280ss.android.ugc.aweme.account.bean;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.account.bean.b */
public final class C21147b {
    @C6593c(mo15949a = "status_code")

    /* renamed from: a */
    public final Integer f56812a;
    @C6593c(mo15949a = "status_msg")

    /* renamed from: b */
    public final String f56813b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f56813b, (java.lang.Object) r3.f56813b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.account.bean.C21147b
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.account.bean.b r3 = (com.p280ss.android.ugc.aweme.account.bean.C21147b) r3
            java.lang.Integer r0 = r2.f56812a
            java.lang.Integer r1 = r3.f56812a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f56813b
            java.lang.String r3 = r3.f56813b
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.bean.C21147b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Integer num = this.f56812a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f56813b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppBindResponse(statusCode=");
        sb.append(this.f56812a);
        sb.append(", statusMessage=");
        sb.append(this.f56813b);
        sb.append(")");
        return sb.toString();
    }
}
