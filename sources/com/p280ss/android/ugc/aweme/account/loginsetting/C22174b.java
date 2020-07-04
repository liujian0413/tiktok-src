package com.p280ss.android.ugc.aweme.account.loginsetting;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.account.loginsetting.b */
public final class C22174b {
    @C6593c(mo15949a = "data")

    /* renamed from: a */
    public final C22175c f59229a;
    @C6593c(mo15949a = "message")

    /* renamed from: b */
    public final String f59230b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f59230b, (java.lang.Object) r3.f59230b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.account.loginsetting.C22174b
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.account.loginsetting.b r3 = (com.p280ss.android.ugc.aweme.account.loginsetting.C22174b) r3
            com.ss.android.ugc.aweme.account.loginsetting.c r0 = r2.f59229a
            com.ss.android.ugc.aweme.account.loginsetting.c r1 = r3.f59229a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f59230b
            java.lang.String r3 = r3.f59230b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.loginsetting.C22174b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C22175c cVar = this.f59229a;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        String str = this.f59230b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoolData(data=");
        sb.append(this.f59229a);
        sb.append(", message=");
        sb.append(this.f59230b);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo58529a() {
        return this.f59229a.f59231a;
    }
}
