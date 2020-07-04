package com.p280ss.android.ugc.aweme.account.login.p975v2.network;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.b */
public final class C21928b {
    @C6593c(mo15949a = "error_code")

    /* renamed from: a */
    public final Integer f58662a;
    @C6593c(mo15949a = "description")

    /* renamed from: b */
    public final String f58663b;
    @C6593c(mo15949a = "login_name")

    /* renamed from: c */
    public final String f58664c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f58664c, (java.lang.Object) r3.f58664c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21928b
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.account.login.v2.network.b r3 = (com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21928b) r3
            java.lang.Integer r0 = r2.f58662a
            java.lang.Integer r1 = r3.f58662a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f58663b
            java.lang.String r1 = r3.f58663b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f58664c
            java.lang.String r3 = r3.f58664c
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21928b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Integer num = this.f58662a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f58663b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f58664c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitUserNameData(error_code=");
        sb.append(this.f58662a);
        sb.append(", description=");
        sb.append(this.f58663b);
        sb.append(", login_name=");
        sb.append(this.f58664c);
        sb.append(")");
        return sb.toString();
    }
}
