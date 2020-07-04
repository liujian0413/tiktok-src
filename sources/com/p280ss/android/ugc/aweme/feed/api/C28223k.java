package com.p280ss.android.ugc.aweme.feed.api;

/* renamed from: com.ss.android.ugc.aweme.feed.api.k */
public final class C28223k {

    /* renamed from: a */
    public final String f74336a;

    /* renamed from: b */
    public Integer f74337b;

    /* renamed from: c */
    public String f74338c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f74338c, (java.lang.Object) r3.f74338c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.feed.api.C28223k
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.feed.api.k r3 = (com.p280ss.android.ugc.aweme.feed.api.C28223k) r3
            java.lang.String r0 = r2.f74336a
            java.lang.String r1 = r3.f74336a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.Integer r0 = r2.f74337b
            java.lang.Integer r1 = r3.f74337b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f74338c
            java.lang.String r3 = r3.f74338c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.api.C28223k.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f74336a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f74337b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f74338c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkExtraInfo(requestLog=");
        sb.append(this.f74336a);
        sb.append(", retryTimes=");
        sb.append(this.f74337b);
        sb.append(", url=");
        sb.append(this.f74338c);
        sb.append(")");
        return sb.toString();
    }

    public C28223k(String str, Integer num, String str2) {
        this.f74336a = str;
        this.f74337b = num;
        this.f74338c = str2;
    }
}
