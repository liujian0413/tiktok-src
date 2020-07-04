package com.p280ss.android.ugc.aweme;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.p */
public final class C21765p {

    /* renamed from: a */
    public final String f58279a;

    /* renamed from: b */
    public final String f58280b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f58280b, (java.lang.Object) r3.f58280b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.C21765p
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.p r3 = (com.p280ss.android.ugc.aweme.C21765p) r3
            java.lang.String r0 = r2.f58279a
            java.lang.String r1 = r3.f58279a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f58280b
            java.lang.String r3 = r3.f58280b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.C21765p.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f58279a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f58280b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BindMobileFinishData(phone=");
        sb.append(this.f58279a);
        sb.append(", response=");
        sb.append(this.f58280b);
        sb.append(")");
        return sb.toString();
    }

    public C21765p(String str, String str2) {
        C7573i.m23587b(str, "phone");
        C7573i.m23587b(str2, "response");
        this.f58279a = str;
        this.f58280b = str2;
    }
}
