package com.p280ss.android.ugc.aweme.userservice.jedi.p1690a;

/* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.e */
public final class C42857e {

    /* renamed from: a */
    public final String f111348a;

    /* renamed from: b */
    public final String f111349b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f111349b, (java.lang.Object) r3.f111349b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.userservice.jedi.p1690a.C42857e
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.userservice.jedi.a.e r3 = (com.p280ss.android.ugc.aweme.userservice.jedi.p1690a.C42857e) r3
            java.lang.String r0 = r2.f111348a
            java.lang.String r1 = r3.f111348a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f111349b
            java.lang.String r3 = r3.f111349b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.userservice.jedi.p1690a.C42857e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f111348a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f111349b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemarkRequestParam(userId=");
        sb.append(this.f111348a);
        sb.append(", remarkName=");
        sb.append(this.f111349b);
        sb.append(")");
        return sb.toString();
    }
}
