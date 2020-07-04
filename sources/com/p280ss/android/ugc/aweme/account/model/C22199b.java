package com.p280ss.android.ugc.aweme.account.model;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.model.b */
public final class C22199b {

    /* renamed from: a */
    public String f59294a;

    /* renamed from: b */
    public final String f59295b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f59295b, (java.lang.Object) r3.f59295b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.account.model.C22199b
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.account.model.b r3 = (com.p280ss.android.ugc.aweme.account.model.C22199b) r3
            java.lang.String r0 = r2.f59294a
            java.lang.String r1 = r3.f59294a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f59295b
            java.lang.String r3 = r3.f59295b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.model.C22199b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f59294a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f59295b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BindMobileFinishOpe(phone=");
        sb.append(this.f59294a);
        sb.append(", response=");
        sb.append(this.f59295b);
        sb.append(")");
        return sb.toString();
    }

    public C22199b(String str, String str2) {
        C7573i.m23587b(str, "phone");
        C7573i.m23587b(str2, "response");
        this.f59294a = str;
        this.f59295b = str2;
    }
}
