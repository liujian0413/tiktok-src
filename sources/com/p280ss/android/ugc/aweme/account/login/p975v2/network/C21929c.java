package com.p280ss.android.ugc.aweme.account.login.p975v2.network;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.c */
public final class C21929c {
    @C6593c(mo15949a = "message")

    /* renamed from: a */
    public final String f58665a;
    @C6593c(mo15949a = "data")

    /* renamed from: b */
    public final C21928b f58666b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f58666b, (java.lang.Object) r3.f58666b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21929c
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.account.login.v2.network.c r3 = (com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21929c) r3
            java.lang.String r0 = r2.f58665a
            java.lang.String r1 = r3.f58665a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.account.login.v2.network.b r0 = r2.f58666b
            com.ss.android.ugc.aweme.account.login.v2.network.b r3 = r3.f58666b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21929c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f58665a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C21928b bVar = this.f58666b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitUserNameResponse(message=");
        sb.append(this.f58665a);
        sb.append(", data=");
        sb.append(this.f58666b);
        sb.append(")");
        return sb.toString();
    }
}
