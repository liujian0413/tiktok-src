package com.p280ss.android.ugc.aweme.account.security;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.account.security.b */
public final class C22218b {
    @C6593c(mo15949a = "content")

    /* renamed from: a */
    public final String f59325a;
    @C6593c(mo15949a = "scheme")

    /* renamed from: b */
    public final String f59326b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f59326b, (java.lang.Object) r3.f59326b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.account.security.C22218b
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.account.security.b r3 = (com.p280ss.android.ugc.aweme.account.security.C22218b) r3
            java.lang.String r0 = r2.f59325a
            java.lang.String r1 = r3.f59325a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f59326b
            java.lang.String r3 = r3.f59326b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.security.C22218b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f59325a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f59326b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SafeInfoNoticeMsgHighlight(content=");
        sb.append(this.f59325a);
        sb.append(", scheme=");
        sb.append(this.f59326b);
        sb.append(")");
        return sb.toString();
    }
}
