package com.p280ss.android.ugc.aweme.following.repository;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.following.repository.a */
public final class C29599a {

    /* renamed from: a */
    public final String f77954a;

    /* renamed from: b */
    public final Integer f77955b;

    /* renamed from: c */
    public final Integer f77956c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f77956c, (java.lang.Object) r3.f77956c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.following.repository.C29599a
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.following.repository.a r3 = (com.p280ss.android.ugc.aweme.following.repository.C29599a) r3
            java.lang.String r0 = r2.f77954a
            java.lang.String r1 = r3.f77954a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.Integer r0 = r2.f77955b
            java.lang.Integer r1 = r3.f77955b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.Integer r0 = r2.f77956c
            java.lang.Integer r3 = r3.f77956c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.following.repository.C29599a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f77954a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f77955b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f77956c;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectedRelationQueryParam(uid=");
        sb.append(this.f77954a);
        sb.append(", cursor=");
        sb.append(this.f77955b);
        sb.append(", count=");
        sb.append(this.f77956c);
        sb.append(")");
        return sb.toString();
    }

    public C29599a(String str, Integer num, Integer num2) {
        C7573i.m23587b(str, "uid");
        this.f77954a = str;
        this.f77955b = num;
        this.f77956c = num2;
    }
}
