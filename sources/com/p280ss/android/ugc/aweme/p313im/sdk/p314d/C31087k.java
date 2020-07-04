package com.p280ss.android.ugc.aweme.p313im.sdk.p314d;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.d.k */
public final class C31087k {

    /* renamed from: a */
    public final String f81582a;

    /* renamed from: b */
    public final String f81583b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f81583b, (java.lang.Object) r3.f81583b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31087k
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.im.sdk.d.k r3 = (com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31087k) r3
            java.lang.String r0 = r2.f81582a
            java.lang.String r1 = r3.f81582a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f81583b
            java.lang.String r3 = r3.f81583b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31087k.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f81582a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f81583b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionUpdateEvent(sessionId=");
        sb.append(this.f81582a);
        sb.append(", content=");
        sb.append(this.f81583b);
        sb.append(")");
        return sb.toString();
    }

    public C31087k(String str, String str2) {
        this.f81582a = str;
        this.f81583b = str2;
    }
}
