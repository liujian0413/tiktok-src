package com.p280ss.android.ugc.aweme.crossplatform.view;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.view.g */
public final class C26033g {

    /* renamed from: a */
    public final String f68812a;

    /* renamed from: b */
    public final String f68813b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f68813b, (java.lang.Object) r3.f68813b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.crossplatform.view.C26033g
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.crossplatform.view.g r3 = (com.p280ss.android.ugc.aweme.crossplatform.view.C26033g) r3
            java.lang.String r0 = r2.f68812a
            java.lang.String r1 = r3.f68812a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f68813b
            java.lang.String r3 = r3.f68813b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.view.C26033g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f68812a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f68813b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReactInstanceKey(channel=");
        sb.append(this.f68812a);
        sb.append(", bundle=");
        sb.append(this.f68813b);
        sb.append(")");
        return sb.toString();
    }

    public C26033g(String str, String str2) {
        C7573i.m23587b(str, "channel");
        C7573i.m23587b(str2, "bundle");
        this.f68812a = str;
        this.f68813b = str2;
    }
}
